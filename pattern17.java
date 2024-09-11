public class pattern17 {
    public static void main(String[] args) {
        int n = 4;
        int totspa = n-1;
        for(int row=1;row<=2*n-1;row++){
            int space = row<=n ? totspa-- : row-n;
            int totalColsInRow = row <= n ? row : 2*n-row;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }

            for(int col=totalColsInRow;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=totalColsInRow;col++){
                System.out.print(col );
            }
            System.out.println();

        }
    }
    
}




    //      1
    //     212
    //    32123
    //   4321234
    //    32123
    //     212
    //      1