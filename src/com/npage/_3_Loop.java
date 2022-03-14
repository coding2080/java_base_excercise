package com.npage;

public class _3_Loop {

    public static void main(String[] args) {
        System.out.println("Loop Exercise");

        System.out.println(addRange(1, 10)); // 55

        System.out.println(addRange2(5)); // 15
        System.out.println(addRange2(200)); // 55
        System.out.println(addRange2(-33)); // -1

        System.out.println("26 : " + getAddCycle(26)); // 4
        System.out.println("55 : " + getAddCycle(55)); // 3
        System.out.println("1 : " + getAddCycle(1)); // 60
        System.out.println("0 : " + getAddCycle(0)); // 1
        System.out.println("71 : " + getAddCycle(71)); // 12
    }

    /**
     * for 문 사용하여 입력 받은 시작 정수부터 끝 정수까지 모두 합한 값을 반환하는 함수
     *
     * @param begin 시작 정수
     * @param end   끝 정수
     * @return 시작과 끝 서이 정수들의 합
     */
    public static int addRange(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * while 문 사용하여 1부터 입력받은 정수까지 합을 반환하는 함수
     * 만약 입력받은 정수가 10보다 크다면 1부터 10까지 합한 값을 반환한다.
     * 만약 입력받은 정수가 0또는 음의 정수일 경우 -1을 반환한다.
     *
     * @param x
     * @return
     */
    public static int addRange2(int x) {
        int sum = 0;
        if (x > 10) {
            int i = 1;
            while (i <= 10) {
                sum += i;
                i++;
            }
        } else if (x == 0 || x < 0) {
            sum = -1;
        } else {
            int i=1;
            while(i<=x) {
                sum+=i;
                i++;
            }
        }
        return sum;
    }

    /**
     * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
     * 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
     * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
     * 다음 예를 보자
     * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
     * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
     * n이 주어졌을 때, n의 사이클의 길이를 구하는 프로그램을 작성하시오.
     * @param n 주어진 정주 n
     * @return n이 다시 n으로 돌아오는 사이클의 길이
     */
    public static int getAddCycle ( int n){
        int cnt=0;

        if (n<0 || n>=99) {
            cnt=-1;
        } else {
            int newNum=-1;
            while(n!=newNum) {
                int a,b,c,d,nn;
                if(newNum==-1) {
                    nn=n;
                } else {
                    nn=newNum;
                }
                a=nn/10;
                //System.out.println("a:"+a);
                b=nn%10;
                //System.out.println("b:"+b);

                c=a+b;

                //System.out.println("c:"+c);
                d=c%10;
                //System.out.println("d:"+d);
                newNum=(b*10)+d;
                //System.out.println("newNum : " + newNum);
                cnt+=1;
                //System.out.println("cnt : " + cnt);
                if(newNum == n) {
                    //System.out.println("cnt : " + cnt);
                    break;
                }


            }
        }
        return cnt;
    }
}


/*
    [22/03/14]
     - 예외처리는 먼저 진행 후 즉시 return 설정
     - 굳이 System.out.println으로 찍어볼 필요 없이 디버깅 활용하기
       F7 : 함수로 이동, F8 : 다음줄로 이동, F8 : 다음 디버깅 포인트로 이동
*/