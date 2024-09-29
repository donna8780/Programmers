import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // wallet 배열의 최대값, 최소값 찾기
        int wmax = wallet[0];
        for (int i = 1; i < wallet.length; i++) {
            wmax = Math.max(wmax, wallet[i]);
        }

        int wmin = wallet[0];
        for (int i = 1; i < wallet.length; i++) {
            wmin = Math.min(wmin, wallet[i]);
        }

        // bill 배열의 최대값, 최소값 찾기
        int bmax = bill[0];
        int bmin = bill[0];
        for (int i = 1; i < bill.length; i++) {
            bmax = Math.max(bmax, bill[i]);
            bmin = Math.min(bmin, bill[i]);
        }


        while (bmin > wmin || bmax > wmax) {
            // 배열에서 최대값을 찾아 절반으로 줄이기
            for (int i = 0; i < bill.length; i++) {
                if (bill[i] == bmax) {
                    bill[i] = bill[i] / 2; // 최대값 절반으로 줄이기
                    break;
                }
            }

            // bill 배열의 최대값, 최소값 다시 계산
            bmax = bill[0];
            bmin = bill[0];
            for (int i = 1; i < bill.length; i++) {
                bmax = Math.max(bmax, bill[i]);
                bmin = Math.min(bmin, bill[i]);
            }

            // 반복할 때마다 답 증가
            answer += 1;
        }

        return answer;
    }
}
