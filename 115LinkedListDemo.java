package academy.learnprogramming;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "New York City, NY");
        addInOrder(placesToVisit, "Columbus, OH");
        addInOrder(placesToVisit, "Chicago, IL");
        addInOrder(placesToVisit, "Seattle, WA");
        addInOrder(placesToVisit, "San Francisco, CA");
        addInOrder(placesToVisit, "Los Angeles, CA");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Denver, CO");
        addInOrder(placesToVisit, "Chicago, IL");
        printList(placesToVisit);
        visit(placesToVisit);

    }
    private static void printList(LinkedList<String> LinkedList) {
        Iterator<String> i= LinkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> LinkedList, String newCity) {
        ListIterator<String> stringListIterator = LinkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                //Columbus, OH -> Chicago, IL
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.getFirst() == "") {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu(); }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true; }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available action:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}
