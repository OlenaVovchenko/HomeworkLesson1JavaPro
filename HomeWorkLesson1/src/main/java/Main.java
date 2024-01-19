import modul1.lecture1.modul1.lecture1.Person;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(12, "Model1", 150);
        Phone phone2 = new Phone(98, "Model2", 200);
        Phone phone3 = new Phone(56, "Model3", 175);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("МАМА");
        System.out.println("  Номер телефона: " + phone1.getNumber());
        phone2.receiveCall("Александр");
        System.out.println("  Номер телефона: " + phone2.getNumber());
        phone2.receiveCall("Вика");
        System.out.println("  Номер телефона: " + phone3.getNumber());




    }
}