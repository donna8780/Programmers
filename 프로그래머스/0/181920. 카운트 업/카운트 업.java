import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        //Integer타입의 리스트를 생성
        List<Integer>list = new ArrayList<>();
        
        for(int i = start_num; i<=end_num; i++){
            list.add(i);
        }
        //메서드의 반환 타입이 int이기 때문에 다시 리스트를 배열로 바꿔줘야 함
        int[]li = new int[list.size()];
        
        for(int i = 0; i<list.size();i++){
            li[i]=list.get(i);
        }
        
        
        //리스트 크기만큼 int 배열 생성
        
        
        return li;
    }
}