package org.fersho.lectures.ch04_core_apis;

import java.util.Arrays;

public class ArraysSearching {

    public static void main(String[] args) {
        
        //Binary search (sorted array)

        int[] nums = {2,4,5,8,10};
        System.out.println(Arrays.binarySearch(nums, 2)); //0
        System.out.println(Arrays.binarySearch(nums, 4)); //1
        System.out.println(Arrays.binarySearch(nums, 1)); //-1
        System.out.println(Arrays.binarySearch(nums, 3)); //-2
        System.out.println(Arrays.binarySearch(nums, 9)); //-5
        System.out.println();
        //Binary search (unsorted array)
        System.out.println("Unsorted array");
        int[] numsUnsorted = {3, 2, 5, 1};
        System.out.println(Arrays.binarySearch(numsUnsorted, 2)); //1
        System.out.println(Arrays.binarySearch(numsUnsorted, 3)); //-3
        System.out.println(Arrays.binarySearch(numsUnsorted, 1)); //-1
        System.out.println(Arrays.binarySearch(numsUnsorted, 5)); //2
        System.out.println(Arrays.binarySearch(numsUnsorted, 4)); //-3


    }

}
