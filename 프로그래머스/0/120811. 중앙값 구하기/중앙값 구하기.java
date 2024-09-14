import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int length=array.length;
        int answer = array[length/2];
        
        return answer;
    }
}