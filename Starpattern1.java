/*Write a program to draw a star pattern
 
 */
package starpattern1;


public class Starpattern1 {

    
    public static void main(String[] args) {
        int spaces = 4;
        for(int i = 1;i<=5;i++)
        {
         for(int j = spaces;j>=1;j--) 
         {
         System.out.print(" ");
         }
          for(int j = 1;j<=i;j++)
          {
              System.out.print('*' +" ");
          }
          System.out.println(" ");
          spaces = spaces-1;
        }
    }
}
