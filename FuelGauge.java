
/**
 * This class works as a blue print and will provide the inforamtion of the value of the fuel in the car. 
 * It also allows other program to get a copy of the inforamtion that will be applied for further use 
 * for other methods out side this class.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/29/2025
 */
public class FuelGauge
{   
    private int fuel;
    
    /**
     * This is a constructor that will initializes the value of fuel in the car.
     * @param fuel the value of the fuel in the car
     */
    public FuelGauge(int fuel){
        this.fuel = fuel;
    }
    
    /**
     * This is a copy constructor that allows to copy the data from one object to another.
     * @param object2 The object with the information that needs to be copied
     */
    public FuelGauge(FuelGauge object2){
        fuel = object2.fuel;
    }
    
    /**
     * This is a method that will provide the value of the fuel for the car
     * @return the value of the fuel in the car
     */
    public int FuelAmount(){
        return fuel;
    }
}
