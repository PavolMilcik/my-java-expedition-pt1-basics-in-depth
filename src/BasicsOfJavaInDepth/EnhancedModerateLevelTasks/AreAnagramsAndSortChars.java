package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


import java.util.Arrays;


public class AreAnagramsAndSortChars {

    // ---------------------------------------------------------------------------------------
    // ----------------------- ENHANCED VERSION of 'ARE ANAGRAMS?' task -----------------------
    public static String[] sortCharsInStrings(String textX, String textY) {
        // textX to char array:
        char[] textXToArray = new char[textX.length()];
        for (int i = 0; i < textX.length(); i++) {
            textXToArray[i] = textX.charAt(i);
        }

        // textY to char array:
        char[] textYToArray = new char[textY.length()];
        for (int i = 0; i < textY.length(); i++) {
            textYToArray[i] = textY.charAt(i);
        }

        // sort textX char array:
        char currentIsBiggerCharX;
        char nextCharX;
        for (int i = 0; i < textXToArray.length; i++) {
            for (int j = 0; j < textXToArray.length - 1; j++) {
                currentIsBiggerCharX = textXToArray[j];
                nextCharX = textXToArray[j + 1];
                if (currentIsBiggerCharX > nextCharX) {
                    textXToArray[j] = nextCharX;
                    textXToArray[j + 1] = currentIsBiggerCharX;
                }
            }
        }

        // sort textY char array:
        char currentIsBiggerCharY;
        char nextCharY;
        for (int i = 0; i < textYToArray.length; i++) {
            for (int j = 0; j < textYToArray.length - 1; j++) {
                currentIsBiggerCharY = textYToArray[j];
                nextCharY = textYToArray[j + 1];
                if (currentIsBiggerCharY > nextCharY) {
                    textYToArray[j] = nextCharY;
                    textYToArray[j + 1] = currentIsBiggerCharY;
                }
            }
        }

        // create string from char array:
        StringBuilder s = new StringBuilder();
        String sortedA;
        for (char c : textXToArray) {
            s.append(c);
        }
        sortedA = s.toString();
        s = new StringBuilder();

        // create string from char array:
        String sortedB;
        for (char c : textYToArray) {
            s.append(c);
        }
        sortedB = s.toString();

        return new String[]{sortedA, sortedB};
    }

    public static boolean checkIfAnagrams(String textX, String textY) {
        String[] sortedTexts = sortCharsInStrings(textX, textY);
        String sortedTextX = sortedTexts[0];
        String sortedTextY = sortedTexts[1];

        return sortedTextX.equals(sortedTextY);
    }

    // ---------------------------------------------------------------------------------------
    // ----------------------- SHORTER VERSION of 'ARE ANAGRAMS?' task -----------------------
    public static boolean areAnagrams(String textK, String textL) {
        if (textK.length() != textL.length()) {
            return false;
        }

        char[] charArrayTextK = textK.toCharArray();
        char[] charArrayTextL = textL.toCharArray();

        Arrays.sort(charArrayTextK);
        Arrays.sort(charArrayTextL);

        return Arrays.equals(charArrayTextK, charArrayTextL);
    }

    // ---------------------------------------------------------------------------------------
    // ------------------- ANOTHER ENHANCED VERSION of the'ARE ANAGRAMS?' task ---------------
    public static boolean areStringsAnagrams(String textA, String textB) {
        if (textA.length() != textB.length()) {
            return false;
        }
        for (int i = 0; i < textA.length(); i++) {
            int tempCounterA = 0;
            int tempCounterB = 0;
            for (int j = 0; j < textA.length(); j++) {
                if (textA.charAt(i) == textA.charAt(j)) {
                    tempCounterA++;
                }
                if (textA.charAt(i) == textB.charAt(j)) {
                    tempCounterB++;
                }
            }
            if (tempCounterA != tempCounterB) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String stringA = "heart";
        String stringB = "earth";
        String stringC = "silent";
        String stringD = "listen";
        String stringE = "nose";
        String stringF = "sore";

        System.out.println("\n\nThis program checks if two strings are anagrams of each other " +
                "\nand returns true or false as a result.\n");

        System.out.println("--- Enhanced version of the 'are anagrams' task:");
        System.out.println(stringA + ", " + stringB + " - " + checkIfAnagrams(stringA, stringB));
        System.out.println(stringC + ", " + stringD + " - " + checkIfAnagrams(stringC, stringD));
        System.out.println(stringE + ", " + stringF + " - " + checkIfAnagrams(stringE, stringF));

        System.out.println("\n--- Shorter version of the 'are anagrams' task:");
        System.out.println("cafe, face" + " - " + areAnagrams("cafe", "face"));
        System.out.println("road, dore" + " - " + areAnagrams("road", "dore"));
        System.out.println("angel, angle" + " - " + areAnagrams("angel", "angle"));

        System.out.println("\n--- Another enhanced version of the 'are anagrams' task:");
        System.out.println(stringA + ", " + stringB + " - " + areStringsAnagrams(stringA, stringB));
        System.out.println(stringC + ", " + stringD + " - " + areStringsAnagrams(stringC, stringD));
        System.out.println(stringE + ", " + stringF + " - " + areStringsAnagrams(stringE, stringF));
        System.out.println("cafe, face" + " - " + areStringsAnagrams("cafe", "face"));
        System.out.println("road, dore" + " - " + areStringsAnagrams("road", "dore"));
    }
}
