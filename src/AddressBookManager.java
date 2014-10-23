import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by student on 23.10.2014.
 */
public class AddressBookManager {
    public static void main(String[] args) {
        AddressBook book1 = new AddressBook();
        int count = AddressBook.getCount(book1);

        Address a1 = new Address();
        a1.name = "Ignat";
        a1.telephone = "123";
        a1.mail = "123312";

        AddressBook.addNew(book1,a1 );
        System.out.println(AddressBook.getCount(book1));
        AddressBook.printBook(book1);
    }
}
