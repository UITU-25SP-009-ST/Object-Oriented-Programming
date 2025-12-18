// OOPs : Lab-19

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
class Salan{
   public Salan(){
    System.out.println("This is Salan Constructor");
   } 
   public Salan(String msg){
    System.out.println("This is Salan Constructor with message: " + msg);
   }
}
class Nihari extends Salan{
    public final int age;
    public Nihari(){
    this("hello");
    // super("This is message from Nihari");
   } 
   public Nihari(String msg){
    System.out.println("This is Nihari Constructor with message: " + msg);
   }
}
class Biryani extends Nihari{
    public Biryani(){
    System.out.println("This is Biryani Constructor");
    // new Biryani();
   } 
}
public class Main{
    public static void main(String[] args){
        Biryani n = new Biryani();
        Nihari n2 = new Nihari("Hello from Nihari");
    }
}