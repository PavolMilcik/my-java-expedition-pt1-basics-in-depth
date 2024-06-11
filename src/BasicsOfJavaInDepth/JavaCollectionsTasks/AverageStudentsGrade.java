package BasicsOfJavaInDepth.JavaCollectionsTasks;

import java.util.*;


public class AverageStudentsGrade {

    public static HashMap<String, Double> calculateAverageStudentsGrade(HashMap<String, List<Integer>> studentsGrades) {
        HashMap<String, Double> averageStudentsGradeMap = new HashMap<>();

        // 1. option for solving the task:
//        for (String student : studentsGrades.keySet()) {
//            int sum = 0;
//            int counter = 0;
//            double result = 0;
//            for (Integer grade : studentsGrades.get(student)) {
//                counter++;
//                sum += grade;
//            }
//            result = (double) sum / counter;
//            averageStudentsGradeMap.put(student, result);
//        }

        // 2. option for solving the task - by using 'Map.Entry' and 'entrySet()':
        for (Map.Entry<String, List<Integer>> entry : studentsGrades.entrySet()) {
            int counter = 0;
            int sum = 0;
            double result = 0;
            for (Integer grade : entry.getValue()) {
                counter++;
                sum += grade;
            }
            result = (double) sum / counter;
            averageStudentsGradeMap.put(entry.getKey(), result);
        }

        return averageStudentsGradeMap;
    }


    public static void main(String[] args) {
        HashMap<String, List<Integer>> allStudentsGrades = new HashMap<>();

        List<Integer> paulsGrades = new ArrayList<>();
        List<Integer> lenkasGrades = new ArrayList<>();
        List<Integer> bubusGrades = new ArrayList<>();

        // add random grades
        Random myRandom = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumberA = myRandom.nextInt(1, 4);
            int randomNumberB = myRandom.nextInt(1, 4);
            int randomNumberC = myRandom.nextInt(1, 4);
            paulsGrades.add(randomNumberA);
            lenkasGrades.add(randomNumberB);
            bubusGrades.add(randomNumberC);
        }

        allStudentsGrades.put("Pavol", paulsGrades);
        allStudentsGrades.put("Lenka", lenkasGrades);
        allStudentsGrades.put("Bubu", bubusGrades);
        System.out.println("\n" + allStudentsGrades);

        // calling the method
        HashMap<String, Double> studentsAverageGradesMap = calculateAverageStudentsGrade(allStudentsGrades);
        System.out.println("\n" + studentsAverageGradesMap);
    }
}
