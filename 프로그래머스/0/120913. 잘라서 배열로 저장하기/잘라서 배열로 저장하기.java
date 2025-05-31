import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int len = my_str.length(); 
        
        for(int i = 0; i < len; i+=n){
            int end = Math.min(i + n, len); //
            arr.add(my_str.substring(i, end));
        }
        return arr.toArray(new String[0]);
    }
}