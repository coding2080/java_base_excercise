package com.npage;

public class _2_Conditions {
    public static void main(String[] args) {
        System.out.println("Conditions Exercise");

        int x = 7;
        System.out.println(isBetweenFiveAndTen(x)); // true

        System.out.println(intToStrDate(0)); // 월요일
        System.out.println(intToStrDate(1)); // 화요일
        System.out.println(intToStrDate(2)); // 수요일
        System.out.println(intToStrDate(3)); // 목요일
        System.out.println(intToStrDate(4)); // 금요일
        System.out.println(intToStrDate(5)); // 토요일
        System.out.println(intToStrDate(6)); // 일요일
        System.out.println(intToStrDate(7)); // invalid index

        System.out.println(getDiceGameRewards(3, 3, 6)); // 1300
        System.out.println(getDiceGameRewards(2, 2, 2)); // 12000
        System.out.println(getDiceGameRewards(6, 2, 5)); // 600
    }

    /**
     * if문 사용할 것
     * 입력된 정수가 5와 10사이의 정수 값인지 확인하는 함수
     * @param x 입력 정수
     * @return true or false
     */
    private static boolean isBetweenFiveAndTen(int x) {
        return false;
    }

    /**
     * switch case 문 사용할 것
     * 입력 받은 정수 값에 매핑 되는 요일을 문자열로 반환하는 함수
     * 0 : 일요일
     * 1 : 월요일
     * ...
     * 6 : 토요일
     * 그외 값 : invalid index
     * @param idx 입력 인덱스 정수
     * @return 문자열 요일 or invalid index
     */
    public static String intToStrDate(int idx) {
        return "";
    }

    /**
     * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
     * - 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
     * - 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
     * - 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     * 위 규칙에 맞는 상금을 반환하는 함수
     * @param dice1 1번 주사위의 눈
     * @param dice2 2번 주사위의 눈
     * @param dice3 3번 주사위의 눈
     * @return 상금
     */
    public static int getDiceGameRewards(int dice1, int dice2, int dice3) {
        return 0;
    }
}
