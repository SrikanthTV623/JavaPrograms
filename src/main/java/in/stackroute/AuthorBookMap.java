package in.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AuthorBookMap {

    public static void main(String[] args) {
        TreeMap<String, List<String>> authorBookMap = new TreeMap<>();

        addBook(authorBookMap, "Master Aryan", "Harry Potter PART1");
        addBook(authorBookMap, "Master Aryan", "Harry Potter PART2");
        addBook(authorBookMap, "Master Aryan", "Harry Potter PART3");
        addBook(authorBookMap, "Martin", "Game of Thrones");
        addBook(authorBookMap, "Martin", "Clash of Kings");
        addBook(authorBookMap, "Martin", "Storm of Swords");

        for (Map.Entry<String, List<String>> entry : authorBookMap.entrySet()) {
            String author = entry.getKey();
            List<String> books = entry.getValue();
            System.out.println(author + ": " + books);
        }
    }

    public static void addBook(TreeMap<String, List<String>> map, String author, String book) {

        if (map.containsKey(author)) {
            map.get(author).add(book);
        } else {
            List<String> books = new ArrayList<>();
            books.add(book);
            map.put(author, books);
        }
    }
}
