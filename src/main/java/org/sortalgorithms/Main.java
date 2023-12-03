package org.sortalgorithms;

import org.sortalgorithms.sorting.MergeSorter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = DataReader.readNumbersFromFile("FewSmallNumbers.txt");

        System.out.println("Unsorted array: " + arrayList);

        MergeSorter mergeSorter = new MergeSorter();
        mergeSorter.sort(arrayList);

        System.out.println("Sorted array trough Merge Sort: " +arrayList);
    }
}