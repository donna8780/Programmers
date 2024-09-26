class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int len = arr.length;
        //홀수
        if(len %2 != 0){
            for(int i = 0; i<arr.length; i+=2){
                arr[i] += n;
            }
        }
        //짝수
        else{
            for(int i = 1; i<arr.length; i+=2){
                arr[i] +=n;
            }
        }
        return arr;
    }
}