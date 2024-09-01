class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i<phone_number.length()-4; i++){
            answer += '*';
        }//폰넘버 길이 마지막 4자리 전까지 *로 채우기
        
        //
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }

        
}
