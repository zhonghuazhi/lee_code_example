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

        int[] nums = {1,2,3,1,1,2};
        int op = Test2.test(nums ,1);

        log.info("op :{} ,nums:{}", op, Arrays.toString(nums));
    }
}
