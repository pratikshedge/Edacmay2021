

import java.util.Scanner;

public class Q13
{
  public static void main(String args[])
  { 
        System.out.println("Enter a value of a Length");
        Scanner sc= new Scanner(System.in);
        float l = sc.nextFloat();
        System.out.println("Enter a value of a Breadth");
        float b = sc.nextFloat();
        float Area = l * b;
        float Perimeter = 2 * ( l + b);
        System.out.println("Area of a Rectangle= "+Area);
        System.out.println("Area of a Breadth= "+Perimeter);
     
   }
}