import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;

        
        
        for(int i = 1; i<land.length; i++){
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2],land[i-1][3]));//0열
            land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2], land[i-1][3]));//1열
            land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1], land[i-1][3]));//2열
            land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1], land[i-1][2]));//3열
        
        }

        for( int n : land[land.length-1]){
            
            answer = Math.max(answer,n);
        }

       
        return answer;
    }
}