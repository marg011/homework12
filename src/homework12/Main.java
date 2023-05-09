package homework12;




public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book("War and Peace", 1867, new Author("Leo", "Tolstoy"));
        Book warAndPeace2 = new Book("War and Peace", 1867, new Author("Leo", "Tolstoy"));
        Book idiot = new Book("Idiot", 1869, new Author("Fyodor", "Dostoevsky"));


        warAndPeace.setYear(1868);
        System.out.println(warAndPeace.getYear());

        System.out.println(warAndPeace.getFullName().getFirstName());

        warAndPeace.setYear(1867);
        System.out.println(warAndPeace);


        System.out.println(warAndPeace.getFullName().equals(warAndPeace2.getFullName()));
        System.out.println(warAndPeace.getFullName().equals(idiot.getFullName()));
        System.out.println(warAndPeace2.getFullName().hashCode());

        System.out.println(warAndPeace.equals(warAndPeace2));
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace.hashCode());
        warAndPeace.setYear(1868);
        System.out.println(warAndPeace.hashCode());







    }
}
