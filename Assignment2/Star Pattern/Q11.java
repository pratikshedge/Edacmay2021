public class Q11
{
    public static void main(String[] args)
    {
     for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i-1; j++)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k = 1; k <= 5; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}