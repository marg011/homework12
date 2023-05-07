package homework12;




public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", 1867);
        Book.Author author1 = warAndPeace.new Author("Leo","Tolstoy");
        Book idiot = new Book("Idiot", 1869);
        Book.Author author2 = idiot.new Author("Fyodor", "Dostoevsky");

        warAndPeace.setYear(1968);
        System.out.println(warAndPeace.getYear());

    }
}
