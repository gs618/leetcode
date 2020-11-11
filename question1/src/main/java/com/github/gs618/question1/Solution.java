package com.github.gs618.question1;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author sgao
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> matchMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            if(matchMap.containsKey(nums[i])){
                return new int[]{matchMap.get(nums[i]), i};
            }
            matchMap.put((target-nums[i]), i);
        }
        return null;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        int[] pool = new int[]{3,11,2,6,3,7,4,3,2,32,2,32,32,3,23,2,32,32,32,31,3,44,54,56,6,56,67,67,67,8, 2, 3, 4, 6, 1};
        int[] ints = new Solution().twoSum(pool, 31);
        Instant end = Instant.now();
        if(Objects.nonNull(ints)) {
            System.out.println(String.format("Result is [%d, %d] -> [%d, %d], duration is %d ms",
                    ints[0], ints[1], pool[ints[0]], pool[ints[1]], Duration.between(start, end).toMillis()));
        } else {
            System.out.println(String.format("Not result found, duration is %d ms",
                    Duration.between(start, end).toMillis()));
        }
    }
}
