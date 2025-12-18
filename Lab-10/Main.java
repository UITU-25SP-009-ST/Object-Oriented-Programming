// OOPs : Lab-10

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// Q.1: Create a class Student with fields String name and int id. Write a default constructor that sets name to "Unknown"
// and id to 0. In
// class Student{
//     String name;
//     int id;

//     public Student(){
//         this.name = "Unknown";
//         this.id = 0;
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Student st = new Student();
//         System.out.println("Name: " + st.name);
//         System.out.println("ID: " + st.id);
//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// class Student{
//     String name;
//     int id;

//     public Student(){
//         this.name = "Unknown";
//         this.id = 0;
//     }
//     public Student(String name){
//         this.name = name;
//         this.id = id;
//     }
//     public Student(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Student st1 = new Student();
//         Student st2 = new Student("Abdullah");
//         Student st3 = new Student("Zain" , 26);

//         System.out.println("Default Constructor: " + st1.name + " : " + st1.id);
//         System.out.println("Parameterized Constructor: " + st2.name + " : " + st2.id);
//         System.out.println("Parameterized Constructor: " + st3.name + " : " + st3.id);
//     }
// }


class Salan{
   public Salan(){
    System.out.println("This is Salan Constructor");
   } 
}
class Nihari extends Salan{
    public Nihari(){
    System.out.println("This is Nihari Constructor");
   } 
}
public class Main{
    public static void main(String[] args){
        Nihari n = new Nihari();
        
    }
}