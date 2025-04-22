package OOP_pt1.PizzaOrder;

public enum PizzaSize {
    SMALL("Маленькая пицца"),
    MEDIUM("Средняя пицца"),
    BIG("Большая пицца");

    private final String token;

    PizzaSize(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return this.token;
    }
}
