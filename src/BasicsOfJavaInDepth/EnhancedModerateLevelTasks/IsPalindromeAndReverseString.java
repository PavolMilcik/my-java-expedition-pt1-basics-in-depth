package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class IsPalindromeAndReverseString {

    public static boolean checkPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String text) {
        StringBuilder s = new StringBuilder();
        String reversedString;
        for (int i = text.length() - 1; i >= 0; i--) {
            s.append(text.charAt(i));
        }
        reversedString = s.toString();
        return reversedString;
    }


    public static void main(String[] args) {

        String stringA = "eye";
        String stringB = "madam";
        String stringC = "nose";
        String stringD = "modem";

        System.out.println("\nThis program checks if a string is a palindrome " +
                "\nand returns true or false as a result.");
        System.out.println(stringA + " - " + checkPalindrome(stringA));
        System.out.println(stringB + " - " + checkPalindrome(stringB));
        System.out.println(stringC + " - " + checkPalindrome(stringC));
        System.out.println(stringD + " - " + checkPalindrome(stringD));

        System.out.println("\nThis program returns the reversed string of the input string.");
        System.out.println(stringA + " - " + reverseString(stringA));
        System.out.println(stringB + " - " + reverseString(stringB));
        System.out.println(stringC + " - " + reverseString(stringC));
        System.out.println(stringD + " - " + reverseString(stringD));
    }
}
