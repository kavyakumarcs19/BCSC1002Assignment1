/*  Created by IntelliJ IDEA.
 *  User: Kavya Kumar
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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


}
