import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        List<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        
        return missing;
    }
}
