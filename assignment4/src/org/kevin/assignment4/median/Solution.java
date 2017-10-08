package org.kevin.assignment4.median;

import java.util.Arrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0;
        while (i < m || j < n) {
            if (i == m) {
                mergedArray[i + j] = nums2[j];
                j++;
            } else if (j == n) {
                mergedArray[i + j] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                mergedArray[i + j] = nums1[i];
                i++;
            } else {
                mergedArray[i + j] = nums2[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(mergedArray));

        if ((m + n) % 2 != 0) {
            return mergedArray[(m + n) / 2];
        } else {
            return (mergedArray[(m + n) / 2 - 1] + mergedArray[(m + n) / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 1, 1}, new int[]{2, 2, 2}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 1, 1}, new int[]{1, 2, 3}));
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 1, 2}, new int[]{2, 2, 3}));
    }
}
