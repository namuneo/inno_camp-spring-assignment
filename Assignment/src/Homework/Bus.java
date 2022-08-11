package Homework;

public class Bus {
    String number; // 버스 번호
    int maxPassenger = 30; // 최대 승객 수
    int aboardPassenger; // 탑승 승객 수
    int currentPassenger = maxPassenger - aboardPassenger; // 현재 승객 수
    int fee; // 요금
    int oil = 100; // 주유량
    int speed = 0; // 속도
    String status; // 상태

    public Bus(String number, String status) {
        this.number = number;
        this.status = status;
    }

    // 승객 탑승
    public void getOn(int passenger) {
        aboardPassenger += passenger;
        currentPassenger = maxPassenger - passenger;
        fee = passenger * 1000;
        System.out.println(aboardPassenger + "명 탑승"); // 탑승 인원
        System.out.println("잔여 승객 " + currentPassenger + "명");
        System.out.println("요금 확인 = " + fee);
    }

    // 주유하기
    public void addFuel(int fuel) {
        oil += fuel;
        System.out.println(oil);
        this.status = "차고지행";
        System.out.println(status);
        if(oil <10) {
            System.out.println(oil);
            this.status = "차고지행";
            System.out.println("주유가 필요하다");
        }
    }

    // 상태 변경하기
    public void changeStatus(String status) {
        this.status = status;
        System.out.println(status);
    }

    // 승객 초과 알림
    public void overPassenger(int passenger) {
        if(passenger >= maxPassenger){
            System.out.println("최대 승객 수 초과");
        }
    }

    public void getOn2(int passenger) {
        aboardPassenger = passenger;
        currentPassenger = maxPassenger - passenger;
        fee = passenger * 1000;
        System.out.println(aboardPassenger + "명 탑승"); // 탑승 인원
        System.out.println("잔여 승객 " + currentPassenger + "명");
        System.out.println("요금 확인 = " + fee);
    }


}
