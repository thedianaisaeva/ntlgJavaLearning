public class Book {
    public String title;
    public Author author;
    public int releaseYear;
    public int pages;
    public static String word;

    public Book(String title, Author author, int releaseYear, int pages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }
    public boolean isBig(int pages) {
        return pages > 500;
    }
    public boolean matches(String word) {
        return (title.contains(word) || author.name.contains(word) || author.surname.contains(word));
    }
    public int estimatePrice(int pages) {
        int price = pages * 3 * (int) Math.floor(Math.sqrt(author.rating));
        return Math.max(price, 250);
    }
    public String toString() {
        return "Title: " + title + "\n" +
        "Author: " + author.name + " " + author.surname + "\n" +
        "Rating: " + author.rating + " " + "\n" +
        "Release Year: " + releaseYear + "\n" +
        "Pages: " + pages + "\n" +
        "Big Book: " + isBig(pages) + "\n" +
        "Price: " + estimatePrice(pages) + "\n";
    }
}
