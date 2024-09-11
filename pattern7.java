public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int totcol = n;
        for(int row=1;row<=n;row++){
            int space = row-1;
            for(int i=1;i<=space;i++){
                System.out.print(" ");
            }
            for(int col=1;col<=totcol;col++){
                System.out.print("*");
            }
            totcol = totcol - 1;
            System.out.println();
        }
    }
    
}



// *****
//  ****
//   ***
//    **
//     *