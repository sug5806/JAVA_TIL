package 위임_대상까지_노출되어_있는_경우.before;

import java.util.Enumeration;

public class AddressFile {
    private final Database _database;

    public AddressFile(String filename) {
        _database = new Database(filename);
    }

    public Database getDatabase() {
        return _database;
    }

    public Enumeration names() {
        return _database.getProperties().propertyNames();
    }
}