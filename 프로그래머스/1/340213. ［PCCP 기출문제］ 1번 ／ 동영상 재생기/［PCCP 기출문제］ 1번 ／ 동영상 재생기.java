import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";


        int t = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5)); 
        int p = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int s = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int e = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));

        if(p >= s && p <=e){
            p = e;
        }
        for (String command : commands) {
           
                if (command.equals("next")) {
                    p += 10;
                } else if (command.equals("prev")) {
                    p -= 10;
                }

               
                if (p < 0) {
                    p = 0;
                } else if (p > t) {
                    p = t;
                }
            
        if(p >= s && p <=e){
            p = e;
        }
         System.out.println(p);    
            
        }
       

       
        int minutes = p / 60;
        int seconds = p % 60;
        answer = String.format("%02d:%02d", minutes, seconds);

        return answer;
    }
}
