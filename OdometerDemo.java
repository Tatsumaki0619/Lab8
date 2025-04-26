import java.util.Scanner;

/**
 * Write a description of class odometerdemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OdometerDemo
{
    public static void main(String []args){
        int fuelLevel, odometer, carCount = 1;
        final int MAX_FUEL = 15;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.printf("Please enter car%d gas level: ", carCount);
            fuelLevel = keyboard.nextInt();
            System.out.printf("Please enter car%d current odometer: ", carCount);
            odometer = keyboard.nextInt();
            System.out.printf("Car%d gas level: %d\n", carCount, fuelLevel);
            System.out.printf("Car%d is filling up\n", carCount);
            System.out.printf("Car%d is off\n", carCount);
            System.out.println("------------------");

            FuelGauge gauge = new FuelGauge(MAX_FUEL);
            Mileage mile = new Mileage(gauge, odometer);
            mile.getMiles();
            carCount++;
            System.out.print("Please enter 'yes' to calculate a new car: ");
        }while(keyboard.next().equalsIgnoreCase("YES"));
    }
}
