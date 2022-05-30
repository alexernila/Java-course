import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact contacts = new Contact();

    public static void printContacts() {
        contacts.printContactList();
    }

    public static void addContact() {
        System.out.println("Please enter the contact name: ");
        contacts.addEntry(scanner.nextLine());
    }

    public static void updateContact() {
        System.out.println("Current entry: ");
        String currentEntry = scanner.nextLine();
        System.out.println("Enter new entry: ");
        String newEntry = scanner.nextLine();
        contacts.modifyEntry(currentEntry, newEntry);
    }

    public static void removeContact() {
        System.out.print("Enter contact: ");
        String entryNo = scanner.nextLine();
        contacts.removeEntry(entryNo);
    }

    public static void findContact() {
        System.out.print("Contact to search for: ");
        String searchContact = scanner.nextLine();
        if (contacts.inContacts(searchContact)) {
            System.out.println("Found " + searchContact + " in your contacts.");
        } else {
            System.out.println(searchContact + " is not in your contacts.");
        }
    }
}
