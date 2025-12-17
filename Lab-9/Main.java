// OOPs : Lab-7

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// class Alpha{
//     public int a = 12;
//     private int b = 21;
// }
// class Main{
//     public static void main(String[] args){
//         Alpha al = new Alpha();
//         System.out.println(al.a);
//         System.out.println(al.b);
//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
class Parent{
    protected int age = 30;
    public void method(){
        System.out.println(age); 
    }
}
class Child extends Parent{
    void display(){
        System.out.println(age);
    }
}
class Main{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}
// In Child, write a method or the main method that accesses message
// directly. Does it compile?
// If we try to access from subclass it will accessable, but from main method it will not be accessible.

// Task - 3
// Abdul Basit Ali : 25SP-009-ST
