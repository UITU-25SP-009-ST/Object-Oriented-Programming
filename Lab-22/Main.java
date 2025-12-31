// OOPs : Lab-22

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// class Counter{
//     static int count;
//     int id;
//     Counter(int id){
//         count++;
//         this.id = id;
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Counter c1 = new Counter(1);
//         Counter c2 = new Counter(2);
//         Counter c3 = new Counter(3);
//         System.out.println("Instance ID : " + c1.id + ", Count : " + c1.count);
//         System.out.println("Instance ID : " + c2.id + ", Count : " + c2.count);
//         System.out.println("Instance ID : " + c3.id + ", Count : " + c3.count);
//     }
// }

// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// class MathUtil{
//     static void square(int x){
//         System.out.println("Square of " + x +  " = " + (x * x));
//     }
//     static void cube(int x){
// System.out.println("Cube of " + x +  " = " + ( (x * x) * x));

//  }
// }
// public class Main{
//     public static void main(String[] args){
//         MathUtil.square(2);
//         MathUtil.cube(3);
//     }
// }

// Task - 3
// Abdul Basit Ali : 25SP-009-ST
// Design a class Team that has a static field teamName (e.g. String). Inside Team, define a static nested class
// Member with a field for the member’s name. In main, set Team.teamName to some value, then create several
// Team.Member objects and print each member’s name along with Team.teamName to show how the static field is
// shared and accessed by the nested class.
class Team{
    static String teamName;
    public static class Member{
        String memberName;
        Member(String name){
            this.memberName = name;
            System.out.println("Team : " + Team.teamName + ", Member's name : " + name);
        }
    }
}
public class Main{
    public static void main(String[] args){
        Team.teamName = "Alpha";
        Team.teamName = "Beta";
        Team.teamName = "Gamma";
        Team.Member  t1 = new Team.Member("Jon");
        Team.Member  t2 = new Team.Member("Ralph");
        Team.Member  t3 = new Team.Member("Harry");
    }
}


// Task - 4
// Abdul Basit Ali : 25SP-009-ST
// class House {

//   private int address;

//   House(int a) {
//     this.address = a;
//   }

//   public class Door {

//     void showAddress() {
//       System.out.println("House address : " + address);
//     }
//   }
// }

// public class Main {

//   public static void main(String[] args) {
//     House h = new House(1232);
//     House.Door d = h.new Door();
//     d.showAddress();
//   }
// }
