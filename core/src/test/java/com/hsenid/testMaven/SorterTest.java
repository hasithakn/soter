/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hsenid.testMaven;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SorterTest {

    public int[] dataIn;
    public int[] dataIn2;
    public int[] dataOut;
    public int[] dataOut2;

    @BeforeMethod
    public void setUp() {

        dataIn = new int[]{89, 65, 43, 9, 5, 3, 8, 7, 6, 56, 12, 17, 19, 10, 15, 322};
        dataOut = new int[]{3, 5, 6, 7, 8, 9, 10, 12, 15, 17, 19, 43, 56, 65, 89, 322};

        dataIn2 = new int[]{78, 56, 89, 12, 45, 89, 36, 47, 0, 5, 8, 9, 6, 7, 4, 23, 89};
        dataOut2 = new int[]{0, 4, 5, 6, 7, 8, 9, 12, 23, 36, 45, 47, 56, 78, 89, 89, 89};

    }

    @Test
    public void testInsertionSort1() {
        int[] ints = Sorter.insertionSort(dataIn);
        assertTrue(Arrays.equals(ints, dataOut));
    }

    @Test
    public void testBubbleSort1() {
        int[] ints = Sorter.bubbleSort(dataIn);
        assertTrue(Arrays.equals(ints, dataOut));
    }

    @Test
    public void testSelectionSort1() {
        int[] ints = Sorter.selectionSort(dataIn);
        assertTrue(Arrays.equals(ints, dataOut));
    }

    @Test
    public void testInsertionSort2() {
        int[] ints = Sorter.insertionSort(dataIn2);
        assertTrue(Arrays.equals(ints, dataOut2));
    }

    @Test
    public void testBubbleSort2() {
        int[] ints = Sorter.bubbleSort(dataIn2);
        assertTrue(Arrays.equals(ints, dataOut2));
    }

    @Test
    public void testSelectionSort2() {
        int[] ints = Sorter.selectionSort(dataIn2);
        assertTrue(Arrays.equals(ints, dataOut2));
    }

    @AfterMethod
    public void tearDown() {
        dataIn = null;
        dataOut = null;
    }
}