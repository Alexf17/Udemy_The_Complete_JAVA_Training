package org.example;

import java.util.LinkedList;

public class QueueAndStack2 {
    public static void main(String[] args) {
        Stack<HardwareItem> stack = new Stack<HardwareItem>();

        // Push hardware items onto the stack using a loop
        stack.push(new HardwareItem("Hammer"));
        stack.push(new HardwareItem("Screwdriver"));
        stack.push(new HardwareItem("Wrench"));

        // Pop hardware items from the stack using a loop
        for (int i = 1; i <= 4; i++) {
            HardwareItem item = stack.pop();
            if (item != null) {
                System.out.println("Popped: " + item.getItemName());
            }
        }
    }

    static class HardwareItem {
        private final String itemName;

        public HardwareItem(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return itemName;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }

    static class Stack<T> {
        private final LinkedList<T> list;

        public Stack() {
            list = new LinkedList<T>();
        }

        public void push(T item) {
            list.addLast(item);
        }

        public T pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty");
                return null;
            } else {
                return list.removeLast();
            }
        }
    }

}
