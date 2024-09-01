import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;        

        //자기 자신
        for(int num = 2; num <= n; num++){
        boolean div = true;
        double db = Math.sqrt(num);
        //나누는 수
        for(int j = 2; j <= db; j++ ){
            if(num % j == 0){
                div = false;
                break;
                }
        }
        if(div == true){
            answer++;
        }
        }
        return answer;
    }
}