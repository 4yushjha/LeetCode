class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       
        int [] sum=new int[n*2];
        for(int i=0;i<n;i++){
          sum[i]=  nums[i];
        }
        for(int i=0;i<n;i++){
           sum[i+n]=  nums[i];
           
        }
         return sum;   
    }
}