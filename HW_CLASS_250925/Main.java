public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Bram", "Stoker",4);
        Book book1 = new Book("Dracula", author1, 1897, 616);
        System.out.println(book1.toString());

        Author author2 = new Author("William", "Shakespeare",5);
        Book book2 = new Book("Macbeth", author2, 1623, 184);
        System.out.println(book2.toString());

        Book book3 = new Book("Hamlet", author2, 1623, 144);
        System.out.println(book3.toString());

        Author author3 = new Author("Random", "Author",2);
        Book book4 = new Book("Some kind of instruction", author3, 2025, 45);
        System.out.println(book4.toString());

        Book.word = "Will";
        System.out.println(book1.matches(Book.word));
        System.out.println(book2.matches(Book.word));
        System.out.println(book3.matches(Book.word));
        System.out.println(book4.matches(Book.word));
    }
}
