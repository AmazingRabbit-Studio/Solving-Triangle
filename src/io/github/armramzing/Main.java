package io.github.armramzing;

import java.math.BigDecimal;
import java.util.Scanner;

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
    static Scanner sc = new Scanner(System.in);
    static final BigDecimal PI = new BigDecimal("3.141592653589793");

    public static void start() {

        /*sc.useDelimiter("\n");

        System.out.println("请输入a的长度");
        if (sc.hasNextLine()) {
            a = new BigDecimal(sc.nextLine());
        }
        System.out.println("请输入b的长度");
        if (sc.hasNextLine()) {
            b = new BigDecimal(sc.nextLine());
        }

        System.out.println("请输入c的长度");
        if (sc.hasNextLine()) {
            c = new BigDecimal(sc.nextLine());
        }

        System.out.println("请输入A的大小");
        if (sc.hasNextLine()) {
            A = new BigDecimal(sc.nextLine());
        }

        System.out.println("请输入B的大小");
        if (sc.hasNextLine()) {
            B = new BigDecimal(sc.nextLine());
        }

        System.out.println("请输入C的大小");
        if (sc.hasNextLine()) {
            C = new BigDecimal(sc.nextLine());
        }*/

    }

    public static void clear(){
        a = BigDecimal.ZERO;
        b = BigDecimal.ZERO;
        c = BigDecimal.ZERO;
        A = BigDecimal.ZERO;
        B = BigDecimal.ZERO;
        C = BigDecimal.ZERO;
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
        MainWindow.calculate();

    }
}
