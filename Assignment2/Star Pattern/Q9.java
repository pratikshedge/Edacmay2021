public class Q9
{
public static void main(String args[])
{ 
for (int i = 1; i <= 5; i++)
        {
            // Print space in decreasing order
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5-1; i++)
        {
            // Print space in increasing order
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k = 5-1; k >= i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     
    }
}