import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a diameter: ");
        double diameter = in.nextDouble();
        double radius = diameter/2;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle with a diameter of " + diameter +  " is ");
        System.out.printf("%.1f", area);
        System.out.println(".");

        in.close();
    }
}
