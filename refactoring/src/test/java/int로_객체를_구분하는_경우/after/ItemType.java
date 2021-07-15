package int로_객체를_구분하는_경우.after;

public class ItemType {
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private int _typecode;

    private ItemType(int typecode) {
        _typecode = typecode;
    }

    public static ItemType getItemType(int typecode) {
        switch (typecode) {
            case 0:
                return BOOK;
            case 1:
                return DVD;
            case 2:
                return SOFTWARE;
            default:
                return null;
        }
    }

    public int getTypecode() {
        return _typecode;
    }
}
