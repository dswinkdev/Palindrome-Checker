import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String word;
        boolean stopProgram = false;

        while (!stopProgram) {
            System.out.print("Enter a word (type 0 to stop): ");
            word = keyboard.nextLine();

            if (word.equalsIgnoreCase("0")) {
                System.out.println("Program stopped.");
                stopProgram = true;
                break;
            }

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);

            }
                System.out.println("word in reverse: " + reverse);

                if (reverse.equals(word)) {
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println(word + " is not a palindrome.");
                }
                System.out.println();
            }
        }
    }