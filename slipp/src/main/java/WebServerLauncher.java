import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class WebServerLauncher {

    public static void main(String[] args) throws Exception {

        String webappDirLocation = "slipp/webapp/";
        Tomcat tomcat = new Tomcat();
        String webPort = System.getenv("PORT");

        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }

        tomcat.setPort(Integer.parseInt(webPort));

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
