package modul1.lecture1.modul1.lecture1;

public class Person {
    String fullName;
    int age;

   Person(){};
   public Person(String fullName, int age){
       this.fullName = fullName;
       this.age = age;
   }




    void move(){
        System.out.println("move  module_1.lecture_1.module_1.lecture_1.Person говорит");
    }
    void talk(){
        System.out.println("talk  module_1.lecture_1.module_1.lecture_1.Person говорит");
    }
}
