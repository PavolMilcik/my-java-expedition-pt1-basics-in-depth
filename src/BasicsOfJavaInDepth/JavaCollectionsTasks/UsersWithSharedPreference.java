package BasicsOfJavaInDepth.JavaCollectionsTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class UsersWithSharedPreference {

    public static ArrayList<Integer> findUsersWithSharedPreference(
            HashMap<Integer, HashMap<String, String>> usersAndTheirPreferences,
            Map.Entry<String, String> preference) {

        ArrayList<Integer> users = new ArrayList<>();

        // 1. option for solving the task
//        for (Integer user : usersAndTheirPreferences.keySet()) {
//            for (String clr : usersAndTheirPreferences.get(user).keySet()) {
//                String currentValueOfPreferences = usersAndTheirPreferences.get(user).get(clr);
//                if (preference.getKey().equals(clr) && preference.getValue().equals(currentValueOfPreferences)) {
//                    users.add(user);
//                }
//            }
//        }


        // 2. option for solving the task
//        for (Map.Entry<Integer, HashMap<String, String>> userEntry : usersAndTheirPreferences.entrySet()) {
//            int user = userEntry.getKey();
//            for (Map.Entry<String, String> entry : userEntry.getValue().entrySet()) {
//                if (entry.getKey().equals(preference.getKey()) && entry.getValue().equals(preference.getValue())) {
//                    users.add(user);
//                }
//            }
//        }

        // 3. option for solving the task
        for (Integer user : usersAndTheirPreferences.keySet()) {
            for (Map.Entry<String, String> entry : usersAndTheirPreferences.get(user).entrySet()) {
                if (entry.getKey().equals(preference.getKey()) && entry.getValue().equals(preference.getValue())) {
                    users.add(user);
                }
            }
        }

        return users;
    }


    public static void main(String[] args) {

        System.out.println("\n\n\n\t\t\tFind users with shared preference.\n");

        // --------------------------------------------------------------------------------------------
        System.out.println("\n--------- Users and their preferences ---------");

        // creating HashMap... key: user, value(preferences): key: color, value: blue
        HashMap<Integer, HashMap<String, String>> allUsersAndTheirPreferences = new HashMap<>();

        HashMap<String, String> firstUserPreferences = new HashMap<>();
        firstUserPreferences.put("color", "blue");
        firstUserPreferences.put("size", "L");
        HashMap<String, String> secondUserPreferences = new HashMap<>();
        secondUserPreferences.put("color", "green");
        secondUserPreferences.put("size", "XL");
        HashMap<String, String> thirdUserPreferences = new HashMap<>();
        thirdUserPreferences.put("color", "blue");
        thirdUserPreferences.put("size", "M");
        HashMap<String, String> fourthUserPreferences = new HashMap<>();
        fourthUserPreferences.put("color", "red");
        fourthUserPreferences.put("size", "S");
        HashMap<String, String> fifthUserPreferences = new HashMap<>();
        fifthUserPreferences.put("color", "blue");
        fifthUserPreferences.put("size", "S");

        allUsersAndTheirPreferences.put(1, firstUserPreferences);
        allUsersAndTheirPreferences.put(2, secondUserPreferences);
        allUsersAndTheirPreferences.put(3, thirdUserPreferences);
        allUsersAndTheirPreferences.put(4, fourthUserPreferences);
        allUsersAndTheirPreferences.put(5, fifthUserPreferences);

        // print Map of users and their preferences
        for (Integer user : allUsersAndTheirPreferences.keySet()) {
            System.out.print(user + ": ");
            for (String pref : allUsersAndTheirPreferences.get(user).keySet()) {
                String currentValue = allUsersAndTheirPreferences.get(user).get(pref);
                System.out.print(pref + " - " + currentValue + ", ");
            }
            System.out.println();
        }


        // Creating the Map.Entry object!
        // This is the preference we are looking for.
        Map.Entry<String, String> findThisPreference = Map.entry("color", "blue");


        System.out.println("\n--------- Users with shared preference ---------");
        // calling the method
        ArrayList<Integer> bla = findUsersWithSharedPreference(allUsersAndTheirPreferences, findThisPreference);
        // print users with shared preference
        System.out.println(bla);
    }
}
