import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char b;
        for(int i = 0; i < my_string.length(); i++) {
            b = my_string.charAt(i);
            
            if(Character.isUpperCase(b)) {
                answer += Character.toLowerCase(b);
            } else {
                answer += Character.toUpperCase(b);
            }
        }
        return answer;
    }
}
