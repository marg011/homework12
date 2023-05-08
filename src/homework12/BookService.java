package homework12;

import java.util.Objects;

public class BookService {
    public boolean equals(Book book1, Book book2){
        AuthorService authorService = new AuthorService();
        return book1.getYear() == book2.getYear() &&
                book1.getName() == book2.getName() &&
                authorService.equals(book1.getFullName(), book2.getFullName());
    }

    public int hashCode(Book book){
        return Objects.hash(book.getYear(), book.getName(), book.getFullName());

    }
}
