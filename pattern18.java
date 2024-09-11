
public class pattern18 {

    public static void main(String[] args) {
        int n = 8;
        int totcol = n ;
        int c = 1;
        for (int row = 1; row <= 2 * n; row++) {
            int space = row <= n ? 2 * row - 2 : (2 * n - row) * 2;
            int column = row <= n ? totcol-- : c++;
            if (row == 1 || row == 2 * n) {
                for (int i = 0; i < 2 * n; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 0; i < column; i++) {
                    System.out.print("*");
                }
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < column; i++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}

// 6 1 
// 7 2
// 8 3  
// 9 4
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
