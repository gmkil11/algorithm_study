package exam01;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] result1 = solution(lotto1, win_nums1);
        System.out.println(Arrays.toString(result1)); // [3, 5]

        int[] lotto2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        int[] result2 = solution(lotto2, win_nums2);
        System.out.println(Arrays.toString(result2)); // [1, 6]

        int[] lotto3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        int[] result3 = solution(lotto3, win_nums3);
        System.out.println(Arrays.toString(result3)); // [1, 1]
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int[] nums = new int[0];
        int zeroCount = 0; // 알아볼 수 없는 번호(0)의 개수
        int matchCount = 0; // 맞힌 번호의 개수

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            } else if (Arrays.binarySearch(win_nums, lotto) > 0) {
                matchCount++;
            }
        }

        // 최고 순위 계산
        int maxRank = 7 - (matchCount + zeroCount);
        if (maxRank > 6) {
            maxRank = 6;
        }
        answer[0] = maxRank;

        // 최저 순위 계산
        int minRank = 7 - matchCount;
        if (minRank > 6) {
            minRank = 6;
        }
        answer[1] = minRank;

        int[] nums = null;
        return nums;
    }
}
