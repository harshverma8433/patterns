public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int totcol = n;
        for (int row = 0; row < n; row++) {
            int space = row;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for(int col=1;col<=2*totcol-1;col++){
                System.out.print("*");
            }

            totcol--;
            System.out.println();
        }
    }
}



    // *********
    //  *******
    //   *****
    //    ***
    //     *