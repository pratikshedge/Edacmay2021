import java.util.*;

public class Q10
{
public static void main(String args[])
{
int n=5;
for (int i = n; i >= 1; i--) 
        {
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
               System.out.print((char)(k+64)+" ");
            }
              
            System.out.println();
        }
         
    }
}
