class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
        for (int i : nums) {
             if(even(i)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        else
            return false;
    }
 
}
