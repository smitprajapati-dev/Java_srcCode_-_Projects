// package leatCode;

// public class first_Problem {
//     public int[] twoSum(int[] nums, int target){
//         for(int i = 0; i<nums.length; i++){
            
//             for(int j = i + 1; j<nums.length; j++){
//                 if(nums[i]  +nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return nums;
//     }
    
// }
package leatCode;

import java.util.HashMap;
import java.util.Map;

public class first_Problem{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> complement = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            Integer complementIndex = complement.get(nums[i]);
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complement.put(target - nums[i], i);
        }
        return nums;
    }
}