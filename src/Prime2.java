public class Prime2 {
    public static void main(String[] args) {
        // 소수의 약수는 1과, 자기 자신 총 두 개 밖에 없다는 특징을 이용해서 소수를 구할 것이다.
        int primeCount = 1; // 소수의 갯수를 대입시킬 변수
        for (int primeNum = 1; primeNum <= 1000; primeNum++) { // 1부터 1000까지 반복하는 for 문 (1번 for문)
            int divisor = 0; // 약수의 갯수를 카운트 할 변수. (1번 for 문을 돌 때 마다 0으로 초기화 시킨다.)
            for (int i = 1; i <= primeNum; i++) { // i번 만큼 for 문을 돌려서 primeNum를 i로 나누었을 때 나머지가 0인 것만 추출하기 위한 for 문 (2번 for문)
                if(primeNum % i == 0){ // primeNum을 i로 나누었을 때 나머지가 0이 나오는 경우에는 divisor 변수에 1을 추가한다.
                    divisor++;
                }
            }
            if (divisor == 2) { // 2번 for문을 돌고서 카운트 된 약수 갯수가 2개라면, 현재 돌고있는 primeNum 의 값은 소수이기 때문에
                System.out.println(primeCount++ + "번째 소수 = " + primeNum); // primeCount에 1을 추가시키고 primeCount과 primeNum를 출력시킨다.
            }
        }
    }
}