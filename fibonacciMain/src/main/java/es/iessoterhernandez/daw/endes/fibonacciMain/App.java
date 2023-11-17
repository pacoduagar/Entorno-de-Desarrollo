package es.iessoterhernandez.daw.endes.fibonacciMain;

/**
 * Hello world!
 *
 */
import java.util.Arrays;

import es.iessoterhernandez.daw.endes.Fibonacci;


public class App {

    public static void main(String[] args) {

    	final int NUMBER = 23;
        int[] sequence = Fibonacci.fibonacci(NUMBER);

        System.out.println("F(" + NUMBER + ") = " + Arrays.toString(sequence));

    }

}