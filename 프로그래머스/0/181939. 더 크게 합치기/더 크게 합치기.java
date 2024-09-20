class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);
        
        int str11 = Integer.parseInt(str1);
        int str22 = Integer.parseInt(str2);
        
        if(str11>str22){
            answer = str11;
        }else if(str11 < str22){
            answer = str22;
        }
        else{
            answer = str11;
        }
        return answer;
    }
}