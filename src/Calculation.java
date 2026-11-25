import java.util.Scanner;
public class Calculation{
     private Scanner mate = new Scanner(System.in);
    double b;
    double c;
    public void KgLbs(){
        System.out.print("Enter your weight in kg:");
        double weight_kg = mate.nextDouble();
        b = weight_kg * 2.2;
        System.out.println("Your weight in Lbs is: " +Math.floor(b) );
    }
    public void LbsKg(){
        System.out.print("Enter your weight in lbs:");
        double weight_lbs = mate.nextDouble();
        c = weight_lbs / 2.2;
        System.out.println("Your weight in kg is: " +Math.floor(c) );
    }

}