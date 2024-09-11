public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int totspa = n-1;
        for(int row=1;row<=2*n-1;row++){
            int space = row<=n ? totspa-- : row-n;
            int totcol = row<=n ? 2*row-1 :  2 * (2 * n - row) - 1 ;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");   
            }
            for(int col=1;col<=totcol;col++){
                if(row==1 || row == 2*n-1){
                    System.out.print("*");
                }else{
                    if(col==1 || col==totcol){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
    
}


// 6-7
// 7-5
// 8-3
// 9-1


    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *