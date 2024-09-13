package com.javalogic.java;


import java.util.ArrayList;

//Escriba un método que imprima todos los número impares entre el 1 al 255.
public class Problem2 {

    private int num1;
    private int num2;


    public ArrayList<Integer> oddsNumber(int num1, int num2) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }
        return oddList;
    }

}

