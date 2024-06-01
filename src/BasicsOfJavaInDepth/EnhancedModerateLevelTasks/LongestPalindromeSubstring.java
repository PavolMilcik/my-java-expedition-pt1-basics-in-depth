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


    // ---------------------------------------------------------------------------------------
    // -------- MY ANOTHER ENHANCED VERSION of the 'Longest Palindrome Substring' task --------
    public static String longestPalindromeSubstring(String text) {
        StringBuilder s = new StringBuilder();
        String longestPalindrome = "";

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j <= text.length() - i - 1; j++) {
                if (text.charAt(i) == text.charAt(text.length() - 1 - j)) {
                    int tempVar = i;
                    for (int k = 0; k < text.length() - i - j; k++) {
                        if (text.charAt(tempVar) == text.charAt(text.length() - 1 - k - j)) {
                            s.append(text.charAt(tempVar));
                            tempVar++;
                        } else {
                            s = new StringBuilder();
                            break;
                        }
                    }
                    if (longestPalindrome.isEmpty() || s.length() > longestPalindrome.length()) {
                        longestPalindrome = s.toString();
                    }
                    s = new StringBuilder();
                }
                if (longestPalindrome.length() == text.length()) {
                    break;
                }
            }
        }

        return longestPalindrome;
    }


    public static void main(String[] args) {

        System.out.println("\n\n--- This function returns the longest palindromic substring in the given string ---");
        System.out.println("xzmadamfam - " + returnLongestPalindromeSubstring("xzmadamfam"));           // madam
        System.out.println("abba - " + returnLongestPalindromeSubstring("abba"));                       // abba
        System.out.println("abacada - " + returnLongestPalindromeSubstring("abacada"));                 // aba
        System.out.println("howexeyexyere - " + returnLongestPalindromeSubstring("howexeyexyere"));     // xeyex
        System.out.println("kisdeyezxcxc - " + returnLongestPalindromeSubstring("kisdeyezxcxc"));       // eye


        System.out.println("\n\n--- MY ANOTHER ENHANCED VERSION of the 'Longest Palindrome Substring' task ---");
        System.out.println("eye - " + longestPalindromeSubstring("eye"));                       // eye
        System.out.println("madam - " + longestPalindromeSubstring("madam"));                   // madam
        System.out.println("abba - " + longestPalindromeSubstring("abba"));                     // abba
        System.out.println("abacada - " + longestPalindromeSubstring("abacada"));               // aba
        System.out.println("zbacaba - " + longestPalindromeSubstring("zbacaba"));               // bacab
        System.out.println("xzmadamfam - " + longestPalindromeSubstring("xzmadamfam"));         // madam
        System.out.println("howexeyexyerey - " + longestPalindromeSubstring("howexeyexyerey")); // xeyex
        System.out.println("deyecxc - " + longestPalindromeSubstring("deyecxc"));               // eye
        System.out.println("kisdeyezxcxc - " + longestPalindromeSubstring("kisdeyezxcxc"));     // eye
        System.out.println("eyezxcxc - " + longestPalindromeSubstring("eyezxcxc"));             // eye
        System.out.println("a - " + longestPalindromeSubstring("a"));                           // a
        System.out.println("aa - " + longestPalindromeSubstring("aa"));                         // aa
        System.out.println("aba - " + longestPalindromeSubstring("aba"));                       // aba
    }
}
