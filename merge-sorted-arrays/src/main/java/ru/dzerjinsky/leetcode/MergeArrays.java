package ru.dzerjinsky.leetcode;

public class MergeArrays {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (nums2[0] >= nums1[m - 1]) {
            System.arraycopy(nums2, 0, nums1, m, n);
            return;
        }
        if (nums2[n - 1] <= nums1[0]) {
            System.arraycopy(nums1, 0, nums1, n, m);
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int last = n + m - 1;
        while (n > 0 && m > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last--] = nums1[(m--) - 1];
            } else if (nums1[m - 1] < nums2[n - 1]) {
                nums1[last--] = nums2[(n--) - 1];
            } else {
                nums1[last--] = nums1[(m--) - 1];
                nums1[last--] = nums2[(n--) - 1];
            }
        }
        if (n > 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }

    }
}
