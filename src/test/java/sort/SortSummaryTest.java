package sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class SortSummaryTest {

    private int[] arr = {10,20,15,0,6,7,2,1,-5,55,7};

    private int[] right = {-5,0,1,2,6,7,7,10,15,20,55};

    @After
    public void tearDown() throws Exception {
        Assert.assertArrayEquals(right, arr);
    }

    @Test
    public void insertionSort() {
        SortSummary.insertionSort(arr);
    }

    @Test
    public void binarySearchInsertSort() {
        SortSummary.binarySearchInsertSort(arr);
    }

    @Test
    public void shellSort() {
        SortSummary.shellSort(arr);
    }

    @Test
    public void selectionSort() {
        SortSummary.selectionSort(arr);
    }

    @Test
    public void heapSort() {
        SortSummary.heapSort(arr);
    }

    @Test
    public void bubbleSort() {
        SortSummary.bubbleSort(arr);
    }

    @Test
    public void quickSort() {
        SortSummary.quickSort(arr);
    }

    @Test
    public void mergeSort() {
        SortSummary.mergingSort(arr);
    }
}