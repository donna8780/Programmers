import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<my_string.length(); i++){
            if(i == ' '){
                break;
            }sb.append(i);
            
        }
        
        System.out.println(my_string);
        return toString(sb);
    }
}