
/**
 * This is a program working as a blue print that calculates the area and outprint for the further calculation
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/25/2025
 */
public class RoomSize
{
    private String name;
    private double length;
    private double width;
    
    /**
     * This is a constructor that initializes the room's name, length and width.
     */
    public RoomSize(String inName, double inLen, double inWidth){
        name = inName;
        length = inLen;
        width = inWidth;
    }
    
    /**
     * This is a constructor that works as a copy method for passing data to another method
     * @param object2 This object will provide the data that needs to be copied
     */
    public RoomSize(RoomSize object2){
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }
    
    /**
     * This is a method that will calculate the area of the room based on the length and width provdied by the user.
     * @return The area of the room 
     */
    public double getArea(){
        return length * width;
    }
    
    /**
     * This is a toString method that will generate the output for the room's inforamtion including the name, width and length
     * @return the outprint of the room's information
     */
    public String toString(){
        String ans = String.format("Room Name: %s\n" +
        "Length: %.1f\n" + "Width: %.1f\n" + "Area: %.2f\n", name, length, width, getArea()); 
        return ans;
    }
}
