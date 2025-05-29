import java.util.*;

class Solution {
    public int solution(int[] array) {
       
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i< array.length; i++){
            int key = array[i]; //인덱스 i번 째의 값이 키가 되는 것
            if(map.containsKey(key)){ //map에 key가 있으면 값이 한 번 더 나온거니까
                map.put(key, map.get(key)+1); // key의 값에 1을 더해줘라
            }else{ // 아니라면
                map.put(key, 1); // key: 0 -> key:1로 바꿔라
            }
        }
        int maxCount = 0; //가장 많이 나온 값
        int answer = 0; //최빈값 후보
        boolean multipleMax = false; // 최빈값이 2개 이상 있는지 확인하는 플래그
        
        for(int key : map.keySet()){ //키만 뽑아서
            int count = map.get(key); // 해당 숫자가 몇 번 나왔는지
            if(count > maxCount){
                maxCount = count;
                answer = key;
                multipleMax = false;
            }else if(count == maxCount){
                multipleMax = true;
            }
        }
        
        if(multipleMax) return -1;
        return answer;
    }
}