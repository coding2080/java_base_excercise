package com.npage;


import com.npage.model._4_.Car;
import com.npage.model._4_.Printer;

public class _4_Class {

    public static void main(String[] args) {
        basic_class_example();
        overloading_example();
        without_constructor_example();
    }

    /**
     * 이름(문자열)이 dreamCar, 현재 위치는 x 좌표(정수) 0, y 좌표(정수) 10, 속력은 10(정수)인 Car 객체를 생성하고
     * 현재 위치를 print 한다. 그 후 x 방향으로 10만큼 이동(moveToX), y 방향으로 -3만큼 이동(moveToY)하고
     * 이동 후 위치를 print 한다.
     */
    public static void basic_class_example() {
        Car car = null;
    }

    /**
     * 아래 주석된 4개의 출력문이 정상 동작 하도록 Printer 클래스 작성
     */
    public static void overloading_example() {
        Printer printer = new Printer();
//        printer.println(10);
//        printer.println(true);
//        printer.println(5.7);
//        printer.println("오버로딩");
    }

    /**
     * 아래 주석된 4개의 출력문이 정상 동작 하도록 Printer2 클래스 작성
     */
    public static void without_constructor_example() {
//        Printer2.println(10);
//        Printer2.println(true);
//        Printer2.println(5.7);
//        Printer2.println("오버로딩");
    }
}
