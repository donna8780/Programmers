import java.util.*;
class Solution {
    public int solution(int n) {
       int sqrt = (int)Math.sqrt(n); // 제곱근 구하기
        
        int count = 0;
        for(int i = 1; i<= sqrt; i++){
            if(n % i == 0){ // n이 제곱근으로 나누어 지는 경우에서
                if(i == n / i) {
                    count +=1; //i가 n을 i와 나눴을 때 같은 경우라면? 순서쌍은 1개
                }else{
                    count+=2;  //다른 경우라면 2개니까 
                }
            }
        }
        return count;
    }
}