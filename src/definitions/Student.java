/*  Created by IntelliJ IDEA.
 *  User: Kavya Kumar
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String nameOfTheStudent;
    private long rollNumberOfUniversity;
    private Book[] nameOfTheBook;
    private int codeOfTheIssuedBook = 0;

    public Student(String nameOfTheStudent, long rollNumberOfUniversity, int codeOfTheIssuedBook, Book[] nameOfTheBook) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.rollNumberOfUniversity = rollNumberOfUniversity;
        this.codeOfTheIssuedBook = codeOfTheIssuedBook;
        this.nameOfTheBook = nameOfTheBook;
    }

    public Student() {
        this.nameOfTheBook = new Book[5];
    }

    public Book[] getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(Book[] nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    /*
     * This method will help us to issue a book.
     */


}
