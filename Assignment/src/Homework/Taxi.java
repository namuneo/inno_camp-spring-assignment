package Homework;

public class Taxi {
    String number; // 택시 번호
    int maxPassenger = 4; // 최대 승객 수
    int aboardPassenger; // 탑승 승객 수
    int currentPassenger = maxPassenger - aboardPassenger; // 현재 승객 수
    int fee = 3000; // 기본 요금
    int feePerDistance = 1000; // 거리당 요금
    int distance = 1; // 기본 거리
    int oil = 100; // 주유량
    int speed = 0; // 속도
    String status = "일반"; // 상태
    String destination; // 목적지
    int destiDistance; // 목적지까지의 거리
    int payFee; // 지불 요금
    int feePlus; // 누적 요금

    public Taxi(String number) {
        this.number = number;
    }

    // 택시 정보
    public void taxiInfo(String number) {
        System.out.println(number);
        System.out.println(oil);
        System.out.println(status);
    }

    // 승객 탑승
    public void getOn(int passenger, String destination, int destiDistance) {
        aboardPassenger = passenger;
        currentPassenger = maxPassenger - passenger;
        payFee = fee + (destiDistance-1) * 1000;
        feePlus += payFee;
        System.out.println("탑승 승객 수 = " + aboardPassenger);
        System.out.println("잔여 승객 수 = " + currentPassenger);
        System.out.println("기본 요금 확인 = " + fee);
        System.out.println("목적지 = " + destination);
        System.out.println("목적지까지 거리 = " + destiDistance);
        System.out.println("지불할 요금 = " + payFee);
        System.out.println("상태 = " + "운행중" );

    }

    // 주유하기
    public void addFuel(int fuel) {
        oil += fuel;
    }

    // 승객 초과 알림
    public void alert(int passenger) {
        if(passenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
        }
    }

    // 요금 결제
    public void pay(int payFee) {
        System.out.println(payFee);
    }

    // 택시 출력
    public void taxiFinal(int fuel, String status) {
        System.out.println(fuel);
        System.out.println(status);
        System.out.println("주유 필요");

    }

}
