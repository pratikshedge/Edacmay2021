import java.util.Scanner;
import java.lang.Math;

public class Q23
{
   public static void main(String args[])
{ 
     int num;
     System.out.println("Enter any binary number");
     Scanner sc= new Scanner(System.in);
     num=sc.nextInt();
     int Decimal= BinaryToDecimal(num);
     String Hexa = DecimalToOctal(Decimal);
     System.out.println("Hexa number is:"+Hexa);
     
}


public static int BinaryToDecimal(int number)
{
    int decimalNumber = 0, i = 0;
     long remainder;
    while (number != 0) {
      remainder = number % 10;
      number = number/ 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber ;  
}

public static String DecimalToOctal(int number2)
{
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int rem;
	String hexa="";
        while(number2 != 0)
        {
         rem=number2 % 16;
	 hexa= ch[rem] + hexa;
         number2= number2 / 16;
                                                 
        }   
       return hexa ;  
    }


}


