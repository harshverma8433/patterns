public class pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int totspa = n-1;
        for(int row=1;row<=n;row++){
            for(int s=0;s<totspa;s++){
                System.out.print(" ");
            }
            totspa--;

            for(int col=1;col<=n;col++){
                if(row==1 || row==n){
                    System.out.print("*");
                }else{
                    if(col==1 || col==n){
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


    //       *****
    //      *   *
    //     *   *
    //    *   *
    //   *****