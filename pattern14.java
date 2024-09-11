public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int totcol = n;
        for(int row=1;row<=n;row++){
            int space = row-1;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");   
            }
            for(int col=1;col<=2*totcol-1;col++){
                if(row==1 || row==n){
                    System.out.print("*");
                }else{
                    if(col==1 || col==(2*totcol-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            totcol--;
            System.out.println();
        }
    }
    
}



    //  *********
    //   *     *
    //    *   *
    //     * *
    //      *