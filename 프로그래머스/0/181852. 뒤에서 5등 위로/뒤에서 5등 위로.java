import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];//담을 배열 갯수 만들고
        Arrays.sort(num_list);//num_list정렬 후,
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}