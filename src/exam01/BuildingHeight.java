package exam01;

public class BuildingHeight {
    public static void main(String[] args) {
        double distance = 30.0; // 건물에서 30m 떨어진 지점까지의 거리
        double eyeHeight = 1.6; // 관측자의 눈 높이
        double angleInDegrees = 45.0; // 관측한 각도

        // 각도를 라디안으로 변환
        double angleInRadians = Math.toRadians(angleInDegrees);

        // 건물의 높이 계산
        double buildingHeight = distance * Math.tan(angleInRadians) + eyeHeight;

        System.out.println("건물의 높이: " + buildingHeight + "m");
    }
}