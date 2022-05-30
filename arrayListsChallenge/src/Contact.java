
import java.util.ArrayList;

public class Contact {
    private ArrayList<String> contactsList = new ArrayList<String>();

    public void printContactList() {
        System.out.println("You have " + contactsList.size() + " entries in your contacts.");
        for (int i=0; i<contactsList.size(); i++) {
            System.out.println((i+1) + ". " + contactsList.get(i));
        }
    }

    public void addEntry(String name) {
        contactsList.add(name);
    }

    public void modifyEntry(String currentEntry, String newEntry) {
        int position = findEntry(currentEntry);
        if (position >= 0) {
            modifyEntry(position, newEntry);
        }
    }

    public void modifyEntry(int position, String newEntry) {
        contactsList.set(position, newEntry);
        System.out.println("Contacts entry " + (position+1) + " has been modified.");
    }

    private int findEntry(String searchEntry) {
        return contactsList.indexOf(searchEntry);
    }

    public void removeEntry(String entry) {
        int position = findEntry(entry);
        if (position >= 0) {
            removeEntry(position);
        }
    }

    private void removeEntry(int position) {
        contactsList.remove(position);
    }

    public boolean inContacts(String searchEntry) {
        int position = findEntry(searchEntry);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
