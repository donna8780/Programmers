import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> L = new PriorityQueue<>();
        PriorityQueue<Integer> H = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<operations.length; i++){
             String[] str = operations[i].split(" ");
            if(str[0].equals("I")){
                L.offer(Integer.valueOf(str[1]));
                H.offer(Integer.valueOf(str[1]));
            }else{
                if(L.isEmpty()){
                    continue;
                }
                else {
                    if(str[1].equals("-1")){
                        int a =L.poll();
                        H.remove(a);
                        
                    }else{
                        int b = H.poll();
                        L.remove(b);
                    }
                }
                
            }
            
        }
        if(!L.isEmpty()){
            answer[0] = H.poll();
            answer[1] = L.poll();
            }
        
            
        return answer;
    }
}