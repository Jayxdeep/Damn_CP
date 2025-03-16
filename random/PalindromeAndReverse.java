package random;
public class PalindromeAndReverse {
    public static void main(String[] args) {
        // Example number with trailing zero
        int number = 1200;
        
        try {
            int reversedNumber = reverseNumber(number);
            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
            
            boolean isPalindrome = checkPalindrome(number);
            if (isPalindrome) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during processing.");
            e.printStackTrace();
        }
    }

    // Method to reverse a number
    public static int reverseNumber(int number) throws Exception {
        int reversed = 0;
        try {
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reversing the number.");
            e.printStackTrace();
            throw e;
        }
        return reversed;
    }

    // Method to check if a number is a palindrome
    public static boolean checkPalindrome(int number) throws Exception {
        try {
            int reversedNumber = reverseNumber(number);
            return number == reversedNumber;
        } catch (Exception e) {
            System.out.println("An error occurred while checking palindrome.");
            e.printStackTrace();
            throw e;
        }
    }
}
