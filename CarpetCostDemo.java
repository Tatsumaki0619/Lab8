import java.util.Scanner;

/**
 * This is a program that helps user to calculate the Room's area, 
 * the cost of the carpet used for rooms. The user needs to provide length,
 * width, the cost for carpet per square foot.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/25/2025
 */

public class CarpetCostDemo
{
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        
        do{
        System.out.print("Enter room name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter room length: ");
        double length = keyboard.nextDouble();
        System.out.print("Enter room width: ");
        double width = keyboard.nextDouble();
        RoomSize size = new RoomSize(name, length, width);
        
        System.out.print("Enter cost per square foot: ");
        double costPerFoot = keyboard.nextDouble();
        CarpetCost cost = new CarpetCost(size, costPerFoot);
        
        System.out.println();
        System.out.print(size.toString());
        System.out.print(cost.toString());
        
        System.out.print("Whould you like to calculate another room? (enter yes/no to continue)");
        }while(keyboard.next().equalsIgnoreCase("yes"));
    }
}
