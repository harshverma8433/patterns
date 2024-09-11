public class pattern32 {
    public static void main(String[] args) {
        int n = 6;
        for(int row = 1; row <= n; row++) {
            char ch = (char) ('A' + (n - row));
            for(int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;  
            }
            System.out.println();  
        }
    }
}




    //    E
    //    D E
    //    C D E
    //    B C D E
    //    A B C D E