class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int l = my_string.length();
        
        answer = my_string.substring(l-n);
        return answer;
    }
}