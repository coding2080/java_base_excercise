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

        if (x>5 && x<10) {
            return true;
        }
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
        String day;
        switch (idx) {
            case 0 :
                day="월요일" ;
                break;
            case 1 :
                day="화요일";
                break;
            case 2 :
                day="수요일";
                 break;
            case 3 :
                day="목요일";
                break;
            case 4 :
                day="금요일";
                break;
            case 5 :
                day="토요일";
                break;
            case 6 :
                day="일요일";
                break;
            default :
                day = "invalid index";
                break;
        }

        return day;

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
        int money;
        if (dice1 == dice2 && dice2 == dice3) {
            money = 10000+(dice1*1000);
            return money;
        } else if (dice1==dice2 || dice1==dice3 || dice2 ==dice3) {
            int result;
            if (dice1==dice2) {
                result=1;
            } else if(dice1==dice3) {
                result=2;
            } else {
                result=3;
            }

            if (result==1 || result==2) {
                money=1000+(dice1*100);
            } else {
                money=1000+(dice2*100);
            }
            return money;
        } else {
            int max = dice1;
            if(dice2>max) {
                max=dice2;
            }
            if(dice3>max) {
                max=dice3;
            }
            money = max*100;
            return money;
        }
    }
}
