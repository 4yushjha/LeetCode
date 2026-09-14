class Solution {
   public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
    return !(rec1[2] <= rec2[0] ||  // left
             rec2[2] <= rec1[0] ||  // right
             rec1[3] <= rec2[1] ||  // below
             rec2[3] <= rec1[1]);   // above
}

}