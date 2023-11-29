import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pyramid {

    /**
     * Write a function that when given a number >= 0, returns an Array of ascending length subarrays.
     *
     * pyramid(0) => [ ]
     * pyramid(1) => [ [1] ]
     * pyramid(2) => [ [1], [1, 1] ]
     * pyramid(3) => [ [1], [1, 1], [1, 1, 1] ]
     * List<List<int>> pyramid(int n) {
     *
     * }
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> pyramid = IntStream.rangeClosed(1, count) // 반복문
                .mapToObj(i -> IntStream.rangeClosed(1, i)
                        .mapToObj(j -> "1")
                        .collect(Collectors.joining(", ", "[", "]")))
                .toList();


        System.out.println(pyramid);
    }


}
