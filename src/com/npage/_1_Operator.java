package com.npage;

public class _1_Operator {

    public static void main(String[] args) {
        System.out.println("Operation Exercise");

        System.out.println(add(1, 2)); // 3
        System.out.println(sub(10, 2)); // 8
        System.out.println(mul(2, 2)); // 4
        System.out.println(div(6, 3)); // 2

        //자바 연산자 검색 후 만들기
        //나머지 몫
        System.out.println(remainder(7,3));
    }

    public static int add(int x, int y) {
        return x+y;
    }

    public static int sub(int x, int y) {
        return x-y;
    }

    public static int mul(int x, int y) {
        return x*y;
    }

    public static int div(int x, int y) {
        return x/y;
    }

    public static int remainder(int x, int y) {
        return x%y;
    }

}