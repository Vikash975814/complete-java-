public class LabManual {
    public static void main(String s[]){
        Command d=new Command();
        System.out.println("Sum is= "+d.numbers(s));
    }
}
import java.util.*;
class Room {
int roomno;
String roomtype,roomarea,ACmachine;
void setdata(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Room no");
    roomno=sc.nextInt();
    System.out.print("Enter the Room Type");
    roomtype=sc.next();
    System.out.print("Enter the Room Area");
    roomarea=sc.next();
    System.out.print("Enter the AC Machine");
    ACmachine=sc.next();
}
void displaydata(){
    System.out.println("Your Room Detail is:");
    System.out.println(" Room no is= "+roomno);
    System.out.println("Room TYpe is = "+roomtype);
    System.out.println("Room Area is = "+roomarea);
    System.out.println("AC Machine is = "+ACmachine);
}
}
public class LabManual{
    public static void main(String s[]){
  Room r=new Room();
  r.setdata();
  r.displaydata();
    }
}
