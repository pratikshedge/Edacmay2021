import java.util.Scanner;

public class Q12
{
   public static void main(String args[])
{ 
   System.out.println("Enter three numbers");
   Scanner sc= new Scanner(System.in);
   int num1 = sc.nextInt();
   int num2 = sc.nextInt(); 
   int num3 = sc.nextInt();
   int Avg = (num1 + num2 + num3) / 3;
   
    
   System.out.println(Avg); 
} 
 }