package OOP_pt1.Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("Неизвестно", "Неизвестно", 0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Сообщения отправлены на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Телефон: " + number + ", Модель: " + model + ", Вес: " + weight + " г";
    }
}

