package OOP_pt1.Book;

public class main {
    public static void main(String[] args) {
        Author author = new Author("Владимир Кириллов", "Мужчина", "volodya@gmail.com");

        Book book = new Book("Танки", author, 2025);

        System.out.println(author);
        System.out.println(book);
    }
}
