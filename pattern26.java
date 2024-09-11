public class pattern26 {
    public static void main(String[] args) {
        int n = 6;
        int c = 1;
        int totcol = n;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=totcol;col++){
                System.out.print(c+" ");
            }
            c++;
            totcol--;
            System.out.println();
        }
    }
}


    //   1 1 1 1 1 1
    //   2 2 2 2 2
    //   3 3 3 3
    //   4 4 4
    //   5 5
    //   6