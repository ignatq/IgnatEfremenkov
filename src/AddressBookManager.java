import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by student on 23.10.2014.
 */
public class AddressBookManager {
    public static void main(String[] args) {
        AddressBook book1 = new AddressBook();
//        int count = AddressBook.getCount(book1);
//
//        Address a1 = new Address();
//        a1.name = "Ignat";
//        a1.telephone = "123";
//        a1.mail = "123312";
//
//        AddressBook.addNew(book1,a1 );
//        System.out.println(AddressBook.getCount(book1));
//        AddressBook.printBook(book1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить запись");
            System.out.println("2. Поиск Записей");
            System.out.println("3. Вывод всех записей");
            System.out.println("4. Удаление записи");
            System.out.println("5. Изменение запси");
            System.out.println("6. Выход");

            int command = scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("Введите имя записи");
                    String name = scanner.next();
                    System.out.println("Введите номер телефона");
                    String phone = scanner.next();
                    System.out.println("Введите email");
                    String mail = scanner.next();
                    Address newadr = new Address();
                    newadr.name = name;
                    newadr.telephone=phone;
                    newadr.mail=mail;
                    AddressBook.addNew(book1, newadr);
                    break;
                case 2:
                    System.out.println("Введите имя для поиска");
                    String sname = scanner.next();
                    int[] index = AddressBook.find(book1, sname);

                    if (index.length == 0 ){
                        System.out.println("Запись не найдена");
                    }
                    else {
                        for (int i = 0; i < index.length; i++) {
                            Address found =AddressBook.getAddres(index[i], book1);
                            AddressBook.print(index[i], found);
                        }
                    }
                    break;
                case 3:AddressBook.printBook(book1);
                    break;
                case 4:
                    System.out.println("Введите номер записи для удаления");
                    int delind = scanner.nextInt();
                    AddressBook.delete(delind, book1);
                    break;
                case 5:
                    System.out.println("Введите номер запси для изменения");
                    int updateInd = scanner.nextInt();
                    Address update  = AddressBook.getAddres(updateInd, book1);
                    AddressBook.print(updateInd,update);
                    System.out.println("Введите номер поля которое хотите изменить(1-3)");
                    int nomerPolya = scanner.nextInt();
                    if (nomerPolya == 1){
                        System.out.println("Введите новое имя");
                        String newName = scanner.next();
                        update.name = newName;
                    }
                    else if (nomerPolya == 2){
                        System.out.println("Введите новый номер телефона");
                        String newPhone = scanner.next();
                        update.telephone = newPhone;
                    }
                    else if (nomerPolya == 3){
                        System.out.println("Введите новый номер телефона");
                        String newMail = scanner.next();
                        update.mail = newMail;
                    }
                    else {
                        System.out.println("Неверный номер поля");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Неправильный номер. Повторите еще раз");
                    break;
            }

        }
    }
}
