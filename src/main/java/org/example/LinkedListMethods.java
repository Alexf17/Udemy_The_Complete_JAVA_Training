package org.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
    public static void main(String[] args) {
        var fruitsToVisit = new LinkedList<String>();

        fruitsToVisit.add("Apple");
        fruitsToVisit.add(0, "Banana");
        System.out.println(fruitsToVisit);

        addMoreFruits(fruitsToVisit);
        System.out.println(fruitsToVisit);

//        removeFruits(fruitsToVisit);
//        System.out.println(fruitsToVisit);

        //  gettingFruits(fruitsToVisit);
        printItinerary3(fruitsToVisit);
    }

    private static void addMoreFruits(LinkedList<String> list) {

        list.addFirst("Pineapple");
        list.addLast("Mango");
        // Queue methods
        list.offer("Orange");
        list.offerFirst("Papaya");
        list.offerLast("Kiwi");
        // Stack Methods
        list.push("Grapes");
    }

    private static void removeFruits(LinkedList<String> list) {
        list.remove(4);
        list.remove("Papaya");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        String p1 = list.poll();
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Apple");
        list.push("Papaya");
        list.push("Banana");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void gettingFruits(LinkedList<String> list) {

        System.out.println("Retrieved Fruit = " + list.get(4));
        System.out.println("First Fruit = " + list.getFirst());
        System.out.println("Last Fruit = " + list.getLast());
        System.out.println("Pineapple is at position: " + list.indexOf("Pineapple"));
        System.out.println("Orange is at position: " +
                list.lastIndexOf("Orange"));

        System.out.println("Element from element() = " + list.element());
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Starts Eating " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Ends Eating " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Starts Eating " + list.getFirst());
        String previousFruit = list.getFirst();
        for (String fruit : list) {
            System.out.println("--> From: " + previousFruit + " to " + fruit);
            previousFruit = fruit;
        }
        System.out.println("Ends Eating " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Starts Eating " + list.getFirst());
        String previousFruit = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var fruit = iterator.next();
            System.out.println("--> From: " + previousFruit + " to " + fruit);
            previousFruit = fruit;
        }
        System.out.println("Ends Eating " + list.getLast());
    }


}
