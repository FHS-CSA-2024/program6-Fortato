//import stuff here!
import java.util.Scanner;
import java.lang.Math;
//Your code here
public class program6
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        //create my variables
        int radius = 0;
        int diameter = 0;
        int area = 0;
        int circumference = 0;
        final double pi = 3.14159;
                
        //output
        System.out.println("Enter the radius:");
        double r = (double) radius;
        r = myObj.nextDouble();
        
        //math
        double d = (double) diameter;
        d=2*r;
        double c = (double) circumference;
        c=pi*d;
        double a = (double) area;
        a=(pi)*r*r;
        
        r = Math.round(r*1000);
        r = r/1000;
        d = Math.round(d*1000);
        d = d/1000;
        a = Math.round(a*1000);
        a = a/1000;
        c = Math.round(c*1000);
        c = c/1000;
        //output
        System.out.println("The Radius of the circle = " + r);
        System.out.println("The Diamater of the circle = " + d);
        System.out.println("The Area of the circle = " + a);
        System.out.println("The Circumference of the circle = " + c);
    }
}
//Paste console output below:
/*

Enter the radius:
3.712
The Radius of the circle = 3.712
The Diamater of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323


*/
