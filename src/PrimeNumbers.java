import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        System.out.println(primes);
    }
}
