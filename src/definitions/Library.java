/*  Created by IntelliJ IDEA.
 *  User: Kavya Kumar
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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


}
