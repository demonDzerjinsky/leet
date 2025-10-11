package ru.dzerjinsky.leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int last = nums.length - 1;
        while (last >= 0 && nums[last] == val) {
            last--;
        }
        for (int i = last; i >= 0; i--) {
            if (nums[i] == val) {
                nums[i] = nums[last--];
            }
        }
        return last + 1;
    }
}
