import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("난수의 개수를 입력하세요: ");
        int numCount = scanner.nextInt();

        // 난수 생성
        Random random = new Random();
        int lowerLimit = 1; // 최소값 설정
        int upperLimit = 100; // 최대값 설정

        int[] randomNumbers = new int[numCount];

        // 난수 생성 및 배열에 저장
        for (int i = 0; i < numCount; i++) {
            randomNumbers[i] = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        }

        // 생성된 난수 출력
        System.out.println("생성된 난수:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 배열 정렬
        Arrays.sort(randomNumbers);

        // 정렬된 난수 출력
        System.out.println("정렬된 난수:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
