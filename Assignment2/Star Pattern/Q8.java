public class Q8
{
public static void main(String args[])
{
for (int i=1; i<=5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=1; i<=5-1; i++) 
        { 
            // Print star in decreasing order 
            for (int j = 5-1; j >= i; j--)
            {
                System.out.print("*");
            }
            // Print space in increasing order
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
}