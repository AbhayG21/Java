import java.util.*;

public class Box {
    double height, width, depth;
    String type_box;
    boolean box_full;

    Box() 
    {
        this(0,0,0);    
    }

    Box(double height, double width, double depth) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of box: ");
        this.type_box = sc.next();
        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        System.out.print("Enter the width: ");
        width = sc.nextDouble();

        System.out.print("Enter the depth: ");
        depth = sc.nextDouble();
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println(type_box + " has been created");
        System.out.println(
                "The height,width,depth of " + type_box + "is " + height + " " + width + " " + depth + " respectively");

    }

    public static void main(String[] args) {
        Box square = new Box();
    }
}
