class Solution {
    public int solution(String myString, String pat) {
        // String은 불변이므로 StringBuilder로 변경 가능하게 수정
        StringBuilder modifiedString = new StringBuilder(myString);

        // myString을 순회하면서 'A'를 'B'로, 나머지는 'A'로 수정
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                modifiedString.setCharAt(i, 'B');
            } else {
                modifiedString.setCharAt(i, 'A');
            }
        }

        // 변환된 문자열이 pat와 동일한지 비교
        if (modifiedString.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
