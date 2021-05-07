import java.util.Scanner;

class Q20
{
    public static void main(String args[])
    {
    	char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int rem,num;
	String hexa=""; 
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        num=sc.nextInt();
        System.out.println("Hexadecimal number is : ");
        while(num != 0)
        {
         rem=num%16;
	hexa= ch[rem] + hexa;
        num= num/16;
                                                 
        }   
       System.out.print(hexa);   
    }
}