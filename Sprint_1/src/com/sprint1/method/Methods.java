package com.sprint1.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Methods {
    public static  void printChoo(int count) {
        for(int i = 0; i < count; i++) {
            System.out.printf("choo %d\n", i);
        }
    }

    public static String returnChoo(int count) {
        String choo = "";
        for(int i = 0; i < count; i++) {
            choo += i; // 자동으로 형변환이 발생하는것인가?
        }
        return choo;
    }

    public static void outChoo(int count) {
        String choo = "";
        for(int i = 0; i < count; i++) {
            choo += i; // 자동으로 형변환이 발생하는것인가?
        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(choo);
            out.close();
        } catch (IOException e) {
            System.out.println("Make Text File Error");
        }
    }

    public static void main(String[] args) {
        printChoo(3);
        System.out.println(returnChoo(3));
    }
}
