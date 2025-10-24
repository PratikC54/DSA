import java.util.Arrays;

/**
 * leetcode problem link -: https://leetcode.com/problems/rotate-array/description/
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: 2,3,4,5,1
 */

public class LeftRotatetheArraybyOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int first = arr[0];
        for (int i=0;i< arr.length-1;i++){
            arr[i]=arr[i+1];
            if (i== arr.length-2) arr[arr.length-1] = first;
        }
        System.out.println(Arrays.toString(arr));


    }
}
