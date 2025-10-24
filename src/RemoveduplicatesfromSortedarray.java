/**
 * leetcode problem link -: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Input: arr[]=[1,1,2,2,2,3,3]
 * Output: [1,2,3,_,_,_,_]
 */

public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=arr[j]) {
                arr[j+1]=arr[i];
                j++;
            }
        }
        System.out.println("Array without duplicates using in-place ");
        for (int i=0;i<=j;i++) System.out.print(arr[i]+" ");

    }
}
