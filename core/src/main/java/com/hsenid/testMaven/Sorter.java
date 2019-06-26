/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hsenid.testMaven;

/**
 *
 */
public class Sorter {


    public static int[] insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int k = i;
            while (k > 0 && data[k-1] > temp) {
                data[k] = data[k-1];
                k = k - 1;
            }
            if(k==-1){
                k=0;
            }
            data[k] = temp;
        }
        return data;
    }

    public static int[] bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }

    public static int[] selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int minIndex = i;
            for (int j = i; j < data.length - 1; j++) {
                if (min >= data[j + 1]) {
                    min = data[j + 1];
                    minIndex = j + 1;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[minIndex] = temp;
        }
        return data;
    }

    public static void test() {
        System.out.println("yolo");
    }

    public static void print(int[] data) {
        for (int a : data) {
            System.out.print(a + " ");
        }
    }
}
