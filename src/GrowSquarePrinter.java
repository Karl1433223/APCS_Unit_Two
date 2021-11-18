import java.awt.*;
import java.util.Scanner;

public class GrowSquarePrinter {

    public static void main(String[] args) {

        // Create a Rectangle object with a starting x, y of (100, 100) and a width and height of 50.
       Rectangle xy = new Rectangle(100, 100,50,50);

        // print the rectangle object.
        System.out.println(xy);
        // Use the translate and grow methods as described in the instructions
        xy.grow(25,25);
        xy.translate(25,25);
        // print the rectangle object.
        System.out.println(xy);
    }
}
