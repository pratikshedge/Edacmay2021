

import java.util.Scanner;

public class Q11
{
  public static void main(String args[])
  { 
        System.out.println("Enter a value of a Radius");
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        double Area = 3.141 * r * r;
        double Perimeter = 2 * 3.141 * r;
        System.out.println("Area of a Circle= "+Area);
        System.out.println("Area of a Perimeter= "+Perimeter);
     
   }
}