package homework12;




public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book("War and Peace", 1867, new Author("Leo", "Tolstoy"));
        Book warAndPeace2 = new Book("War and Peace", 1867, new Author("Leo", "Tolstoy"));
        Book idiot = new Book("Idiot", 1869, new Author("Fyodor", "Dostoevsky"));


        warAndPeace.setYear(1968);
        System.out.println(warAndPeace.getYear());

        System.out.println(warAndPeace.getFullName().getFirstName());

        warAndPeace.setYear(1967);
        System.out.println(warAndPeace);

        AuthorService authorService = new AuthorService();
        System.out.println(authorService.equals(warAndPeace.getFullName(), warAndPeace2.getFullName()));
        System.out.println(authorService.equals(warAndPeace.getFullName(), idiot.getFullName()));
        System.out.println(authorService.hashCode(warAndPeace2.getFullName()));

        BookService bookService = new BookService();
        System.out.println(bookService.equals(warAndPeace, warAndPeace2));
        System.out.println(bookService.hashCode(warAndPeace));
        warAndPeace.setYear(1968);
        System.out.println(bookService.hashCode(warAndPeace));






    }
}
