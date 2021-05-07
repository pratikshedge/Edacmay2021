import java.util.Scanner;
import java.lang.Math;

public class Q22
{
     public static void main(String[] args) {
    long num;
    int decimalNumber = 0, i = 0;
    long remainder;
    System.out.println("Binary to Decimal");
    System.out.println("Enter any binary number:");
    Scanner sc= new Scanner(System.in);
    num= sc.nextLong();
   
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    System.out.println("decimalNumber is:"+decimalNumber);
  }
}
