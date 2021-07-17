package 생성자를_팩토리_메서드로_치환.after;

public class ShapeOval extends Shape {
    public ShapeOval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }
}
