// OOPs : Lab-10
//To be continue...

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// class Person {
//     String name;
//     int age;
//     Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     Person(Person instance){
//         this.name = instance.name;
//         this.age = instance.age;
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Person p1 = new Person("Jon" , 30);
//         Person p2 = new Person(p1);
//         p1.name = "harry";
//         p1.age = 40;
//         System.out.println("Orignal object : " + p1.name + " , " + p1.age );
//         System.out.println("Shallow copied object : " + p2.name + " , " + p2.age );
//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
class Address{
    String street;
    Address(String s){
        this.street = s;
    }
}
class Person extends Address{
    String name;
    int age;
    Address address;
    Person(String name, int age , Address addr){
        this.name = name;
        this.age = age;
        this.address = addr;
    }
    Person(Person instance){
        this.name = instance.name;
        this.age = instance.age;
    }
}
public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Jon" , 30, new Address());
        Person p2 = new Person(p1);
        p1.name = "harry";
        p1.age = 40;
        System.out.println("Orignal object : " + p1.name + " , " + p1.age );
        System.out.println("Shallow copied object : " + p2.name + " , " + p2.age );
    }
}