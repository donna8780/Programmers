import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd= "";
        String even = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2 !=0){
                odd+=Integer.toString(num_list[i]);
                
            }//홀수 일 때
            
            else{
                even+=Integer.toString(num_list[i]);
            }//짝수 일 때
        }
        int odd1 = Integer.parseInt(odd);
        int even1 = Integer.parseInt(even);
        return odd1+even1;
    }
}