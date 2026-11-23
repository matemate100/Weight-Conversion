import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner mate = new Scanner(System.in);
        double b;
        double c;
        System.out.println("JAVA WEIGHT CONVERSION PROGRAM");
        System.out.print("1. KG TO Lbs ");
        System.out.print("2. Lbs TO kG  ");
        mate.nextLine();
        System.out.println("Enter your choice: ");
        int Choice = mate.nextInt();
        if(Choice == 1){
            System.out.println("Enter your weight in kg:");
            double weight_kg = mate.nextDouble();
            b = weight_kg * 2.2;
            System.out.println("Your weight in Lbs is: " +Math.floor(b) );
        }
        else if(Choice == 2){
            System.out.println("Enter your weight in lbs:");
            double weight_lbs = mate.nextDouble();
            c = weight_lbs / 2.2;
            System.out.println("Your weight in kg is: " +Math.floor(c) );
        }
        else{
            return;
        }
        mate.close();

    }
}