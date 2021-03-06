/*  Created by IntelliJ IDEA.
 *  User: Kavya Kumar
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    public Book[] market;

    public Library(Book[] market) {
        this.market = market;
    }

    public Library() {
        this.market = new Book[10];
        for (int page = 0; page < market.length; page++) {
            market[page] = new Book("Book" + (page + 1), null, 8563259874121L + (page + 1));
        }
    }

    public Book[] getMarket() {
        return market;
    }

    public void setMarket(Book[] market) {
        this.market = market;
    }

    /*
     * This method will show a list of all the books in our inventory.
     */

    public void listOfOurInventory() {
        for (Book book : market) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "Market =" + Arrays.toString(market) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getMarket(), library.getMarket());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getMarket());
    }


}
