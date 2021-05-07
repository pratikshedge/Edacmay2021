import java.util.Scanner;

public class Q15
{
  public static void main(String args[])
{
  System.out.println("Enter first number");
  Scanner sc= new Scanner(System.in);
  int num1= sc.nextInt();
  System.out.println("Enter second number");
  int num2= sc.nextInt();
  int temp;
  temp = num1;
  num1 = num2;
  num2 = temp;
  System.out.println("After Swap");
  System.out.println("first number"+num1);
  System.out.println("Second number"+num2);
  
   
}
}
