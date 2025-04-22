package OOP_pt2;

public class FigureUtil {

    private FigureUtil() { } // Приватный конструктор

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Drawable figure) {
        figure.draw();
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}


