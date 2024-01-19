package modul1.lecture1.modul1.lecture1;

public class Obgect {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();

        Person person2 = new Person("Olena",44);
        person2.talk();
    }

}
// 1 уровень сложности: 1.Класс module1.lecture1.module1.lecture1.Person
//         Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//         переменные fullName, age;
//         методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//         Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
//         Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)