import com.sun.xml.internal.ws.api.addressing.AddressingVersion;

/**
 * Created by student on 23.10.2014.
 */
public class AddressBook {
    private Address[] list = new Address[100];
    private int count = 0;

    public static int getCount(AddressBook book) {
        return book.count;
    }

    public static void addNew(AddressBook book, Address newAddress) {
        book.list[book.count] = newAddress;
        book.count++;
    }
    public static void printBook(AddressBook book){
        for(int i=0; i<book.count; i++){
            Address a = book.list[i];
            System.out.println(a.name + " " + a.telephone + " " + a.mail);
        }
    }
}
