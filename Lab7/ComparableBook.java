package Lab7;

public class ComparableBook implements Comparable<ComparableBook> {
    private int id;
    private String title;

    public ComparableBook(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(ComparableBook other) {
        // Compare based on book ID
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title;
    }
}
