/*Write a program to draw dimond pattern
 
 */
package diamondpattern;
import java.util.Scanner;

public class DiamondPattern {
   
    public static void main(String[] args) {
        int odd = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number");
         int size = scan.nextInt();
        
        int spaces = size/2;
        for(int i = 1; i<=size;i++)
        {
          for(int j = spaces; j >=1;j--)
          {
              System.out.print(" ");
          }
          for(int j = 1; j<=odd; j++)
          {
              System.out.print("*");
          }
          System.out.println();
          if(i<size/2 +1)
          {
              odd = odd + 2;
              spaces = spaces -1;
          }
          else 
          {
              odd = odd -2;
          spaces = spaces +1;
        
        }
        
    }
    
}
}
