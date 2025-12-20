
public class AccountDemo{
    public static void main(String[] agrs){
        Account a1 = new Account("harry" , 120300);
        Account a2 = new Account("Jon" , 0.0);
        Account a3 = new Account("fin" , 1282386);

        a1.getName();
        a1.getBalance();
        a1.deposit(12342);
        a2.getName();
        a2.getBalance();
        a2.deposit(0);
        a3.setName("Doe");
        a3.getBalance();
        a3.deposit(0);
    }
}