public class pattern24 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1;row<=2*n;row++){
            int columns = row<=n ? row : (2*n - row) + 1;
            int space = row<=n ? 2*n - 2*row : 2*row - 2*n -2;

            for(int i=0;i<columns;i++){
                if(i==0 || i==columns-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            for(int i=0;i<columns;i++){
                if(i==0 || i==columns-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println();

        }

    }
}



    //    *        *
    //    **      **
    //    * *    * *
    //    *  *  *  *
    //    *   **   *
    //    *   **   *
    //    *  *  *  *
    //    * *    * *
    //    **      **
    //    *        *