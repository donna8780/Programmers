class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " +i+ "에 있다";
            }
            
        }
        return "Kim을 찾을 수 없습니다."; // 이 줄은 보통 실행되지 않음
    }
}