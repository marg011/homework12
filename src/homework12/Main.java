package homework12;




public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book("War and Peace", 1867, new Author("Leo", "Tolstoy"));

        Book idiot = new Book("Idiot", 1869, new Author("Fyodor", "Dostoevsky"));


        warAndPeace.setYear(1968);
        System.out.println(warAndPeace.getYear());

    }
}
