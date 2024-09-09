class Solution {
    public int solution(int[] array, int height) {
        //키 큰 사람을 세서 담을 수
        int answer = 0;
        for(int i : array){
            if(height < i) answer++;
        }
        
        return answer;
    }
}