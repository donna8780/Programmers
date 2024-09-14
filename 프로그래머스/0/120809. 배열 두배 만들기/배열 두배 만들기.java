class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // Initialize answer with the same size as numbers
        
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; // Multiply each element by 2 and store in answer
        }
        
        return answer;
    }
}
