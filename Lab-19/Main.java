// OOPs : Lab-19

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// class Salan{
//    public Salan(){
//     System.out.println("This is Salan Constructor");
//    } 
//    public Salan(String msg){
//     System.out.println("This is Salan Constructor with message: " + msg);
//    }
// }
// class Nihari extends Salan{
//     public final int age;
//     public Nihari(){
//     this("hello");
//     // super("This is message from Nihari");
//    } 
//    public Nihari(String msg){
//     System.out.println("This is Nihari Constructor with message: " + msg);
//    }
// }
// class Biryani extends Nihari{
//     public Biryani(){
//     System.out.println("This is Biryani Constructor");
//     // new Biryani();
//    } 
// }
// public class Main{
//     public static void main(String[] args){
//         Biryani n = new Biryani();
//         Nihari n2 = new Nihari("Hello from Nihari");
//     }
// }

// class Person {
// private final String name;
// Person(String name) { this.name = name; }
// }

// class Student extends Person {
// private final int id;
// Student(String name) {
// this(name, 0); // chain to common constructor
// }
// Student(String name, int id) {
// super(name);
// this.id = id;
// }
// }
// public class Main{
//     public static void main(String[] args){
//         Student s = new Student("Alice", 101);
//     }
// }


// class Chawal{
//     void addingRaita(){
//         System.out.println("adding raita to chawal");
//     }
// }

// class Pilao extends Chawal{
//     void addingRaita(){
//         System.out.println("adding raita to pilao");
//     }
//          public void puttingBeef(){
//         System.out.println("adding zero boti");
//     }
//     public int puttingBeef(int boti){
//         System.out.println(boti + "adding number");
//         return boti;
//     }
// }
class Animal{
}
class Dog{

}
class Cat{

}
class loin{

}
public class Main{
    public static void main(String[] args){
        // Pilao p = new Pilao();
        // // p.puttingBeef();
        // // p.puttingBeef(5);
        // p.addingRaita();
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Loin l = new Loin();
        Animal[] arr = {a,d,c,l}; 
    }
}




