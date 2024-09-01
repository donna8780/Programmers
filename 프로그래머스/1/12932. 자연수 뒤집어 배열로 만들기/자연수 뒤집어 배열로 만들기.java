class Solution {
    public int[] solution(long n) {
        
        //숫자 n을 문자열 asd로 바꿈
        String asd = String.valueOf(n);
        
        //문자열의 길이만큼 int 배열을 생성
        int[] answer = new int[asd.length()];
        int k = 0;

        for(int i = asd.length() -1; i>= 0; i--){
            answer[k++] = Integer.parseInt(String.valueOf(asd.charAt(i)));
        }
        return answer;
    }
    
}
    