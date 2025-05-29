class Solution {
    public int[] solution(int n) {
        //1. 배열의 개수를 정해주기
        int size = (n+1) / 2;
        int[] answer = new int[size];
        
        int index = 0;
        
        for(int i = 1; i<= n; i++){
            if(i %2 != 0){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}