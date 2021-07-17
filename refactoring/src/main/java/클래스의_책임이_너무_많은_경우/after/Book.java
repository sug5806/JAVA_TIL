package 클래스의_책임이_너무_많은_경우.after;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public Book(String title, String isbn, String price, String authorName, String authorMail) {
        _title = title;
        _isbn = isbn;
        _price = price;
        _author = new Author(authorName, authorMail);
    }

    public String getTitle() {
        return _title;
    }

    public String getIsbn() {
        return _isbn;
    }

    public String getPrice() {
        return _price;
    }

    public String getAuthorName() {
        return _author.getName();
    }

    public void setAuthorName(String name) {
        _author.setName(name);
    }

    public String getAuthorMail() {
        return _author.getMail();
    }

    public void setAuthorMail(String mail) {
        _author.setMail(mail);
    }

    public String toXml() {
        String author =
                tag("author", tag("name", _author.getName()) + tag("mail", _author.getMail()));
        String book =
                tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
    // ...
}

class Author {
    private String _name;
    private String _mail;

    public Author(String _name, String _mail) {
        this._name = _name;
        this._mail = _mail;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getMail() {
        return _mail;
    }

    public void setMail(String _mail) {
        this._mail = _mail;
    }
}