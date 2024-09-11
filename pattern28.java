public class pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1;row<=2*n-1;row++){
            int space = row<=n ? n-row : row-n;
            int columns = row<=n ? row : 2*n - row;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=columns;col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}




    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *