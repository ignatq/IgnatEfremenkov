/**
 * Created by student on 23.10.2014.
 */
public class AddressBook {
    private Address[] list = new Address[100];
    private int count = 0;

    public static int getCount(AddressBook book) {
        return book.count;
    }

    public static Address getAddres(int i, AddressBook book) {
        return book.list[i];
    }

    public static void addNew(AddressBook book, Address newAddress) {
        book.list[book.count] = newAddress;
        book.count++;
    }

    public static void printBook(AddressBook book) {
        for (int i = 0; i < book.count; i++) {
            Address a = book.list[i];
            print(i, a);
        }
    }

    /*
    public static int find(AddressBook book, String search) {
             for (int i = 0; i < book.count; i++) {
            Address a = book.list[i];
            if (search.equals(a.name)) {
                return i;
            }
        }
        return -1;
    }
    */


    public static int[] find(AddressBook book, String search) {
        int found = 0;
        int k =0;
        for (int i = 0; i < book.count; i++) {
            Address a = book.list[i];
            if (a.name.contains(search)) {
                found++;
            }
        }
        int[] searchmass = new int[found];
        for (int i = 0; i < book.count; i++) {
            Address a = book.list[i];
            if (a.name.contains(search)) {
                searchmass[k]= i;
                k++;
            }
        }
        return searchmass;
    }


    public static void print(int i, Address address) {
        System.out.println(i + " " + address.name + " " + address.telephone + " " + address.mail);

    }

    public static void delete(int delIndex, AddressBook book) {
        for (int i = delIndex; i < book.count - 1; i++) {
            book.list[i] = book.list[i + 1];
        }
        book.count--;


    }
}