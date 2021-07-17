package int로_객체를_구분하는_경우.after;

public class Item {
    private final ItemType _itemtype;
    private final String _title;
    private final int _price;

    public Item(ItemType itemType, String title, int price) {
        _itemtype = itemType;
        _title = title;
        _price = price;
    }

    public int getTypecode() {
        return _itemtype.getTypecode();
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ "
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }
    // ...
}
