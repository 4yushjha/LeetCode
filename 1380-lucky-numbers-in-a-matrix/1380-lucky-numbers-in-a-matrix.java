class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length;

        // Step 1: Find row minima
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<M;i++){
            int rMin=Integer.MAX_VALUE;
            for(int j=0;j<N;j++){
                rMin=Math.min(rMin,matrix[i][j]);
            }
            list1.add(rMin);
        }

        // Step 2: Find column maxima
       List<Integer> list2=new ArrayList<>();
       for(int j=0;j<N;j++){
            int cMax=Integer.MIN_VALUE;
            for(int i=0;i<M;i++){
                cMax=Math.max(cMax,matrix[i][j]);
            }
            list2.add(cMax);

       }

        // Step 3: Check lucky numbers
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == list1.get(i) && matrix[i][j] == list2.get(j)) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }

        return luckyNumbers;
    }
}
