/* Write a program to draw a star pattern*/

package starpattern4;

public class Starpattern4 {

    
    public static void main(String[] args) {
        
        int odd = 9;
       int spaces = 0;
        for(int i = 1;i<=5;i++)
        {
         for(int j = spaces;j>=1;j--) 
         {
         System.out.print(" ");
         }
          for(int j = 1;j<=odd;j++)
          {
              System.out.print('*');
          }
          System.out.println(" ");
          odd = odd-2;
          spaces = spaces+1;
        }
    }
    
}
