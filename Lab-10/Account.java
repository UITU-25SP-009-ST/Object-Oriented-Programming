// That it stores an account number (or name) and allows manipulation of the balance
public class Account{
    private String name;
    private double balance; 
    Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance += balance;
        }
    }
    void deposit(double amount){
        if(amount > 0.0){
            balance += amount;
        }
        else{
            System.out.println("Invalid Amount!");
        }
    }
    void getBalance(){
        System.out.println("Your current balance : " + balance);
    }
    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println("Account holder's name : " + name);
    }
}