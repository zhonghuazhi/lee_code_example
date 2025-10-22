package net.cc.example;

import lombok.extern.slf4j.Slf4j;

/**
 * LeeCode 26【删除有序数组中的重复项】
 * <p>
 * 给你⼀个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现⼀次 ，返回删除后数组的
 * 新⻓度。元素的 相对顺序 应该保持 ⼀致 。
 * <p>
 * 由于在某些语⾔中不能改变数组的⻓度，所以必须将结果放在数组nums的第⼀部分。更规范地说，如果在删除重
 * 复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * <p>
 * 将最终结果插⼊ nums 的前 k 个位置后返回 k
 *
 * @author [zhonghua.zhi]
 * @version 1.0
 * @classname Test1
 * @date 2025-10-21 14:59
 * @description zhizh@asiainfo.com
 */
@Slf4j
public class Test1 {

    public static int test(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if(i == 0 || nums[i] != nums[i - 1]){
                nums[j] = nums[i];

                j+=1;
            }
        }

        return j;
    }
}
