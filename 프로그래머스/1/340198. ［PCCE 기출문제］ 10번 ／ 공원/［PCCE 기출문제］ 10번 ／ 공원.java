import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rows = park.length;
        int cols = park[0].length;
        
        Arrays.sort(mats);
        
        for (int i = mats.length - 1; i >= 0; i--) {
            for (int j = 0; j <= rows - mats[i]; j++) {
                for (int k = 0; k <= cols - mats[i]; k++) {
                    boolean isMats = true;
                    lb:
                    for (int x = j; x < j + mats[i]; x++) {
                        for (int y = k; y < k + mats[i]; y++) {
                            if (!park[x][y].equals("-1")) {
                                isMats = false;
                                break lb;
                            }
                        }
                    }
                    if (isMats) {
                        return mats[i];
                    }
                }
            }
        }
        
        return answer;
    }
}