import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                result.add(c-'0'); //문자를 숫자로 변환해서 리스트에 더함
            }
        }
        //숫자 오름차순 정렬
        Collections.sort(result);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}