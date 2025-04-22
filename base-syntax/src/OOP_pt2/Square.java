package OOP_pt2;

public class Square extends Rectangle {

    public Square(Point point, double sideLength) {
        super(point, sideLength, sideLength);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + width + " с углом в " + getPoint().toString();
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат с координатами " + getPoint().toString());
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован квадрат цвета " + color + " с координатами " + getPoint().toString());
    }
}

