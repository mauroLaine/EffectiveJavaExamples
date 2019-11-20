package chap2_creating_and_destroying_obj.item7_avoid_finalizers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestAvoidingFinalizers {

    public static void main(String[] args) {

        //*** Avoid finalizers ***

        //Finalizers are unpredictable, often dangerous, and generally unnecessary
        // It can take arbitrarily long between the time that an object becomes unreachable and
        // the time that its finalizer is executed. This means that:
        //      - you should never do anything time-critical in a finalizer
        //      - never depend on a finalizer to update critical persistent state
        //      - there is a severe performance penalty for using finalizers
        // If an uncaught exception is thrown during finalization, the exception is ignored,
        // and finalization of that object terminates. Uncaught exceptions can leave objects
        // in a corrupt state

        try {
            final BufferedReader br = new BufferedReader(new FileReader("assets/memory_leak.txt"));
            //Explicit termination methods are typically used in combination with the try-finally
            // construct to ensure termination
            try {
                while (br.readLine() != null) {
                    System.out.println(br.readLine());
                }
            } finally {
                //The termination method should do whatever is required to free the critical resource
                br.close(); //close the buffer
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
