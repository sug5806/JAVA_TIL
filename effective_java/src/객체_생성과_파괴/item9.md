# try-finally보다는 try-with-resources를 사용하라.

try-finally는 더이상 자원을 회수하는 최선의 방책이 아니다.

```java
static String firstLineOfFile(String path)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(path));
        try{
        return br.readLine();
        }finally{
        br.close();
        }
        }
```

나쁘지않지만 자원을 하나 더 사용하면?

```java
static void copy(String src,String dst)throws IOException{
        InputStream in=new FileInputStream(src);
        try{
        OutputStream out=new FileOutputStream(dst);
        try{
        byte[]buf=new byte[BUFFER_SIZE];
        int n;
        while((n=in.read(buf))>=0)
        out.write(buf,0,n);
        }finally{
        out.close();
        }finally{
        in.close();
        }
        }
        }
```

try-with-resources : 자원을 회수하는 최선책이다.

```java
static String firstLineOfFile(String path)throws IOException{
        try(BufferedReader br=new BufferedReader(
        new FileReader(path))){
        return br.readLine();
        }
        }
```

복수의 자원에도 적용할 수 있다.

```java
static void copy(String src,String dst)throws IOException{
        try(InputStream in=new FileInputStream(src);
        OutputStream out=new FileOutputStream(dst)){
        byte[]buf=new byte[BUFFER_SIZE];
        int n;
        while((n=in.read(buf))>=0)
        out.write(buf,0,n);
        }
        }
```

try-with-resources를 catch 절과 함께 쓰는 모습

```java
static String firstLineOfFile(String path,String defaultVal){
        try(BufferedReader br=new BufferedReader(
        new FileReader(path))){
        return br.readLine();
        }catch(IOException e){
        return defaultVal;
        }
        }
```