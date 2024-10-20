class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n]; 

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < n; i++) { // 각 행에 대해
            for (int j = 0; j <= i; j++) { // 각 열에 대해

                // 맨 왼쪽일 때
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j]; // 위쪽 노드의 값만 더함
                } 
                // 맨 오른쪽일 때
                else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j]; // 왼쪽 위 노드의 값만 더함
                } 
                // 그 사이일 때
                else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]; // 두 위 노드 중 큰 값을 선택
                }
            }
        }

        // 마지막 행의 최대값 찾기
        int answer = 0; 
        for (int j = 0; j < n; j++) {
            answer = Math.max(answer, dp[n - 1][j]); // 마지막 행에서 최대값을 찾음
        }

        return answer; // 최대 경로 합 반환
    }
}
