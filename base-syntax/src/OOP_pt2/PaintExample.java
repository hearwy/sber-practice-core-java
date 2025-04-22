package OOP_pt2;

public class PaintExample {
    public static void main(String[] args) {
        Point center = new Point(5, 5);

        Circle circle = new Circle(center, 10);
        Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 6);
        Triangle triangle = new Triangle(new Point(1, 1), 3, 4, 5);
        Square square = new Square(new Point(2, 2), 5);

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.RED);

        FigureUtil.draw(rectangle);
        FigureUtil.draw(rectangle, Color.GREEN);

        FigureUtil.draw(triangle);
        FigureUtil.draw(triangle, Color.BLUE);

        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.YELLOW);

        System.out.println("Площадь круга: " + FigureUtil.area(circle));
        System.out.println("Периметр прямоугольника: " + FigureUtil.perimeter(rectangle));
        System.out.println("Площадь треугольника: " + FigureUtil.area(triangle));
        System.out.println("Периметр квадрата: " + FigureUtil.perimeter(square));
    }
}

