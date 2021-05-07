import java.util.Scanner;

class Q6
{
  public static void main(String args[])
{
    

    System.out.print("Enter two Numbers : ");
    Scanner sc= new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    int product = num1 * num2;
    int sub = num1 - num2;
    int div = num1 / num2;
    int mod = num1 % num2;
    System.out.println(num1+"+"+num2+"="+sum);  
    System.out.println(num1+"*"+num2+"="+product);
    System.out.println(num1+"-"+num2+"="+sub);
    System.out.println(num1+"/"+num2+"="+div);    
    System.out.println(num1+"mod"+num2+"="+mod);        

}

}