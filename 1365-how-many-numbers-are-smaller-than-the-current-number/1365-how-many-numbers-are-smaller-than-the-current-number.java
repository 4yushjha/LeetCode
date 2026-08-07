class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] small = new int[n];

        for (int i = 0; i < n; i++) {
            int countSmall = 0; // reset for each i
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    countSmall++;
                }
            }
            small[i] = countSmall; // assign once after inner loop
        }

        return small;
    }
}
