package 생성자를_팩토리_메서드로_치환.after;

public abstract class Shape {
    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    protected Shape(int startx, int starty, int endx, int endy) {
        _startx = startx;
        _endx = endx;
        _starty = starty;
        _endy = endy;
    }

    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + _startx + ", " + _starty + ")-"
                + "(" + _endx + ", " + _endy + ") ]";
    }

    public abstract String getName();

    public abstract void draw();

}