class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String ans = "";
        for(int i = 0; i<=t*m; i++){
            ans += Integer.toString(i, n);
            
        }
        for(int i = p-1; i < ans.length(); i +=m){
            if(answer.length() >= t){
                break;
            }
            answer += ans.charAt(i);
        }

        answer = answer.toUpperCase();
        
        
        
        
        return answer;
    }
}