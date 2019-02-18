package pl.sda.jvm.visualvm;

import java.util.*;

public class MemoryLeak {
    private static final int STRING_COUNT = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Stack stack = new Stack();
        for (int i = 0; i < STRING_COUNT; i++) {
            stack.push(UUID.randomUUID().toString());
        }
        do {
            System.out.println("Stack size: " + stack.size());
            System.out.println("Pop value: " + stack.pop());
            Thread.sleep(1);
        } while (0 < stack.size());
    }

    // Effective Java example
    private static class Stack {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        Object pop() {
            if (size == 0) {
                throw new EmptyStackException();
            }
            return elements[--size];
        }

        int size()  {
            return size;
        }

        private void ensureCapacity() {
            if (elements.length == size) {
                elements = Arrays.copyOf(elements, 2 * size + 1);
            }
        }
    }
}
