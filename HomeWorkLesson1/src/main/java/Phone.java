//2.Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.


public class Phone {
    int number;
    String model;
    int weight;
//    public Phone(){};
    public Phone (int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
void receiveCall(String callerName){
    System.out.print("Звонит " + callerName);
}

int getNumber(){
        return number;
}
//    public Phone(int number, String model) {
//        this.number = number;
//        this.model = model;
//    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
