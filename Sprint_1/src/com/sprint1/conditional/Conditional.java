package com.sprint1.conditional;

public class Conditional {
    public static void main(String[] args) {
        // String은 대문자 시작
        String s1 = args[0];
        String s2 = args[1];

        if(s1 == "hello") {
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
