class Solution {
    public String solution(String n_str) {
        String answer = "";
        //문자열을 정수로 저장하면 0은 떼고 저장됨
        int n = Integer.parseInt(n_str);
        answer = String.valueOf(n);
        return answer;
    }
}