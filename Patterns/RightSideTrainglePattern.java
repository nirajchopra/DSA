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

           // Upper part
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }
}