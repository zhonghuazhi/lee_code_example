package net.cc.example;

/**
 * LeeCode 27 【移除元素】
 * <p>
 * 给你⼀个数组 nums 和⼀个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新⻓度。
 * 不要使⽤额外的数组空间，你必须仅使⽤ O(1) 额外空间并 原地 修改输⼊数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新⻓度后⾯的元素。
 *
 * @author [zhonghua]
 * @version 1.0
 * @classname Test2
 * @date 2025-10-22 20:22
 */
public class Test2 {

    public static int test(int[] nums, int op) {

        int flag = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != op) {
                nums[flag] = nums[i];
                flag++;
            }
        }

        return flag;
    }
}
