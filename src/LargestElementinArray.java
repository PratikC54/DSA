/**
 * Problem Statement: Given an array, we have to find the largest element in the array.
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * TC-O(n)  n->length of array
 * SC-O(1)
 */



public class LargestElementinArray {
    static int largest(int[]arr) {
        int largest = arr[0];
        for (int i : arr)
            if (i>largest) largest=i;
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println("Largest element in array : "+largest(arr));
    }
}
