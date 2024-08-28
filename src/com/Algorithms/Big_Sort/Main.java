package com.Algorithms.Big_Sort;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    /*
     * Complete the bigSorting function below.
     */
    public static String[] bigSorting(String[] unsorted) {

        TreeSet<BigInteger> tm = new TreeSet<BigInteger>();
        BigInteger[] array = new BigInteger[unsorted.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new BigInteger(unsorted[i]);
            tm.add(new BigInteger(unsorted[i]));
        }
        array = countingSort(array,tm.last());
        for (int i = 0; i < array.length; i++) {
            unsorted[i] = array[i].toString();
        }
        return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] result = bigSorting(new String[]{"20", "1", "4", "4", "31415926535897932384626433832795", "8"});



        scanner.close();
    }
    public static BigInteger[] countingSort(BigInteger[] theArray, BigInteger maxValue) {

        // array of 0's at indices 0...maxValue
        BigInteger numCounts[] = new BigInteger[ maxValue.intValue() + 1];

        // populate numCounts
        for (BigInteger num : theArray) {
            numCounts[num.intValue()].add(new BigInteger("1"));
        }

        // populate the final sorted array
        BigInteger[] sortedArray = new BigInteger[theArray.length];
        BigInteger currentSortedIndex = new BigInteger("0");

        // for each num in numCounts
        for (int num = 0; num < numCounts.length; num++) {
            int count = numCounts[num].intValue();

            // for the number of times the item occurs
            for (int i = 0; i < count; i++) {

                // add it to the sorted array
                sortedArray[currentSortedIndex.intValue()] = new BigInteger(String.valueOf(num)) ;
                currentSortedIndex.add(new BigInteger("1"));
            }
        }

        return sortedArray;
    }
}
