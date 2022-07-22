package io.github.armramzing;

import java.math.BigDecimal;

public class Main {

    static BigDecimal a = BigDecimal.ZERO;
    static BigDecimal b = BigDecimal.ZERO;
    static BigDecimal c = BigDecimal.ZERO;
    static BigDecimal A = BigDecimal.ZERO;
    static BigDecimal B = BigDecimal.ZERO;
    static BigDecimal C = BigDecimal.ZERO;
    static BigDecimal a1 = BigDecimal.ZERO;
    static BigDecimal b1 = BigDecimal.ZERO;
    static BigDecimal c1 = BigDecimal.ZERO;
    static BigDecimal A1 = BigDecimal.ZERO;
    static BigDecimal B1 = BigDecimal.ZERO;
    static BigDecimal C1 = BigDecimal.ZERO;
    static BigDecimal S = BigDecimal.ZERO;
    static BigDecimal Cir = BigDecimal.ZERO;
    static BigDecimal S1 = BigDecimal.ZERO;
    static BigDecimal Cir1 = BigDecimal.ZERO;
    static final BigDecimal PI = new BigDecimal("3.141592653589793");

    public static void clear(){
        a = BigDecimal.ZERO;
        b = BigDecimal.ZERO;
        c = BigDecimal.ZERO;
        A = BigDecimal.ZERO;
        B = BigDecimal.ZERO;
        C = BigDecimal.ZERO;
        S = BigDecimal.ZERO;
        Cir = BigDecimal.ZERO;
    }

    public  static void clearPassedValues(){
        a1 = BigDecimal.ZERO;
        b1 = BigDecimal.ZERO;
        c1 = BigDecimal.ZERO;
        A1 = BigDecimal.ZERO;
        B1 = BigDecimal.ZERO;
        C1 = BigDecimal.ZERO;
        S1 = BigDecimal.ZERO;
        Cir1 = BigDecimal.ZERO;
    }

    public static void pass(){
        a1 = a;
        b1 = b;
        c1 = c;
        A1 = A;
        B1 = B;
        C1 = C;
        S1 = S;
        Cir1 = Cir;
    }

    public static void main(String[] args) {

        MainWindow.start();

    }
}
