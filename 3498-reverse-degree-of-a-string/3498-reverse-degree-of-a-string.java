class Solution {
    public int reverseDegree(String s) {
       int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int reversedValue = 26 - (ch - 'a'); 
            int position = i + 1;
            total += reversedValue * position;
        }
        return total; 
    }
}