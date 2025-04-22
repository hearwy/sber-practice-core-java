package OOP_pt2;

public class Circle extends Figure implements Drawable {
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius + " и центром в " + point.toString();
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг с координатами " + point.toString());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован круг цвета " + color + " с координатами " + point.toString());
    }
}
