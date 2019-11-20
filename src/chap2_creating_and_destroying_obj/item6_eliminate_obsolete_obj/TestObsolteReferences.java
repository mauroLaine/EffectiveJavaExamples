package chap2_creating_and_destroying_obj.item6_eliminate_obsolete_obj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.EmptyStackException;

public class TestObsolteReferences {

    public static void main(String[] args) {

        //*** Eliminate obsolete object references ***

        // - Generally speaking, whenever a class manages its own memory, the programmer should be alert
        //      for memory leaks
        // - Nulling out object references should be the exception rather than the norm
        // - Another common source of memory leaks is caches
        // - A third common source of memory leaks is listeners and other callbacks

        try {
            //Read the memory leak definition in memory_leak.txt
            final BufferedReader br = new BufferedReader(new FileReader("assets/memory_leak.txt"));
            try {
                while (br.readLine() != null) {
                    System.out.println(br.readLine());
                }
                Thread.sleep(500000);
            } finally {
                br.close(); //close the buffer
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Stack {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            // this creates a Memory leak
            //return elements[--size];

            Object result = elements[--size];
            elements[size] = null; // Eliminate obsolete reference
            return result;
        }

        private void ensureCapacity() {
            if (elements.length == size)
                elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
