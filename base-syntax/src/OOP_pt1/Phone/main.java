package OOP_pt1.Phone;

public class main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "IPhone 16", 170);
        Phone phone2 = new Phone("89238827238", "Google Pixel 9 pro XL");
        Phone phone3 = new Phone();

        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария", phone2.toString());

        System.out.println("Номер телефона " + phone1.getModel() + ": " + phone1.getNumber());

        String[] numbersToSendMessages = {"88005553535", "89238827238"};
        phone1.sendMessage(numbersToSendMessages);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}

