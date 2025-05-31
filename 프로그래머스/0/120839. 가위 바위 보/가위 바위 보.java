import java.util.*;

class Solution {
    public String solution(String rsp) {
        Map <Character, Character> map = new HashMap<>();
        
        map.put('2', '0');
        map.put('0', '5');
        map.put('5', '2'); //내는 값과 이기는 값을 저장
        
        //rsp문자열을 문자로 나누어서 스트링 빌더 타입으로 arr에 저장한다.
        StringBuilder arr = new StringBuilder();
        for(int i = 0; i< rsp.length(); i++){
            char a = rsp.charAt(i);
            arr.append(a);
        }
        
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i< arr.length(); i++){
            char c = arr.charAt(i);
            answer.append(map.get(c));
        }

        return answer.toString();
    }
}