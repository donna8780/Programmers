class Solution {
    public int solution(String dartResult) {
        int[] game = new int[3];
        String s = "";  // 숫자로 된 문자열
        int n = 0;      // s문자열을 숫자로 변경
        int k = 0;      // 게임을 하나씩 증가
        
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (ch >= '0' && ch <= '9') {   // 숫자
                s += String.valueOf(ch);
            }
            else if (ch == 'S' || ch == 'D' || ch == 'T') { // 게임 마지막
                n = Integer.parseInt(s);
                if (ch == 'S') {
                    game[k++] = (int) Math.pow(n, 1);
                }
                else if (ch == 'D') {
                    game[k++] = (int) Math.pow(n, 2);
                }
                else if (ch == 'T') {
                    game[k++] = (int) Math.pow(n, 3);
                }
                
                s = ""; // s 초기화
            }
            else if (ch == '*') {   // 2배 (이번게임과 전게임)
                game[k - 1] *= 2;
                if (k - 2 >= 0) {
                    game[k - 2] *= 2;
                }
            }
            else if (ch == '#') {   // -1 곱하기
                game[k - 1] *= -1;
            }
        }

        return game[0] + game[1] + game[2];
    }
}