package homework12;
import java.util.Objects;

public class AuthorService {
    public boolean equals(Author author1, Author author2){
        return author1.getFirstName() == author2.getFirstName() && author1.getLastName() == author2.getLastName();
    }

    public int hashCode(Author author){
        return Objects.hash(author.getFirstName(), author.getLastName());

    }

}
