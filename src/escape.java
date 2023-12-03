import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class escape {
    /**
     * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고,
     * 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
     * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] squares = sc.next().split(" ");

        List<String> squareList = new ArrayList<>(Arrays.asList(squares));

        System.out.println(squareList);

    }
}
