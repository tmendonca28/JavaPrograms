package com.mendonca;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

//        placesToVisit.add(1, "Alice Springs");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> ll) {
        Iterator<String> i = ll.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // do not add since equal
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
        }
    }

}
