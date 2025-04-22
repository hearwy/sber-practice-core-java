package OOP_pt2;

public class Rectangle extends Figure implements Drawable {
    protected double width;
    protected double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной " + width + " и высотой " + height + " с углом в " + point.toString();
    }

    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник с координатами " + point.toString());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник цвета " + color + " с координатами " + point.toString());
    }
}