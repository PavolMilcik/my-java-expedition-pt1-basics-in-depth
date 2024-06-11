package BasicsOfJavaInDepth.JavaCollectionsTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindBooksByAuthor {

    public static ArrayList<String> findBooksByAuthorA(
            String authorName, HashMap<String, List<String>> authorsAndTheirBooks) {
        ArrayList<String> booksByAuthor = new ArrayList<>();

        // 1. option for solving the task
//        for (String name : authorsAndTheirBooks.keySet()) {
//            if (name.equals(authorName)) {
//                booksByAuthor.addAll(authorsAndTheirBooks.get(name));
//            }
//        }

        // 2. option for solving the task - by using 'Map.Entry' and 'entrySet()'
        for (Map.Entry<String, List<String>> entry : authorsAndTheirBooks.entrySet()) {
            if (entry.getKey().equals(authorName)) {
                booksByAuthor.addAll(entry.getValue());
            }
        }

        return booksByAuthor;
    }


    public static ArrayList<String> findBooksByAuthorB(
            String authorName, HashMap<String, List<String>> booksAndTheirAuthors) {
        ArrayList<String> booksByAuthor = new ArrayList<>();

        // 1. option for solving the task
//        for (String book : booksAndTheirAuthors.keySet()) {
//            for (String author : booksAndTheirAuthors.get(book)) {
//                if (author.equals(authorName)) {
//                    booksByAuthor.add(book);
//                }
//            }
//        }

        // 2. option for solving the task
//        for (String book : booksAndTheirAuthors.keySet()) {
//            if (booksAndTheirAuthors.get(book).contains(authorName)) {
//                booksByAuthor.add(book);
//            }
//        }

        // 3. option for solving the task - by using 'Map.Entry' and 'entrySet()'
        for (Map.Entry<String, List<String>> entry : booksAndTheirAuthors.entrySet()) {
            if (entry.getValue().contains(authorName)) {
                booksByAuthor.add(entry.getKey());
            }
        }

        return booksByAuthor;
    }


    public static void main(String[] args) {

        System.out.println("\n\n\n\t\t\tFind books by author.\n");

        // --------------------------------------------------------------------------------------------
        System.out.println("\n--------- A. Authors and their books ---------");

        HashMap<String, List<String>> allAuthorsBooks = new HashMap<>();
        List<String> paulsBooks = new ArrayList<>(List.of("Google", "Microsoft", "Tesla"));
        List<String> lenkasBooks = new ArrayList<>(List.of("Marina", "Stiavnica", "Love"));
        List<String> bubusBooks = new ArrayList<>(List.of("Gemini", "ChatGpt", "Copilot"));

        allAuthorsBooks.put("Pavol", paulsBooks);
        allAuthorsBooks.put("Lenka", lenkasBooks);
        allAuthorsBooks.put("Bubu", bubusBooks);
        System.out.println(allAuthorsBooks);

        ArrayList<String> booksByAuthorA = findBooksByAuthorA("Pavol", allAuthorsBooks);
        System.out.println(booksByAuthorA);


        // --------------------------------------------------------------------------------------------
        System.out.println("\n\n--------- B. Books and their authors ---------");

        HashMap<String, List<String>> booksWriteByMoreAuthors = new HashMap<>();
        List<String> googleAuthors = new ArrayList<>(List.of("Kiki", "Pavol", "Bubu"));
        List<String> chatgptAuthors = new ArrayList<>(List.of("Bubu", "Zoe", "Lenka"));
        List<String> marinaAuthors = new ArrayList<>(List.of("Pavol", "Lenka", "Bubu"));

        booksWriteByMoreAuthors.put("Google", googleAuthors);
        booksWriteByMoreAuthors.put("ChatGpt", chatgptAuthors);
        booksWriteByMoreAuthors.put("Marina", marinaAuthors);
        System.out.println(booksWriteByMoreAuthors);

        ArrayList<String> booksByAuthorB = findBooksByAuthorB("Bubu", booksWriteByMoreAuthors);
        System.out.println(booksByAuthorB);
    }
}
