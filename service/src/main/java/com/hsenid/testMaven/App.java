package com.hsenid.testMaven;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int data[] = new int[args.length - 1];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(args[i + 1]);
        }
        int[] ints = {};

        //check sorting method
        if (args[0].equals("B")) {
            System.out.println("Bubble sort selected");
            ints = Sorter.bubbleSort(data);
        } else if (args[0].equals("S")) {
            System.out.println("Selection sort selected");
            ints = Sorter.selectionSort(data);
        } else if (args[0].equals("I")) {
            System.out.println("Insertion sort selected");
            ints = Sorter.insertionSort(data);
        }

        //finally
        Sorter.print(ints);
    }
}
