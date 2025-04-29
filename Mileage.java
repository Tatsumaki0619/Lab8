
/**
 * This is a program that works as a blue print and calculates, provides inforamtion 
 * for the car's odometer and its mileage. This program will print out the odometer 
 * and remaining fuel as the car moving forward.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/29/2025
 */

public class Mileage
{
    private FuelGauge gauge;
    private int mileage, milesSinceAddingFuel = 0;
    
    /**
     * This works as an instructor, and it will initialize the value of gauge amd mileage for the car.
     */
    public Mileage(FuelGauge gauge, int mileage){
        this.gauge = new FuelGauge(gauge);
        this.mileage = mileage;
    }
    
    /**
     * This is a method that will calculate the odometer of the car, and print out the odometer and remaining fuel.
     */
    public void getMiles(){
        int returnAns = -1;
        while(gauge.FuelAmount() - (milesSinceAddingFuel-(milesSinceAddingFuel % 24))/24 != 0){
            milesSinceAddingFuel++;
            if(milesSinceAddingFuel + mileage <= 999999){
                returnAns = milesSinceAddingFuel + mileage;
            }
            else{
                returnAns = milesSinceAddingFuel + mileage - 1000000;
            }
            System.out.printf("Mileage:  %d, Fuel(Gal Left): %d\n",returnAns, getFuel());
        }
    }
    
    /**
     * This is a method that will calculate the remaining fuel in the tank
     * @return The value of the remaining fuel
     */
    public int getFuel(){
        return gauge.FuelAmount() - (milesSinceAddingFuel-(milesSinceAddingFuel % 24))/24;
    }
}