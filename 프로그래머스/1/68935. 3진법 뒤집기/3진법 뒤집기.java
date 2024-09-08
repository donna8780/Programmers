import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        String b = "";
        //45를 integer.tostring(숫자,3)
        //다시 거꾸로 변수에 넣기
        //다시 숫자  형태 바꿈 integer.parseint(,10)//3진수를 10진수로 바꿈
        //10진수를 3진수로 바꿔서 문자열로
        a = Integer.toString(n,3);       
        for(int i = a.length()-1; i>=0; i--){
            b += a.charAt(i);
        }
        answer = Integer.parseInt(b,3);
        
        //문자열3진수를 숫자10진수로 바꾸겠다는 말
        return answer;
    }

}