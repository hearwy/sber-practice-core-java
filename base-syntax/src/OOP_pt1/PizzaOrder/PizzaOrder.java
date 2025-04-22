package OOP_pt1.PizzaOrder;

public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean needsSauce;
    private String deliveryAddress;
    private boolean orderAccepted;

    public PizzaOrder(String name, PizzaSize size, boolean needsSauce, String deliveryAddress) {
        this.name = name;
        this.size = size;
        this.needsSauce = needsSauce;
        this.deliveryAddress = deliveryAddress;
        this.orderAccepted = false;
    }

    public void order() {
        if (!orderAccepted) {
            orderAccepted = true; // Заказ принят
            System.out.println("Заказ принят. " + toString());
        } else {
            System.out.println("Заказ уже принят.");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            orderAccepted = false; // Заказ отменен
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public boolean isNeedsSauce() {
        return needsSauce;
    }

    public void setNeedsSauce(boolean needsSauce) {
        this.needsSauce = needsSauce;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return this.size + " " + this.name + " " + (this.needsSauce ? "с соусом" : "без соуса") + " на адрес " + this.deliveryAddress;
    }
}
