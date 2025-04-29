import java.util.Scanner;

/**
 * This is a program that will calculate the car's odometer and the remaining guel 
 * by pringting out the value for both while the car is moving forward. 
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/29/2025
 */
public class OdometerDemo
{
    public static void main(String []args){
        int fuelLevel, odometer, carCount = 1;
        final int MAX_FUEL = 15;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.printf("Please enter Car%d gas level: ", carCount);
            fuelLevel = keyboard.nextInt();
            System.out.printf("Please enter Car%d current odometer: ", carCount);
            odometer = keyboard.nextInt();
            System.out.printf("\nCar%d gas level: %d\n\n", carCount, fuelLevel);
            System.out.printf("Car%d is filling up\n\n", carCount);
            System.out.printf("Car%d is off\n\n", carCount);
            System.out.println("------------------\n");

            FuelGauge gauge = new FuelGauge(MAX_FUEL);
            Mileage mile = new Mileage(gauge, odometer);
            mile.getMiles();
            carCount++;
            System.out.println("Out of gas!\n");
            System.out.print("Please enter 'yes' to calculate a new car: ");
        }while(keyboard.next().equalsIgnoreCase("YES"));
    }
}
