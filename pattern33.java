public class pattern33 {
    public static void main(String[] args) {
        String letters = "aBcDeFgHiJkLmNo";  // Example input string
        int n = 7;  // Change this value for different patterns
        int index = 0;
        
        // Ensure that the pattern fits within the available characters
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (index < letters.length()) {
                    System.out.print(letters.charAt(index) + " ");
                    index++;
                } else {
                    break;
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}



    //    a
    //    B c
    //    D e F
    //    g H i J
    //    k L m N o