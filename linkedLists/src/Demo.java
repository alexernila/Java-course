import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Iasi");
        addInOrder(placesToVisit, "Brasov");
        addInOrder(placesToVisit, "Sibiu");
        addInOrder(placesToVisit, "Bucuresti");
        addInOrder(placesToVisit, "Cluj");
        addInOrder(placesToVisit, "Targoviste");
        addInOrder(placesToVisit, "Constanta");
        addInOrder(placesToVisit, "Timisoara");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Craiova");
        addInOrder(placesToVisit, "Suceava");
        printList(placesToVisit);
        visit(placesToVisit);

        placesToVisit.add("Iasi");
        placesToVisit.add("Brasov");
        placesToVisit.add("Sibiu");
        placesToVisit.add("Bucuresti");
        placesToVisit.add("Cluj");
        placesToVisit.add("Targoviste");
        placesToVisit.add("Constanta");
        placesToVisit.add("Timisoara");

        printList(placesToVisit);

        placesToVisit.add(1, "Vaslui");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> inkedList, String newCity){
        ListIterator<String> stringListIterator = inkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison>0){
                // newCity should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison<0){
                // move to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities");
            return;
        } else {
            System.out.println("Now visit " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:");
        System.out.println("0 - quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }
}
