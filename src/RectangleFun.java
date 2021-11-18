import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);
        Rectangle square = new Rectangle();
        // Get input for x, y, width, and height. Create four separate variables for these.
        System.out.println("Please enter the x");
        int x = scan.nextInt();
        System.out.println("Please enter the y");
        int y = scan.nextInt();
        System.out.println("Please enter the width");
        int width = scan.nextInt();
        System.out.println("Please enter the length");
        int length = scan.nextInt();

        int perimeter = (length+width)*2;
        System.out.println(perimeter);
        System.out.println(square);
        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        square.translate(4,2);
        System.out.println(square);
    }
}
