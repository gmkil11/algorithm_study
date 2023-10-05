package exam01;

public class Solution {
    public int solution(String s) {
        int answer = 0;  // 분해한 문자열의 개수를 저장할 변수
        int currentIndex = 0;  // 현재 문자열의 시작 인덱스

        while (currentIndex < s.length()) {
            char x = s.charAt(currentIndex);  // 현재 문자열의 첫 글자
            int countX = 0;  // x의 개수
            int countOther = 0;  // x가 아닌 다른 글자의 개수
            int i = currentIndex;

            // 현재 문자열을 순회하며 x와 x가 아닌 다른 글자의 개수를 센다
            while (i < s.length() && (s.charAt(i) == x || countX == countOther)) {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                i++;
            }

            // 분해한 문자열의 개수를 증가시키고 다음 문자열의 시작 인덱스를 설정
            answer++;
            currentIndex = i - countX - countOther;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("banana"));  // 3
        System.out.println(solution.solution("abracadabra"));  // 6
        System.out.println(solution.solution("aaabbaccccabba"));  // 3
    }
}
