public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int c = 1;
        int t = n;
        for(int row=1;row<=2*n;row++){
            int space = row<=n ? row-1 : n-c;
            int totalcol = row<=n ? t-- : c++ ;
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }


            for(int col=1;col<=totalcol;col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}



    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *