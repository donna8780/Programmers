class Solution {
    public String solution(String my_string, int n) {
        
        StringBuilder answer = new StringBuilder();
        
        int m = my_string.length() - n;  // 시작 위치를 계산
        for (int i = m; i < my_string.length(); i++) {  // n만큼 뒤의 문자를 가져옴
            answer.append(my_string.charAt(i));
        }
        return answer.toString();  // StringBuilder의 문자열을 반환
    }
}
