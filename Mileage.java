
/**
 * Write a description of class Mileage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Mileage
{
    private FuelGauge gauge;
    private int mileage, milesSinceAddingFuel = 0;

    public Mileage(FuelGauge gauge, int mileage){
        this.gauge = new FuelGauge(gauge);
        this.mileage = mileage;
    }

    public void getMiles(){
        while(gauge.FuelAmount() - (milesSinceAddingFuel-(milesSinceAddingFuel % 24))/24 != 0){
            milesSinceAddingFuel++;
            System.out.printf("Mileage:  %d, Fuel(Gal Left): %d\n",milesSinceAddingFuel + mileage, gauge.FuelAmount() - (milesSinceAddingFuel-(milesSinceAddingFuel % 24))/24);
        }
    }
}
