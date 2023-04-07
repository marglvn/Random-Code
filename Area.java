import java.util.Scanner;
import javax.swing.JOptionPane;

/* Calculating the area of circle and using some of the
Math objects? */

public class Area
{
    public static void main(String[] args)
    {
        //Scanner input = new Scanner(System.in);

        double radius, areaOfCircle;
        double pi = Math.PI;
	String result;

        /* System.out.print("Enter the radius of the circle >> ");
        radius = input.nextDouble(); */
	
	result = JOptionPane.showInputDialog(null, "Enter the radius of the circle");
	
	radius = Double.parseDouble(result);

        radius = areaOfCircle = pi * Math.pow(radius, 2);

        //System.out.println("Area of the circle is "+ areaOfCircle);
	 
	JOptionPane.showMessageDialog(null, "Area of the circle is " + areaOfCircle);
    }
}