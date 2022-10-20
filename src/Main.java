//package phoneBook;
import java.util.List;

import phoneBook.PhoneBook.createContact;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        fillGroups(phoneBook);
        fillContacts(phoneBook);


        Contact contactByNumber = phoneBook.findContact("89285895648");
        System.out.println("По номеру телефона \" + 89285895648\" найден контакт " + contactByNumber);

        List<Contact> workContacts = phoneBook.findContacts("Работа");
        System.out.println("Коллеги:");
        for (Contact workContact : workContacts) {
            System.out.println(workContact);
        }
    }
         private static void  fillContacts(PhoneBook phoneBook ) {
        phoneBook.addContact(
                createContact("Мама", "89282583695"),
             "Сeмья", "Друзья");

             phoneBook.addContact(
                     createContact("Папа", "89282583628"),
                     "Сeмья", "Друзья");

             phoneBook.addContact(
                     createContact("Брат", "89285895648"),
                     "Сeмья", "Работа");

             phoneBook.addContact(
                     createContact("Светлана", "89282583695"),
                     "Сeмья", "Работа");

    }
    private static void fillGroups(PhoneBook phoneBook){
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");
    }

}
