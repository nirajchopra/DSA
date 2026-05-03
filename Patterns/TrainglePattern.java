
// *
// * *
// * * *
// * * * *

public class TrainglePattern{
     public static void main(String args[]){
          int n = 4;
          for(int row = 1; row <= n; row++){
               //For every row, run the column
               for(int col = 1; col <= row; col++){
                    System.out.print("* ");
               }
               //When one row is printed, we need to add a newline
               System.out.println();
          }

     }

}