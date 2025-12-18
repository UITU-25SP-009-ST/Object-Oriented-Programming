// OOPs : Lab-8

// Example
// class Temp {
// public Temp() { System.out.println("Temp created"); }
//  void method(){
//     System.out.println("Object Accessed!!!");
//  }
// }

// public class Main {
// public static Temp createTemps() {
// Temp t1 = new Temp(); // reachable inside the method
// return t1;
// when this method returns, t1 and t2 references go out of scope — objects become unreachable
// }  


// public static void main(String[] args) {
// Temp t1 = createTemps();
// t1.method();
// System.out.println("Returned from createTemps(); objects created inside are now eligible for GC if not referenced elsewhere.");
// }
// }



// Task - 1
// Abdul Basit Ali : 25SP-009-ST
class Student{
    private String name;
    private String ID;

    Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }
    void introduce(){
        System.out.println("Hi, I'm " + name + ", id = " + ID);
    }
}
class Main{
    public static void main(String[] args){
        Student st = new Student("Abdul Basit Ali", "25SP-009-ST");
        st.introduce();
    }
}

// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// class BankAccount{
//     private double balance = 0;
//     public BankAccount(double initial){
//         this.balance = initial;
//     }
//     public void deposit(double amount){
//         this.balance += amount;
//         System.out.println("Deposited: " + amount);
//     }
//     public boolean withdraw(double amount){
//         if(amount <= balance){
//             System.out.println("Withdrawn: " + amount);
//             this.balance -= amount;
//             return true;
//         }
//         System.out.println("Insufficient Balance!");
//         return false;
//     }
//     public double getBalance(){
//         System.out.println("Current Balance: " + balance);
//         return balance;
//     }
// }
// class Main{
//     public static void main(String[] args){
//         BankAccount b1 = new BankAccount(100000);
//         BankAccount b2 = new BankAccount(60000);

//         b1.deposit(70000);
//         b1.getBalance();

//         b2.withdraw(30000);
//         b2.getBalance();

        // BankAccount b3 = new BankAccount(100000);
        // BankAccount b4 = b3;
        // BankAccount b5 = b3;

        // b4.deposit(20000);
        // b4.getBalance();

        // b5.withdraw(30000);
        // b5.getBalance();
//     }
// }