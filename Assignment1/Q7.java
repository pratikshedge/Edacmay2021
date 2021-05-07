
import java.util.Scanner;

class Q7
{
  public static void main(String args[])
{
    

    System.out.print("Enter a Number : ");
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=1;i<=10;i++)
{  
   int ans= num * i;
   System.out.println(num+"x"+i+"="+ans);   
}
    
}

}