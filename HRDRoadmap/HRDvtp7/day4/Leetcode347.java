// package HRDRoadmap.HRDvtp7.day4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Leetcode347 {          //arraylist, hashset, hashmap,priorityQueue,Arraydeque 
    public static int[] topKFrequent3(int[] nums, int k) {
        
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }return result;
    }

    public static int[] topKFrequent2(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[k];
        int count =0;

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], 1);
                if(count < k){ 
                    res[count++]=nums[i];
                }else return res;
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }return res;
    }
    public static int[] topKFrequent1(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int [] res = new int[set.size()];
        for(int i=0;i<set.size();i++){
            // res[i] = set.remove(res);
        }

        int [] newRes = new int[k];
        for(int i=0;i<k;i++){
            newRes[i] = res[i];
        }return newRes;
    }
    public static void main(String[] args) {
        int [] arr = {3,0,1,0};
        int k = 2;
        int [] res = topKFrequent3(arr, k);

        for(int n:res){
            System.out.println(n);
        }  
    }
}


//  Mistakes:
        // for(Set<Map.Entry<Integer,Integer >> entries = map.entrySet());
        // for(Set<Map.Entry<Integer,Integer >> entry : entries){
        //     System.out.println(entry.iterator);
        // }

        // int [] res = new int[map.size()];
        // for(int i=0;i<map.size();i++){
        //     res[i] = map.remove(res);
        // }

        // int [] newRes = new int[k];
        // for(int i=0;i<k;i++){
        //     newRes[i] = res[i];
        // }return newRes;