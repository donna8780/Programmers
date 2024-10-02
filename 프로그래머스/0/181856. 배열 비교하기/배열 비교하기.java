class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1l = arr1.length;
        int arr2l = arr2.length;
        
        // Compare lengths of arr1 and arr2
        if (arr1l > arr2l) {
            answer = 1;
        } else if (arr1l < arr2l) {
            answer = -1;
        } else if (arr1l == arr2l) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            
            // If the sums are equal, answer is 0
            if (sum1 == sum2) {
                answer = 0;
            } else if (sum1 > sum2) {
                answer = 1;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
