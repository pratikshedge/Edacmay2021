import java.util.Scanner;

public class Q21
{
    public static void main(String args[])
    {
    	char ch[]={'0','1','2','3','4','5','6','7'};
	int rem,num;
	String octa=""; 
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        num=sc.nextInt();
        System.out.println("octal number is : ");
        while(num != 0)
        {
         rem=num%8;
	octa= ch[rem] + octa;
        num= num/8;
                                                 
        }   
       System.out.print(octa);   
    }
}