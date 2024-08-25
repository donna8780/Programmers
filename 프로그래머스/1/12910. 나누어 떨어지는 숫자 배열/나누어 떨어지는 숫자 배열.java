import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i =0; i< arr.length; i++){
            if(arr[i] % divisor==0){
                list.add(arr[i]);
            }
        }
       if(list.size()==0){
           answer = new int[1];
           answer[0] = -1;
           return answer;
       }
        
        //1 배열 개수 선언
        
       /* answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        } */
        //2 배열 선언 안해도 담을 수 있음 (list를 array로 바꿈)
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}