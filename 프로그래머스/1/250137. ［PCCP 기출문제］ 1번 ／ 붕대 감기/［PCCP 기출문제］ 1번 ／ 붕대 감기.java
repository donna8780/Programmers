class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;//현재 체력
        int idx = 0;//공격 인덱스
        int success = 0;//연속 성공
        
        //
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++){
          if(i != attacks[idx][0]){//시간과 attacks의 0번째 값이 다르다면
              answer += bandage[1];
              success ++;
              if(success == bandage[0]){
                  answer += bandage[2];
                  success = 0;
              }
              if(answer >= health){
                  answer = health;
              }
          }else{ //공격을 받음
              answer -= attacks[idx][1];
              idx++;//공격횟수를 늘림
              success = 0;
              if(answer <= 0)return -1;
              
          } 
        }
        return answer;
    }
}