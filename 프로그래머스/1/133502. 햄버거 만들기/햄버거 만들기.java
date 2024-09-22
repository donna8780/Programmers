import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        //1
        Stack<Integer> list = new Stack<>();
        for(int i : ingredient){
            list.push(i);
            if(list.size() >= 4){
                if(list.get(list.size()-1) == 1 &&
                    list.get(list.size()-2) == 3 &&
                    list.get(list.size()-3)== 2 &&
                    list.get(list.size()-4)==1){
                    answer ++;
                    for(int j = 0;j<4;j++){
                        list.pop();
                    }
                }
                    
            }
        }
        return answer;
    }
}