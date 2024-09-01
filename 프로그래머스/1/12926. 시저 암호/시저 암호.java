class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            
            // 대문자 처리
            if('A' <= a && a <= 'Z'){  // 조건 수정
                char nc = (char)((a - 'A' + n) % 26 + 'A');
                answer += nc;
            }
            // 소문자 처리
            else if('a' <= a && a <= 'z'){  // 조건 수정
                char nc = (char)((a - 'a' + n) % 26 + 'a');
                answer += nc;
            }
            // 비문자(공백 등) 처리
            else {
                answer += a;  // 원래 문자를 추가
            }
        }
        return answer;
    }
}
