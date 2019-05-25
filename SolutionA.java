package com.company;

import java.util.Scanner;

public class SolutionA {
    public static int binarySearch(int array[], int start, int end) {
        // check conditions or edge cases
        if (end < start || start < 0 || end >= array.length) {
            return -1;
        }
        int midIndex = start +(end-start)/ 2;
        int midValue = array[midIndex];
        if (midValue == midIndex) {
            //trivial case
            int leftIndex = Math.min(midIndex - 1, midValue);
            int left = binarySearch(array, start, leftIndex);
            if (left == array[leftIndex]) {
                return leftIndex;
            }
            return midIndex;
        }
        // search left part of array
        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = binarySearch(array, start, leftIndex);
        if (left >= 0) {
            return left;
        }
        // search right part of array
        int rightIndex = Math.max(midIndex + 1, midValue);
        int right = binarySearch(array, rightIndex, end);
        return right;
    }

    //main function
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // total no of elements
        int size = sc.nextInt();
        // create array
        int IDs[] = new int[size + 1];
        // store user defined values at resp. position
        for (int i = 1; i < size + 1; i++) {
            IDs[i] = sc.nextInt();
        }
        // calc length of array
        int n = IDs.length;

        if (binarySearch(IDs, 1, n - 1) == -1) {
            // element not found
            System.out.print("NOT_FOUND");
        }
        else {
            // print value which matches with index
            System.out.print(binarySearch(IDs, 1, n - 1));
        }
    }
}
