import java.util.HashMap;
public class Book {
    private final String name;
    private final int publicationYear;
    private final String description;

    public Book(String name, int publicationYear, String description) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + publicationYear + ") \n contents: " + description;
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}
