// OOPs : Lab-3

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = in.nextInt();
//         System.out.println((n % 2 == 0) ? "Even" : "Odd");
//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int a = in.nextInt();
            System.out.print("Enter first number : ");
            int b = in.nextInt();
            System.out.println(a > b ? a + " is Greater" : a < b ? b + " is Greater" : "Equal");
        }
    }
