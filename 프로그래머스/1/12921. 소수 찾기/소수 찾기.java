import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;        

        // 2부터 n까지 모든 숫자 i에 대해 소수인지 검사
        for(int i = 2; i <= n; i++){
            // i가 소수인지 판별하기 위한 변수
            boolean isPrime = true;
            double db = Math.sqrt(i);
            // i의 제곱근까지만 나눠보기
            for(int j = 2; j <= db; j++ ){
                // 만약 i를 j로 나눴을 때 나머지가 0이라면 소수가 아님
                if(i % j == 0){
                    isPrime = false;
                    break; // 한 번이라도 나누어 떨어지면 더 확인할 필요 없음
                }
            }
            // 만약 isPrime이 true라면 i는 소수이므로 answer를 증가시킴
            if(isPrime == true){
                answer++;
            }
        }
        return answer;
    }
}
