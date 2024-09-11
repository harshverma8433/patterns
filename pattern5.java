public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1 ; row<=2*n - 1 ; row++){
            int totalcols = row<=n ? row  : 2*n-row;
            for(int col=1 ; col<=totalcols ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}


//     *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *