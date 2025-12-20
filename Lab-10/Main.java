// OOPs : Lab-10

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
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
class Student {
  String name;
  int id;
  public Student() {
    this.name = "Unknown";
    this.id = 0;
  }
  public Student(String name) {
    this.name = name;
    this.id = id;
  }
  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }
}
public class Main {
  public static void main(String[] args) {
    Student st1 = new Student();
    Student st2 = new Student("Abdullah");
    Student st3 = new Student("Zain", 26);

    System.out.println("Default Constructor: " + st1.name + " : " + st1.id);
    System.out.println("Parameterized Constructor: " + st2.name + " : " + st2.id);
    System.out.println("Parameterized Constructor: " + st3.name + " : " + st3.id);
  }
}
// public class Main{
//         public static void main(String[]args){
//                 Main dm = new Main();
//                 dm = null;
//                 System.gc();
//                 System.out.println("In the Main Method" + dm);
//                 Main.method();
//         }
//         protected static void method(){
//                 System.out.println("Object is garbage collected");
//         }
// }
