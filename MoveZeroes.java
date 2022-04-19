package org.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (nums == null || len == 1) return;
        int curr = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0 && curr != i) {
                nums[curr] = nums[i];
                nums[i] = 0;
                curr++;
            } else if (nums[i] != 0) {
                curr++;
            }
        }
    }
}
