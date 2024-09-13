package com.javalogic.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class JavaLogicApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaLogicApplication.class, args);
        // problema 1
        Problem1 problem1 = new Problem1();
        ArrayList<Integer> list = problem1.printRange(1, 255);
        System.out.println(list);

        //problema 2

        Problem2 problem2 = new Problem2();
        System.out.println(problem2.oddsNumber(1, 255));
    }

}
