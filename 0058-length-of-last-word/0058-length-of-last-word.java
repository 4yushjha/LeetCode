class Solution {
    public int lengthOfLastWord(String s) {
        // Step 1: Trim trailing spaces
        s = s.trim();
        
        // Step 2: Find last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Step 3: Length of last word = total length - last space index - 1
        return s.length() - lastSpaceIndex - 1;
    }
}
