package homework12;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        return ", First name: " + this.firstName + ", Last name: " + this.lastName;
    }


    public boolean equals(Author author) {
        return getFirstName() == author.getFirstName() && getLastName() == author.getLastName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
