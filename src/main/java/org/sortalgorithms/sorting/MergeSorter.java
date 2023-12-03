package org.sortalgorithms.sorting;

import java.util.ArrayList;

public class MergeSorter {
    public void sort(ArrayList<Integer> inputArray) {
        int lenArray = inputArray.size();
        this.divide(inputArray, 0, inputArray.size() - 1);
    }

    public void divide(ArrayList<Integer> array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            divide(array, left, mid);
            divide(array,mid + 1, right);
            merge(array, left, right);
        }
    }

    private static void merge(ArrayList<Integer> array, int left, int right) {

        int mid = left + (right - left) / 2;
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();

        for (int i = left; i < (mid + 1); i++)
            firstArray.add(array.get(i));

        for (int j = mid + 1; j <= right; j++)
            secondArray.add(array.get(j));

        int i = 0, j = 0;
        int k = left;

        int firstArraySize = firstArray.size();
        int secondArraySize = secondArray.size();

        while (i < firstArraySize && j < secondArraySize) {
            if (firstArray.get(i) < secondArray.get(j)) {
                array.set(k, firstArray.get(i));
                i++;
            }
            else {
                array.set(k, secondArray.get(j));
                j++;
            }
            k++;
        }

        while (i < firstArraySize) {
            array.set(k, firstArray.get(i));
            i++;
            k++;
        }

        while (j < secondArraySize) {
            array.set(k, secondArray.get(j));
            j++;
            k++;
        }

    }
}
