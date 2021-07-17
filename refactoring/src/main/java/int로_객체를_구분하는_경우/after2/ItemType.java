package int로_객체를_구분하는_경우.after2;

public enum ItemType {
    BOOK(0),
    DVD(1),
    SOFTWARE(2);

    private int _typecode;

    ItemType(int typecode) {
        _typecode = typecode;
    }

    public int getTypecode() {
        return _typecode;
    }
}
