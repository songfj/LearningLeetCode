package org.leetcode;

public class RemoveDuplicate {
    /**
     *给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     *
     * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
     *
     * 将最终结果插入 nums 的前 k 个位置后返回 k 。
     *
     * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int curr = 0;
        int next = curr + 1;
        int size = nums.length;
        while (next < size) {
            if ((nums[curr] ^ nums[next]) != 0) {
                if (next - curr > 1) {
                    nums[curr + 1] = nums[next];
                }
                curr += 1;
            }
            next += 1;
        }
        return curr + 1;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int curr = 0;
        int next = curr + 1;
        int size = nums.length;
        while (next < size) {
            if ((nums[curr] ^ nums[next]) == 0) {
                next += 1;
            } else {
                if (next - curr > 1) {
                    nums[curr + 1] = nums[next];
                }
                curr += 1;
                next += 1;
            }
        }
        return curr + 1;
    }
}
