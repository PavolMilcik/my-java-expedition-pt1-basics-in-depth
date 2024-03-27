package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class ParenthesisChecker {

    public static boolean validParenthesis(String parenthesis) {

        char currentParenthesis;
        int openBracketsA = 0;
        int closeBracketsA = 0;
        int openBracketsB = 0;
        int closeBracketsB = 0;
        int openBracketsC = 0;
        int closeBracketsC = 0;

        for (int i = 0; i < parenthesis.length(); i++) {
            currentParenthesis = parenthesis.charAt(i);

            if (currentParenthesis == '(' || currentParenthesis == ')') {
                if (currentParenthesis == '(') {
                    openBracketsA++;
                } else {
                    closeBracketsA++;
                }
            }

            if (currentParenthesis == '[' || currentParenthesis == ']') {
                if (currentParenthesis == '[') {
                    openBracketsB++;
                } else {
                    closeBracketsB++;
                }
            }

            if (currentParenthesis == '{' || currentParenthesis == '}') {
                if (currentParenthesis == '{') {
                    openBracketsC++;
                } else {
                    closeBracketsC++;
                }
            }

            if (openBracketsA < closeBracketsA || openBracketsB < closeBracketsB ||
                    openBracketsC < closeBracketsC) {
                return false;
            }
        }

        return openBracketsA == closeBracketsA && closeBracketsB == openBracketsB &&
                closeBracketsC == openBracketsC;
    }


    public static void main(String[] args) {
        System.out.println("\n1. ------------- Check that the parenthesis are correctly closed. ---------");

        System.out.println("() - " + validParenthesis("()"));              // true
        System.out.println("()() - " + validParenthesis("()()"));          // true
        System.out.println("(()) - " + validParenthesis("(())"));          // true
        System.out.println("(()()) - " + validParenthesis("(()())"));      // true

        System.out.println("\n)( - " + validParenthesis(")("));            // false
        System.out.println("()) - " + validParenthesis("())"));            // false
        System.out.println("((() - " + validParenthesis("((()"));          // false
        System.out.println("((() - " + validParenthesis("())(()"));        // false
        System.out.println("(()))) - " + validParenthesis("(())))"));      // false

        System.out.println("\n2. ------------- Check that the parenthesis are correctly closed. ---------");

        System.out.println("[{]} - " + validParenthesis("[{]}"));                                 // true
        System.out.println("'' - " + validParenthesis(""));                                       // true
        System.out.println("([][]{()}) - " + validParenthesis("([][]{()})"));                     // true
        System.out.println("({([()()])}) - " + validParenthesis("({([()()])})"));                 // true
        System.out.println("({([()()])})()[][{]} - " + validParenthesis("({([()()])})()[][{]}")); // true

        System.out.println("\n}{ - " + validParenthesis("}{"));                         // false
        System.out.println("{) - " + validParenthesis("{)"));                           // false
        System.out.println("[}]{ - " + validParenthesis("[}]{"));                       // false
        System.out.println("[{]{ - " + validParenthesis("[{]{"));                       // false
        System.out.println("[ - " + validParenthesis("["));                             // false
        System.out.println("[) - " + validParenthesis("[)"));                           // false
        System.out.println("({([()()])})) - " + validParenthesis("({([()()])}))"));     // false
    }
}
