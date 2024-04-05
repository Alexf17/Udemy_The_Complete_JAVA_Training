package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryStore {
    private static final ArrayList<String> groceryList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addGroceryItem();
                    break;
                case 2:
                    removeGroceryItem();
                    break;
                case 3:
                    displayGroceryList();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nGrocery Store Menu:");
        System.out.println("1. Add a Grocery Item");
        System.out.println("2. Remove a Grocery Item by Index");
        System.out.println("3. Display the Grocery List");
        System.out.println("4. Exit the Program");
        System.out.print("Enter your choice: ");
    }

    private static void addGroceryItem() {
        System.out.print("Enter the name of the grocery item: ");
        String item = scanner.nextLine();
        groceryList.add(item);
        System.out.println(item + " added to the grocery list.");
    }

    private static void removeGroceryItem() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
            return;
        }
        System.out.print("Enter the index of the item to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < groceryList.size()) {
            String removedItem = groceryList.remove(index);
            System.out.println(removedItem + " removed from the grocery list.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void displayGroceryList() {
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
            return;
        }
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
}
