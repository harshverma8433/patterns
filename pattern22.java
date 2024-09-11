public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int c = 1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(c+" ");
                c = c==0 ? 1 : 0;
            }
            System.out.println();
        }
    }
    
}


    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1