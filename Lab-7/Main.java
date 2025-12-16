// OOPs : Lab-7

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// class Rectangle{
//     public double length = 0;
//     public double width = 0;

//     double area(){
//         return length * width; 
//     }
//     void display(){
//         System.out.println("Length = " + length + "\n" + "Width = " + width + "\n" + "Area = " + (length * width));
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Rectangle obj1 = new Rectangle();
//         obj1.length = 12;
//         obj1.width = 10;
//         obj1.area();
//         obj1.display();

//     }
// }


// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// class ResidentialHouses{
//     int houseNumber = 0;
//     int rooms = 0;
//     boolean parking = false;
//     double price = 0;
// }

// public class Main{
//     public static void main(String[] args){
//         ResidentialHouses obj1 = new ResidentialHouses();
//         obj1.houseNumber = 12837;
//         obj1.rooms = 3;
//         obj1.parking = true;
//         obj1.price = 120000.0;
//         ResidentialHouses obj2 = new ResidentialHouses();
//         obj2.houseNumber = 17837;
//         obj2.rooms = 6;
//         obj2.parking = true;
//         obj2.price = 1203000.0;
//     }
// }


// Task - 3
// Abdul Basit Ali : 25SP-009-ST
class Nokia{
    int battery = 0;
    String storage = "64GB";

    void call(int number){
        System.out.println("Calling to " + number);
    }
    void playSong(){
        System.out.println("Song Playing...");
    }
}
public class Main{
    public static void main(String[] args){
        Nokia nokia = new Nokia();
        nokia.call(01223242234);
    }
}