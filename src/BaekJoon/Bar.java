package BaekJoon;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int X = scanner.nextInt();
        // 현재 가지고 있는 막대의 길이
        int currentLength = 64;
        // 필요한 막대의 개수
        int count = 0;

        // X를 만들기 위해 과정 수행
        while (X > 0) {
            // 현재 막대의 길이가 X보다 크거나 같으면
            if (currentLength > X) {
                // 현재 막대를 절반으로 자르고 남은 부분을 버림
                currentLength /= 2;
            } else {
                // 현재 막대의 길이가 X와 같거나 작으면, 필요한 막대의 개수를 증가시키고 현재 막대를 버림
                count++;
                // 버린 막대의 길이를 X에서 빼기
                X -= currentLength;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
