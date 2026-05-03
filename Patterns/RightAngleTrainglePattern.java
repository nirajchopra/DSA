     //     *
     //    **
     //   ***
     //  ****
     // *****

     public class RightAngleTrainglePattern{
          public static void main(String args[]){
               int n = 5;

               for(int row = 1; row <= n; row++){
                    for(int col < n; col < row - n; col++){
                         System.out.print("*");
                    }
                    System.out.println();
               }
          }
     }