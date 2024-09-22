import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
         Arrays.fill(answer,-1);
        
        for(int i = 1; i<s.length(); i++){
            char a = s.charAt(i);
            String word = s.substring(0,i);
            
            if(word.lastIndexOf(a) !=-1){
                answer[i]=(i-word.lastIndexOf(a));
            }
            
           

                
        }
        return answer;
    }
}