package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;


public class StartNamesWithSameChar {

    public static boolean startNamesWithSameChar(String[] names) {
        char firstCharInFirstName = names[0].charAt(0);

        for (String name : names) {
            if (firstCharInFirstName != name.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean startNamesWithJ(String[] names) {
        int tempVar = 0;
        for (String name : names) {
            if (name.charAt(0) == 'J') {
                tempVar += 1;
            }
        }

//        // return boolean by if-else statement --->
//        if (tempVar == names.length) {
//            return true;
//        } else {
//            return false;
//        }

//        // or return boolean by ternary operator --->
//        boolean result;
//        result = (tempVar == names.length) ? true : false;
//        return result;

        // or return boolean by using shorthand notation
        return tempVar == names.length;
    }


    public static void main(String[] args) {

        System.out.println("\n---------------- Do names start with character A ?");
        String[] namesA = new String[]{"Anna", "Andrea", "Alica", "Albin"};
        System.out.println(startNamesWithSameChar(namesA));

        System.out.println("\n---------------- Do names start with character B ?");
        String[] namesB = new String[]{"Bubu", "Bob", "Becca", "Bela"};
        System.out.println(startNamesWithSameChar(namesB));

        System.out.println("\n---------------- Do names start with the same characters ?");
        String[] differentNames = new String[]{"Aron", "John", "Bob"};
        System.out.println(startNamesWithSameChar(differentNames));


        System.out.println("\n---------------- Do names start with character J ?");
        String[] namesJ = new String[]{"John", "James", "Josua"};
        System.out.println(startNamesWithJ(namesJ));
    }
}
