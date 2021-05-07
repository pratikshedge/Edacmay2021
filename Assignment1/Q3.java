import java.util.Scanner;

class Q3
{
  public static void main(String args[])
{
    

    System.out.print("Enter two Numbers : ");
    Scanner sc= new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int Ans = num1 / num2;
    System.out.println("Division two numbers="+Ans);
}

}
