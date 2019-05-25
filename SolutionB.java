package com.company;

import java.util.Scanner;

public class SolutionB {
    private static int binarySearch( final int[] array,int start,int end, final int value) {
        // Loop until we reach the last element.
        while (start <= end) {
            // Find the mid-point of the array.
            int middle = (start + end) / 2;
            // If the value is found at the
            // mid-point, return it.
            if (array[middle] == value) {
                return middle;
            }
            // Otherwise, cut the range in half
            // before looping.
            if (array[middle] < value) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        // Return -1 to indicate the
        // element was not found.
        return -1;
    }

    // To search for the key element
    static int findKey(int arr[], int key)
    {
        int i=0;
        while (true) {
            // return index, if key match with index
            if(arr[i] == key) {
                return i;
            }
            // increment index value
            else if(key > arr[i]) {
                i++;
            }
            else {
                break;
            }
        }
        return binarySearch(arr, i/2, i, key);
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // total no of elements
        int size = sc.nextInt();
        // key element which we want to search for in array
        int key = sc.nextInt();
        // create array
        int[] array = new int[size+1];
        // store user defined values at resp. position
        for(int i = 1; i< size+1; i++)
        {
            array[i] = sc.nextInt();
        }
        int ans = findKey(array,key);
        if (ans==-1) {
            // element not found
            System.out.print("NOT_FOUND");
        }
        else{
            // print value if found
            System.out.print(ans);
        }
    }
}
