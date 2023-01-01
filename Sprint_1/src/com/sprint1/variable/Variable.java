package com.sprint1.variable;

public class Variable {
    public static void main(String[] args) {
        // 기본적으로 변수를 선언하고 할당하는 방식은 c,c++과 동일 { type } { 변수명 };
        int a = 10;
        double b = 2.2;
        System.out.println(a + 5);
        System.out.println(b + 5);

        a = 0;
        b = 0.1;
        System.out.println(a + 5);
        System.out.println(b + 5);

        // 상수는 final 이라는 키워드를 함께 사용
        final int c = 10;
        System.out.println(c + 5);
//        c = 5;
//        System.out.println(c + 5);

        // -128 ~ 127 1Byte 크기의 데이터 타입
        /// 128 이상의 크기를 바로 할당 하면 에러가 발생하지만, 이미 할당된 값에 + 를 통해 넘어가면 -128로 넘어가는 것을 확인 할 수 있다.
        byte d = 127;
//        byte d = 128;
        System.out.println(d); // 127

        d += 1;
        System.out.println(d); // -128

        // 기본적으로 소수점에 f를 명시하지 않으면 java에서는 double로 사용된다.
        float e = 3.0f;
//        float e = 3.0;
        System.out.println(e +  0.1); // Double
        System.out.println(e +  0.1f); // Float

    }
}
