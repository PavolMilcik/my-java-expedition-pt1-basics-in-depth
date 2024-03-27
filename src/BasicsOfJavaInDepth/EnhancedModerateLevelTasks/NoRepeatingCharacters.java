package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class NoRepeatingCharacters {

    public static boolean isIsogram(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("\n\n---- Check if given text/string is an isogram?" +
                "\n---- (if it has no repeating characters)\n");

        System.out.println("nose - " + isIsogram("nose"));              // true
        System.out.println("isogram - " + isIsogram("isogram"));        // true
        System.out.println("eye - " + isIsogram("eye"));                // false
        System.out.println("door - " + isIsogram("door"));              // false
        System.out.println("elephant - " + isIsogram("elephant"));      // false
        System.out.println("isisogram - " + isIsogram("isisogram"));    // false
        System.out.println("isIsogram - " + isIsogram("isIsogram"));    // false
        System.out.println("isISogram - " + isIsogram("isISogram"));    // true
    }
}
