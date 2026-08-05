class Solution {
     public int maximumWealth(int[][] accounts){
        int rowSum=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum +=accounts[person][account];
            }
            if(sum>rowSum){
                rowSum=sum;
            }
        }

        return rowSum;
    }
}