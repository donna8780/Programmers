import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        // 정답을 담을 배열을 초기화합니다.
        String[] answer = new String[strings.length];
        
        // 문자열 리스트를 생성합니다.
        List<String> list = new ArrayList<>();
        
        // 문자열을 리스트에 추가합니다. 각 문자열의 n번째 문자와 원래 문자열을 결합합니다.
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + "," + strings[i]);
        }
        
        // 리스트를 사전순으로 정렬합니다.
        Collections.sort(list);
        
        // 정렬된 리스트에서 원래 문자열을 추출하여 answer 배열에 저장합니다.
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).split(",")[1];
        }
        
        return answer;
    }
}
