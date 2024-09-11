public class pattern16 {
    public static void main(String[] args) {
        int n = 8;
        int totsp = n;
        for(int row=0;row<n;row++){
            int space = 2*totsp - 1;
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            totsp--;
            for(int col=0;col<=row;col++){
                int val = (fact(row) / (fact(col) * fact(row-col)));
                System.out.print(val+"   ");
            }
            System.out.println();
        }

    }

    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        int mul = 1;
        for(int i=1;i<=num;i++){
            mul = mul * i;

        }

        return mul;
    }
    
}



    //           1
    //         1   1
    //       1   2   1
    //     1   3   3   1
    //   1   4   6   4   1