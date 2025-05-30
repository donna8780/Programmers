class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];
        //1. 배열 돌면서 짝수/홀수 세기
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                answer[0] +=1;
            }else{
                answer[1] +=1;
            }
        }
        return answer;
    }
}