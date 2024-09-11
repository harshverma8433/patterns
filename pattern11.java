public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int totalcol = n; 
        for (int row = 1; row <= n; row++) {
            int space = row-1;
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalcol;col++){
                System.out.print("* ");
            }

            totalcol--;
            System.out.println();
        }
    }
    
}


    
    
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
