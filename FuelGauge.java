
/**
 * Write a description of class FuelGauge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FuelGauge
{   
    private int fuel;
    
    public FuelGauge(int fuel){
        this.fuel = fuel;
    }
    
    public FuelGauge(FuelGauge object2){
        fuel = object2.fuel;
    }
    
    public int FuelAmount(){
        return fuel;
    }
}
