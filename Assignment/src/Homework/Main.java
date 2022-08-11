package Homework;

public class Main {
    public static void main(String[] args) {
// 버스
        Bus bus1 = new Bus("9401", "운행");
        Bus bus2 = new Bus("9403", "운행");

        // 차번호 확인
        System.out.println("버스1 차번호 " + bus1.number);
        System.out.println("버스2 차번호 " + bus2.number);

        // 탑승객 2명
        bus1.getOn(2);

        // 주유 -50
        bus1.addFuel(-50);

        // 주유 +10
        bus1.addFuel(10);

        // 상태 변경
        bus1.changeStatus("운행중");

        // 승객 +45
        bus1.overPassenger(45);

        // 승객 +5
        bus1.getOn2(5);

        bus1.addFuel(-55);



        // 택시
        Taxi taxi1 = new Taxi("123나3423");
        Taxi taxi2 = new Taxi("687우5243");

        // 차번호 확인
        taxi1.taxiInfo("123나3423");
        taxi2.taxiInfo("687우5243");

        // 승객 + 2
        taxi1.getOn(2, "서울역", 2);

        // 주유량 - 80
        taxi1.addFuel(-80);
        System.out.println(taxi1.oil);

        // 요금 결제
        taxi1.pay(4000);

        // 주유량 + 20
        taxi1.addFuel(20);
        System.out.println(taxi1.oil);
        System.out.println(taxi1.feePlus);

        // 승객 + 5
        taxi1.alert(5);

        // 승객 + 3
        taxi1.getOn(3, "구로디지털단지", 12);

        // 주유량 -20
        taxi1.addFuel(-20);
        System.out.println(taxi1.oil);

        // 요금 결제 14000원
        taxi1.pay(14000);

        // 출력
        taxi1.taxiFinal(0, "운행불가");

    }
}
