// OOPs : Lab-13

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// Q.1: Create a Student class with fields String name and int age. Include a constructor, a display()
// method, and a birthday(Student s) method that takes a Student object and increments its age. In
// main, create two students, pass one to birthday, and display before/after to observe changes.
// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     void display(){
//         System.out.println("Name : " + name + " , Age : " + age );
//     }
//     void birthday(Student s){
//         s.age++;
//     }

// }
// public class Main{
//     public static void main(String[] args){
//         Student s1 = new Student("jane" , 12);
//         // Student s2 = new Student();
//         s1.birthday(s1);
//         s1.display();
//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// Q.2: Extend Student with a isOlder(Student other) method that takes another Student and returns
// true if the current object's age is greater. In main, create objects, pass them, and print results.

// recheck
// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     void display(){
//         System.out.println("Name : " + name + " , Age : " + age );
//     }
//     void birthday(Student s){
//         s.age++;
//     }
//     boolean isOlder(Student o){
//         if(this.age < o.age){
//             return true;
//         }
//         return false;
//     }

// }
// public class Main{
//     public static void main(String[] args){
//         Student s1 = new Student("jane" , 12);
//         s1.display();
//         s1.birthday(s1);
//         s1.display();
//         System.out.println(s1.isOlder(s1));
//     }
// }


// Q.3: Add a cloneWithNewName(String newName) method to Student that returns a new Student
// with the same age but updated name. In main, call it and display both original and returned
// objects.
// Task - 3
// Abdul Basit Ali : 25SP-009-ST
// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     void display(){
//         System.out.println("Name : " + name + " , Age : " + age );
//     }
//     void birthday(Student s){
//         s.age++;
//     }
//     boolean isOlder(Student o){
//         if(this.age < o.age){
//             return true;
//         }
//         return false;
//     }
//     Student cloneWithNewName(String newName){
//         return new Student(newName , this.age);
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Student s1 = new Student("jane" , 12);
//         s1.display();
//         Student s2 = s1.cloneWithNewName("Harry");
//         s2.display();
//     }
// }


// Task - 4
// Abdul Basit Ali : 25SP-009-ST
// Q.4: Create a Rectangle class with width and height. Add a scale(double factor) method that returns
// a new Rectangle with dimensions multiplied by factor. Demonstrate in main by scaling and
// displaying areas.
// class Rectangle{
//     double width;
//     double height;
//     Rectangle(double width , double height){
//         this.width = width;
//         this.height = height;
//     }
//     Rectangle scale(double factor){
//         return new Rectangle( (this.width * factor) , (this.width * factor));
//     }
//     void getArea(){
//         System.out.println("Area : " + (height * width));
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Rectangle r1 = new Rectangle(20, 20);
//         Rectangle r2 = r1.scale(2);
//         r2.getArea();
//     }
// }


// Task - 5
// Abdul Basit Ali : 25SP-009-ST
// class Rectangle{
//     double width;
//     double height;
//     Rectangle(double width , double height){
//         this.width = width;
//         this.height = height;
//     }
//     Rectangle scale(double factor){
//         return new Rectangle( (this.width * factor) , (this.width * factor));
//     }
//     void getArea(){
//         System.out.println("Area : " + (height * width));
//     }
//     Rectangle merge(Rectangle other){
//         return new Rectangle(this.width + other.width, this.height + other.height);
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Rectangle r1 = new Rectangle(20, 20);
//         Rectangle r2 = r1.scale(2);
//         Rectangle r3 = r1.merge(r2).scale(2);
//         System.out.println(r1.width);
//         System.out.println(r2.width);
//         System.out.println(r3.width);
//     }
// }