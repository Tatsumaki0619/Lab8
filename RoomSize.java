
/**
 * Write a description of class RoomSize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomSize
{
    private String name;
    private double length;
    private double width;
    
    public RoomSize(){
        
    }
    
    public RoomSize(String inName, double inLen, double inWidth){
        name = inName;
        length = inLen;
        width = inWidth;
    }
    
    public RoomSize(RoomSize object2){
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public String toString(){
        String ans = String.format("Room Name: %s\n" +
        "Length: %.2f\n" + "Width: %.2f\n", name, length, width); 
        //"The cost per sq ft is: $d%\n " + "The total cost is: $d%.2");
        // System.out.printf("Room Name: s%name\n" +
        // "Length: d%length\n" + "Width: d%width\n" + 
        // "The cost per sq ft is: $d% ");
        return ans;
    }
}
