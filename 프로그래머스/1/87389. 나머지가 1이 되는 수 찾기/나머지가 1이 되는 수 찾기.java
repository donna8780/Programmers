class Solution {
    public int solution(int n) {
        int min = n;
        
        //i는 n-1부터 시작해서 0보다 클때까지 i가 1씩 작아진다.
        
        for(int i = n-1; i > 0; i--){
            if(n % i == 1 && i < min){
                min = i;

            }
        }
        return min;
    }
}

