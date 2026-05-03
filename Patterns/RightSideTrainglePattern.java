//     *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

public class RightSideTrainglePattern{
     public static void main(String args[]){
          int n = 5;

          for(int row = 0; row <= n; row++){
               for(int col = 1; col < row + 1; col++){
                    System.out.print("*");
               }
               System.out.println();
          }

           for(int row = 0; row < n; row++){
               for(int col = row - 1; col < n; col++){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}