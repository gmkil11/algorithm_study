package exam01;

import java.util.Arrays;

public class MedianValue {
    public static void main(String[] args) {
        int n = 3; // n은 발생할 난수의 개수
        int[] numbers = new int[n];

        // 난수 생성
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1; // 100 범위
        }

        // 배열 정렬
        Arrays.sort(numbers);

        // 중간값 계산
        int middleIndex = n / 2;
        int[] median;
        if (n % 2 == 1) {
            median = new int[]{numbers[middleIndex]};
        } else {
            median = new int[]{numbers[middleIndex-1], numbers[middleIndex]};
        }

        // 결과 출력
        System.out.println("발생한 난수: " + Arrays.toString(numbers));
        System.out.println("중간값: " + Arrays.toString(median));
    }
}
