package com.sprint1.array;

public class Arrays {
    public static void main(String[] args) {
        // {Type}{변수명} 형태는 동일하고, array임을 표현하기 위해서는 []를 붙여주면 된다.
        String[] choo = { "미친추1", "미친추2", "미친추3" };

        System.out.println(choo[0]);
        System.out.println(choo[1]);
        System.out.println(choo[2]);
//        System.out.println(choo[3]); out of index

        // 선언되고 값이 할당되지 않은 경우에는 null이 출력되는 것을 확인 할 수 있다. -> Collection을 통해서 문제 해결
        // c, c++ 과 마찬가지로 array를 선언하기 위해서는 크기를 정해줘야 한다. (Swift와 다른점)
        String[] member = new String[4];
        member[0] = "choo1";
        member[1] = "choo2";
        member[2] = "choo3";

        for(int i = 0; i < 4; i++) {
            System.out.println(member[i]);
        }

        for(String e: member) {
            System.out.println(e);
        }
    }
}
