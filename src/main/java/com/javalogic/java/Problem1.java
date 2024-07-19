package com.javalogic.java;

import java.util.ArrayList;

public class Problem1 {

    private int num1;
    private int num2;

    public ArrayList<Integer> printRange(int num1, int num2) {

        if (num1 < num2) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = num1; i <= num2; i++) {
                list.add(i);
            }
            return list;
        } else {
            return null;
        }

    }
}
