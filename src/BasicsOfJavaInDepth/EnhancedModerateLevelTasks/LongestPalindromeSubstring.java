package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class LongestPalindromeSubstring {

    public static String returnLongestPalindromeSubstring(String text) {
        String palindrome = "";

        for (int i = 0; i < text.length(); i++) {
            for (int j = text.length(); j >= i; j--) {
                String currentSubstring = text.substring(i, j);
                if (isPalindrome(currentSubstring)) {
                    if (currentSubstring.length() > palindrome.length()) {
                        palindrome = currentSubstring;
                    }
                }
            }
        }

        return palindrome;
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("\n\nThis function returns the longest palindromic substring in the given string.\n");

        System.out.println("xzmadamfam - " + returnLongestPalindromeSubstring("xzmadamfam"));           // madam
        System.out.println("abba - " + returnLongestPalindromeSubstring("abba"));                       // abba
        System.out.println("abacada - " + returnLongestPalindromeSubstring("abacada"));                 // aba
        System.out.println("howexeyexyere - " + returnLongestPalindromeSubstring("howexeyexyere"));     // xeyex
        System.out.println("kisdeyezxcxc - " + returnLongestPalindromeSubstring("kisdeyezxcxc"));       // eye
    }
}
