package net.cc.example;

/**
 * LeeCode 283 【移动零】
 * <p>
 * 给定⼀个数组 nums，编写⼀个函数将所有 0 移动到数组的末尾，同时保持⾮零元素的相对顺序。
 *
 * @author [zhonghua.zhi]
 * @version 1.0
 * @classname Test3
 * @date 2025-10-22 20:59
 * @description zhizh@asiainfo.com
 */
public class Test3 {

    public static void test(int[] nums){

        int flag = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                nums[flag] = nums[i];
                flag++;
            }
        }

        for(int i = flag; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}
