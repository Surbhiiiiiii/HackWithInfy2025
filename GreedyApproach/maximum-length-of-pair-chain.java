class Solution {
    public int findLongestChain(int[][] pairs) {
        int c=1;
             Arrays.sort(pairs, (r1, r2) -> Integer.compare(r1[1], r2[1]));
             for(int i=0;i<pairs.length-1;i++){
                for(int j=i+1;j<pairs.length;j++){
                if(pairs[i][1]<pairs[j][0]){
                     i=j;
                    c++;                       
                }

                }
             }
return c;
    }
}