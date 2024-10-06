import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap <String, Integer> map = new HashMap<>();
        
        for(int i =0; i< players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i<callings.length; i++){
            int a = map.get(callings[i]);//map에서 players의 인덱스를 가져온다.
            
            String pre_name = players[a-1];
            String name = callings[i];
            
            map.put(name,a-1);
            map.put(pre_name,a);
            
            players[a-1] = name;
            players[a] = pre_name;
            

        }
        
        return players;
    }
}