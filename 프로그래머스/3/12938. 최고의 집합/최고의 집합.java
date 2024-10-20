import java.util.*;
class Solution {
    public int[] solution(int n, int s) {

        //배열 갯수 n new int[]
        //array.fill로 뒤부터 채움
        //for문을 나머지부터 돌면서
        
        int[] answer = new int[n];
        if (n > s ){
            return new int[] {-1};
        }
        Arrays.fill(answer,s /n );
        for(int i= 0; i<s%n;i++){
            answer[n-1-i]++;
        }
        
        
        
        
        return answer;
    }
}