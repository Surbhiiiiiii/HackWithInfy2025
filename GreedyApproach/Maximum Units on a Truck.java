import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (r1, r2) -> Integer.compare(r2[1], r1[1]));

        int co = 0;
        int i = 0;

        for (i = 0; i < boxTypes.length; i++) {
            if (truckSize - boxTypes[i][0] >= 0) {
                truckSize -= boxTypes[i][0];
                co += boxTypes[i][0] * boxTypes[i][1];
            } else {
                co += truckSize * boxTypes[i][1];
                truckSize = 0;
                break; 
            }
        }

        return co;
    }
}
