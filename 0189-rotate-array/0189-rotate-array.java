import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        List<Integer> rotate = new ArrayList<>();

        for (int i = n - k; i < n; i++) {
            rotate.add(nums[i]);
        }

    
        for (int i = 0; i < n - k; i++) {
            rotate.add(nums[i]);
        }

        
        for (int i = 0; i < n; i++) {
            nums[i] = rotate.get(i);
        }

        
    }
}
