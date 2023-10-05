package exam01;

public class CarMeetingPoint {
    public static void main(String[] args) {
        int speedA = 60;   // A 자동차의 최초 속도 (km/h)
        int speedB = 40;   // B 자동차의 최초 속도 (km/h)
        int accelerationA = 10; // A 자동차의 가속도 (km/h)
        int accelerationB = 15; // B 자동차의 가속도 (km/h)
        int positionA = 0; // A 자동차의 위치 (km)
        int positionB = 0; // B 자동차의 위치 (km)

        while (true) {
            positionA += speedA;
            positionB += speedB;

            if (positionA == positionB) {
                System.out.println("만난 지점의 위치: " + positionA + "km");
                break;
            }

            speedA += accelerationA;
            speedB += accelerationB;
        }
    }
}
