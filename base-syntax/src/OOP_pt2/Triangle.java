package OOP_pt2;

public class Triangle extends Figure implements Drawable {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point point, double sideA, double sideB, double sideC) {
        super(point);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами " + sideA + ", " + sideB + ", " + sideC + " с углом в " + point.toString();
    }

    @Override
    public void draw() {
        System.out.println("Нарисован треугольник с координатами " + point.toString());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован треугольник цвета " + color + " с координатами " + point.toString());
    }
}

