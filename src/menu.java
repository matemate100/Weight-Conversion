import java.util.Scanner;
public class menu{
    private Scanner mate = new Scanner(System.in);
    public int GetChoice(){
        System.out.println("JAVA WEIGHT CONVERSION PROGRAM");
        System.out.println("1. KG TO Lbs ");
        System.out.println("2. Lbs TO kG  ");

        System.out.print("Enter your choice: ");
        int choice = mate.nextInt();
        return choice;
    }


}
