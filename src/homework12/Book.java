package homework12;

public class Book {
    private String name;
    private int year;
    private Author author;
    public Book(String name, int year, Author author){
        this.name = name;
        this.year = year;
        this.author= author;
    }
    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
