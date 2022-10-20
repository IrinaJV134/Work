import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {


    private Map<String, List<Contact>> storage = new HashMap<>();


    public boolean addGroup(String name) {
        if (!storage.containsKey(name)) {
            storage.put(name, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addContact(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!storage.containsKey(groupName))
                return false;
            storage.get(groupName).add(contact);
        }
        return true;
    }

    public List<Contact> findContacts(String groupName) {
        return new ArrayList<>(storage.get(groupName));
    }

    public Contact findContact(String phoneNumber) {
        for (List<Contact> group : storage.values()) {
            for (Contact contact : group) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    return contact;
                }
            }
            return null;
        }
        public static Contact createContact(String name, String phone) {
            return new Contact(name, phone);
        }
    }
}