package net.cc.example;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {

        log.info("Hello world!");

        int[] nums = {1,0,0,0,0,2,3,4,5};
        Test3.test(nums);

        log.info("op :{} ,nums:{}", 0, Arrays.toString(nums));
    }
}
