import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pnum = Long.parseLong(p);

        //int []li = new int [t.length-p.length()+1];
        
        for(int i = 0; i<t.length()-p.length()+1; i++){

            String a = t.substring(i,i+p.length());
            long anum = Long.parseLong(a);
            if(pnum >= anum ){
                
                answer++;
            }
           
        }
        return answer;
    }
}