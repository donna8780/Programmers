class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sum = 12000*n + 2000*k;
        if(n/10>=1){
            answer = sum-(n/10)*2000;
        }
        else{
            answer = sum;
        }
        return answer;
    }
}