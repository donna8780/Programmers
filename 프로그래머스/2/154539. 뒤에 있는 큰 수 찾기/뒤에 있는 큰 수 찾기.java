import java.util.*;
//스택을 이용

class Solution {
    public int[] solution(int[] numbers) {
        int [] arr = new int[numbers.length];
            Arrays.fill(arr, -1);

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        
        for(int i = 1; i<numbers.length; i++){
            while(!stack.isEmpty() && numbers[i] > numbers[stack.peek()]){
                arr[stack.pop()] = numbers[i];
            }
            
            stack.push(i);

            
            
        }
        return arr;
    }
}