package 생성자를_팩토리_메서드로_치환.after;

public class ShapeRectangle extends Shape {
    public ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }
}
