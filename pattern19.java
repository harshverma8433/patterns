public class pattern19 {
    public static void main(String[] args) {
        int n = 3;
        for(int row=1;row<=2*n-1;row++){
            int space = row<=n ? (2*n - 2*row) : (2*row - 2*n);
            int columns = row<=n ? row : 2*n-row;
            for(int i=0;i<columns;i++){
                System.out.print("*");
            } 
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int i=0;i<columns;i++){
                System.out.print("*");
            } 

            System.out.println();
        }
    }
    
}




    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *