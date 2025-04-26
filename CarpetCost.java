
/**
 * This is a program that works as a blueprint to calculate the total cost 
 * for the carpet's total cost.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/25/2025
 */
public class CarpetCost
{
    private double costPerSqFt;
    RoomSize size;
    /**
     * This is a constructor that initializes the room size and the cost of carpet per square foot.
     * param1 area The area of the room to be calculated
     * param2 cost The cost of the carpet per square foot
     */
    public CarpetCost(RoomSize area, double cost){
        costPerSqFt = cost;
        size =new RoomSize(area);
        //System.out.printf("The total cost is: $%d.2", total);
    }
    
    /**
     * This is a method that will calculate the total cost of the carpet for the room and return the answer
     * @return the total cost of the ccarpet
     */
    public double getCost(){
        return size.getArea() * costPerSqFt;
    }
    
    public String toString(){
        String ans = String.format("The cost per sq ft is: $%.2f\n" + 
        "The total cost is: $%.2f\n", costPerSqFt, getCost());
        return ans;
    }
}
