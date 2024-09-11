public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1;row<=n;row++){
            int space = n-row;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }

            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



    //     *
    //    ***
    //   *****
    //  *******
    // *********
