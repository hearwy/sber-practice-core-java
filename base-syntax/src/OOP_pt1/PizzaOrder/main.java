package OOP_pt1.PizzaOrder;

public class main {
    public static void main(String[] args) {
        PizzaOrder order_z = new PizzaOrder("Аль-Капчоне", PizzaSize.BIG, true, "Ярославская 101");

        order_z.order();

        order_z.order();

        order_z.cancel();

        order_z.cancel();

        order_z.order();
    }
}

