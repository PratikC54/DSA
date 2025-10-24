import java.util.Arrays;

/**
 * leetcode problem link -: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 * Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: True.
 */

public class Checkifthearrayissorted {
        static boolean check(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i+1]) {
                    count++;
                }
            }
            if(count == 0) return true;
            else return false;
        }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    if(check(arr)) System.out.println(Arrays.toString(arr)+" is sorted");
    else System.out.println(Arrays.toString(arr)+" Array is not sorted");
    }
}
