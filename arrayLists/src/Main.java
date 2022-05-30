import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n Press:");
        System.out.println("\t 0 - To print options");
        System.out.println("\t 1 - To print list");
        System.out.println("\t 2 - To add item");
        System.out.println("\t 3 - To modify item");
        System.out.println("\t 4 - To remove item");
        System.out.println("\t 5 - To search item");
        System.out.println("\t 6 - To quit app");
    }

    public static void addItem(){
        System.out.println("Please enter your grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to  search for");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in your list");
        } else {
            System.out.println(searchItem + " is not on your shopping list");
        }
    }
}
