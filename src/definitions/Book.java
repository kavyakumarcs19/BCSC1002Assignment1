/*  Created by IntelliJ IDEA.
 *  User: Kavya Kumar
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthor;
    private long ISBNNumberOfBook;

    public long getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook(long ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public Book(String nameOfTheBook, String nameOfTheAuthor, long ISBNNumberOfBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public String getNameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor) {
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook ='" + nameOfTheBook + '\'' +
                ", nameOfTheAuthor ='" + nameOfTheAuthor + '\'' +
                ", ISBNNumberOfBook =" + ISBNNumberOfBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getISBNNumberOfBook() == book.getISBNNumberOfBook() &&
                Objects.equals(getNameOfTheAuthor(), book.getNameOfTheBook()) &&
                Objects.equals(getNameOfTheAuthor(), book.getNameOfTheAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getNameOfTheAuthor(), getISBNNumberOfBook());
    }


}
