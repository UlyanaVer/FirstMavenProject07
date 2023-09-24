package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static double sum(double a, double b){
        return a + b;
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double multiplication(double a,double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
    public static void main(String[] args) {

        System.out.println("Сумма: " + sum(1,5));
        System.out.println("Разница: " + sub(4.7, 3.4));
        System.out.println("Умножение: " + multiplication(7.8, 2));
        System.out.println("Деление: " + div(5.6, 2));
        String a1 = StringUtils.abbreviate("Привет всем кто живет на луне!",10);
        String a2 = StringUtils.abbreviate("Привет всем кто живет на луне!",20);
        System.out.println(a1);
        System.out.println(a2);

    }
}