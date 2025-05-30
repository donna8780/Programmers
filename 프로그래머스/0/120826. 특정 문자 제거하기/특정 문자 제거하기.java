class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(); //여기에 저장
        char c = letter.charAt(0);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != c) {  // letter가 아닐 때만 추가
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
