package org.example;

import java.util.LinkedList;

public class QueueAndStack {
    public static void main(String[] args) {
        Queue queue = new Queue();
//        FirstInFirstOut___FIFO
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        Stack stack = new Stack();
//        LastInFirstOut___LIFO

        for (int i = 1; i <= 3; i++) {
            stack.push(i * 10);
        }

        for (int i = 1; i <= 4; i++) {
            System.out.println(stack.pop());
        }

    }

    static class Queue {
        private final LinkedList<Integer> list;

        public Queue() {
            list = new LinkedList<Integer>();
        }

        public void enqueue(int value) {
            list.addLast(value);
        }

        public int dequeue() {
            if (list.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return list.removeLast();
            }
        }
    }

    static class Stack {
        private final LinkedList<Integer> list;

        public Stack() {
            list = new LinkedList<Integer>();
        }

        public void push(int value) {
            list.addLast(value);
        }

        public int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return list.removeLast();
            }
        }
    }
}
