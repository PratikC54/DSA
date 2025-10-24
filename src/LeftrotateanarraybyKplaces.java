import java.util.Arrays;

/**
 * leetcode problem link -: https://leetcode.com/problems/rotate-array/description/\
 * Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
 * Input: array[] = {1,2,3,4,5,6,7} , k=2
 * Output: {6 7 1 2 3 4 5}
 */


public class LeftrotateanarraybyKplaces {
    /*
    //TC-: O(nXk)
    static void rotate(int[]arr,int k) {
        for (int i=0;i<k;i++){
            int first = arr[0];
            for (int j = 0; j < arr.length-1; j++){
                arr[j]=arr[j +1];
                if (j == arr.length-2) arr[arr.length-1] = first;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

     */

    //Optimal solution
    //TC-: O(n)
    static void rotate(int[]arr,int k) {
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr, k, arr.length-1);
    }

    static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        rotate(arr,7);
        System.out.println(Arrays.toString(arr));
    }
}