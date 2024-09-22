import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String types [] = {"R","T","C","F","J","M","A","N"};
        int[] scores = {0,3,2,1,0,1,2,3};
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i< types.length;i++){
         map.put(types[i],0);   
        }//types와 scores의 값 들을 key,value로 map에 저장
        
        for(int i = 0; i<survey.length; i++){
            String a = survey[i].substring(0,1);//'A'
            String b = survey[i].substring(1);//'N'
            //choices가 4보다 크면 오른쪽
            if(choices[i]>4) {
                map.put(b, map.get(b)+scores[choices[i]]);
            }
            //choices 4보다 작으면 왼쪽
            else {
                map.put(a, map.get(a)+scores[choices[i]]);
            }
        }                   
        for(int i= 0; i<types.length; i+=2){

            if(map.get(types[i]) >= map.get(types[i+1])){
                answer +=types[i];
            }else{
                answer+= types[i+1];
            }
        }
            
        
        return answer;
    }
}