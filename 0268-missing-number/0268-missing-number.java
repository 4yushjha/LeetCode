class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expectedNumber=n*(n+1)/2;

        int actual=0;
        for(int num:nums){
            actual +=num;
        }
        return expectedNumber-actual;

    }
}