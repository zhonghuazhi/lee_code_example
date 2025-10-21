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

        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6};
        int op = Test1.test(nums);

        log.info("op :{} ,nums:{}", op, Arrays.toString(nums));
    }
}
