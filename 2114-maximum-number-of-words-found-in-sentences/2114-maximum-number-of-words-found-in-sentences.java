class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String current:sentences){
            int currentlen=current.split(" ").length;
            if(max<currentlen)
               max=currentlen;
        }
        return max;
    }
    
}