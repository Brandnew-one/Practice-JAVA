package com.sprint1.conditional;

public class Conditional {
    public static void main(String[] args) {
        // String은 대문자 시작
        String s1 = args[0];
        String s2 = args[1];

        /*
        * String 타입을 자세하게 보진 않았지만 char type의 array로 구성되어 있는 형태이고
        * array 타입은 기본적으로 주소값을 들고 있는 ref 타입 형태이기 때문에 주소값 == 주소값 형태로는 원하는 결과를 얻을 수 없다.
        */
        if(s1.equals("hello")) {
            System.out.println(s1);
            System.out.println(s1.length());
            System.out.println(s2);
            System.out.println("true");
        } else {
            System.out.println(s1);
            System.out.println(s1.length());
            System.out.println(s2);
            System.out.println("false");
        }

        // switch문에 break 써줘야 되는거 주의
        // switch문이 모든 조건을 cover할 필요는 없음, default를 쓰지 않는다고 해서 에러가 발생하지는 않음
        int a = 0;
        switch (a) {
            case 0:
                System.out.println("This is 0");
                break;
            case 1:
                System.out.println("This is 1");
                break;
            default:
                System.out.println("This is default");
                break;
        }
    }
}
