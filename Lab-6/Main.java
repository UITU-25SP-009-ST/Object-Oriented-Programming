// OOPs : Lab-6

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;

// public class Main {

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.print("Enter First Name : ");
//     String fName = in.nextLine();
//     System.out.print("Enter Last Name : ");
//     String lName = in.nextLine();
//     System.out.println(fName + " " + lName);
//     System.out.println(fName.toUpperCase() + " " + lName.toUpperCase());

//     System.out.println(
//       "Length of Full Name : " + (fName.length() + lName.length())
//     );
//     String substring = "smith";
//     lName = lName.toLowerCase();
//     int n = 0;
//     boolean flag = false;
//     for (int i = 0; i < lName.length(); i++) {
//       if (lName.charAt(i) == substring.charAt(n)) {
//         n++;
//       }
//     }
//     if (n == 5) {
//       flag = true;
//       System.out.println("Last Name Contains Substring \"smith\".");
//     } else if (flag == false) {
//       System.out.println("Last Name Doesn't Contains Substring \"smith\".");
//     }
//   }
// }
// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a word : ");
//         String word = in.nextLine();
//         boolean flag = false;
//         for (int i = 0; i < word.length(); i++) {
//             if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//                 flag = false;
//                 break;
//             } else {
//                 flag = true;
//             }
//         }
//         if (flag == true) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not a Palindrome");
//         }
//     }
// }
// Task - 3
// Abdul Basit Ali : 25SP-009-ST
// public class Main {

//   public static void main(String[] args) {
//     String text = "the quick brown fox jumps over the lazy dog.";
//     char ch = ' ';
//     int count = 0;
//     String first = null;
//     String last = null;
//     for (int i = 0; i < text.length(); i++) {
//       if (text.charAt(i) == ch) {
//         count++;
//         if (count == 1) {
//           first = text.substring(0, i);
//         }
//       }
//       if (ch == text.charAt(text.length() - 1 - i) && last == null) {
//         last = text.substring(text.length() - i, text.length() - 1);
//       }
//     }
//     System.out.println("Number of Words : " + (count + 1));
//     System.out.println(
//       "First word \"" + first + "\" & Last word \"" + last + "\""
//     );
//     System.out.println(text.replaceAll("the", "a"));
//   }
// }
// Task - 4
// Abdul Basit Ali : 25SP-009-ST
public class Main {

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("");
    for (int i = 1; i <= 10; i++) {
      str.append(" Iteration-#" + i);
    }
    str.insert(0, "Start of log: ");
    str.delete(139, 144);
    System.out.println(str);
  }
}
