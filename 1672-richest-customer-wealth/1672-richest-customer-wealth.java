class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=0;
        for(int[] i:accounts){
            int sum=0;
            for(int money:i){
                sum+=money;
            }
            r=Math.max(r,sum);
        }
        return r;
    }
}