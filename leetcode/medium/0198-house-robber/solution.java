class Solution {
    public int rob(int[] nums) {
        int rob=0;
        int noRob=0;
        for(int num:nums){
            int newRob=noRob+num;
    int newNorob=Math.max(noRob,rob);
            rob=newRob;
            noRob=newNorob;
        }
        return Math.max(rob,noRob);
    }
}