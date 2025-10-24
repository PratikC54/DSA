/**
 * Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 5
 *  TC-: O(n)  n->length of array
 *  SC-: O(1)
 */


public class SecondLargestWithoutSorting {
    static int secondLargest(int[] arr) {
        if(arr.length<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > large) {
                secondlarge = large;
                large = i;
            } else if (i > secondlarge && i != large) {
                secondlarge = i;
            }
        }
        return secondlarge;


        /*
//        By sorting -> This leads the time complexity to O(n log n)
        Arrays.sort(arr);
        return arr[arr.length-2];
         */

    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,9,5};
        System.out.println("SecondLargest element is : "+secondLargest(arr));
    }
}
