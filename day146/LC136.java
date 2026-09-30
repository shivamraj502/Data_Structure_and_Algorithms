/**Day 146 – Bit Manipulation Basics
Concept: AND, OR, XOR, shifts, bit masks.
Problem: Single Number – LeetCode 136
Goal: Learn XOR pattern tricks. */
import java.util.*;
public class LC136 {
    public static int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {count++;}
            }

            if(count == 1) {return nums[i];}
        }return -1;
    }

    public static int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums) {
            if(map.get(num) == 1) {return num;}
        }return -1;
    }
    
    public static int singleNumber3(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }return set.iterator().next();
    }

    public static int singleNumber4(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,2,4,1};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));
        System.out.println(singleNumber4(nums));
        
    }
}
