import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class escape {
    /**
     * @param args
     * 6 2 10 3 - 1
     * 1 1 5 5 - 1
     * 653 375 1000 1000 - 347
     * 161 181 762 375 - 161
     *
     * 1. 0번 인덱스와 2번 인덱스, 1번 인덱스와 2번 인덱스 중 차가 작은 것을 기준으로 잡음
     * 2. 기준으로 잡은 것에서 큰값을 절반으로 나눴을 때 좌표값보다 작다면, 좌표값 만큼을 출력
     * 3. 아니라면 크기에서 좌표값 뺀것을 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String squares = sc.nextLine();

        List<String> squareList = new ArrayList<>(Arrays.asList(squares));

        System.out.println(squareList);
        int oneThree = Integer.parseInt(squareList.get(2)) - Integer.parseInt(squareList.get(0));
        int twoFour = Integer.parseInt(squareList.get(1)) - Integer.parseInt(squareList.get(3));


        if ( oneThree > twoFour ) {

        }

    }
}
