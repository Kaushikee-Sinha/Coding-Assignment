package first;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
       
        input = input.replaceAll(" ", "").toLowerCase();

        
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if ('a' <= ch && ch <= 'z') {
                
                isPresent[ch - 'a'] = true;
            }
        }

        
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false; 
            }
        }

        return true; 
    }
}
