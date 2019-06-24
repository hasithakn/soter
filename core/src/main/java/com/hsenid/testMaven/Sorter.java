package com.hsenid.testMaven;

public class Sorter {

    public int[] insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int k = i - 1;
            while (k > 0 && data[k] > temp) {
                data[k + 1] = data[k];
                k = k - 1;
            }
            data[k] = temp;
        }
        return data;
    }

    public int[] bubbleSort(int[] data) {
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

    public int[] selectionSort(int[] data) {
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

    public void print(int[] data) {
        for (int a : data) {
            System.out.print(a + " ");
        }
    }
}
