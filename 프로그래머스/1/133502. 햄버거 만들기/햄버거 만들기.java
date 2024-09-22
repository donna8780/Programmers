import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        //for문 돌면서 스택에 넣기
        //스택 사이즈가 4보다 크거나 같으면 맨위부터 1321이면
        //맨 위에서부터 pop, answer을 1 올림
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<ingredient.length; i++){
       
            stack.push(ingredient[i]);
            if(stack.size() >= 4){
                if(stack.get(stack.size()-1) == 1 && 
                  stack.get(stack.size()-2) == 3 &&
                  stack.get(stack.size()-3) == 2 &&
                  stack.get(stack.size()-4) == 1 ) {
                
                 for(int j = 1; j<=4;j++){
                     stack.pop();
                     }
                    answer +=1;
                }
                }
        }
      return answer;
    }
    
}