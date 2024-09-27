import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char an = ' ';
        for(int i = 0; i<num_str.length(); i++){
            an = num_str.charAt(i);
            answer += Integer.parseInt(String.valueOf(an));
        }
        return answer;
    }
}