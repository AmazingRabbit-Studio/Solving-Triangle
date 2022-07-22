package io.github.armramzing;

import java.math.BigDecimal;
import java.math.MathContext;

public class AngleC extends Main{

    private static boolean isResult = false;

    public static void calculate() {

        threeSides();
        if (!isResult) {
            clampingAngleWithTwoSides();
            if (!isResult) {
                oppositeAngleWithTwoSides();
                if (!isResult) {
                    clampingSideWithTwoAngles();
                    if (!isResult) {
                        oppositeSideWithTwoAngles();
                    }
                }
            }
        }

        isResult = false;

    }

    public static void threeSides(){

        if (!a.equals(BigDecimal.ZERO)) {
            if (!b.equals(BigDecimal.ZERO)) {
                if (!c.equals(BigDecimal.ZERO)) {
                    C = c.multiply(new BigDecimal("180").divide(a.add(b).add(c),new MathContext(15)));
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void clampingAngleWithTwoSides() {

        if (!b.equals(BigDecimal.ZERO)) {
            if (!c.equals(BigDecimal.ZERO)) {
                if (!A.equals(BigDecimal.ZERO)) {
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal sinB = b.multiply(sinA).divide(a, new MathContext(15));
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    C = new BigDecimal("180").subtract(A).subtract(B);
                    isResult = true;
                    pass();
                }
            }
        }

        if (!a.equals(BigDecimal.ZERO)) {
            if (!c.equals(BigDecimal.ZERO)) {
                if (!B.equals(BigDecimal.ZERO)) {
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal sinC = c.multiply(sinA).divide(a, new MathContext(15));
                    C = BigDecimal.valueOf(Math.asin(sinC.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    Main.pass();
                }
            }
        }

    }

    public static void oppositeAngleWithTwoSides(){

        if(!a.equals(BigDecimal.ZERO)){
            if(!b.equals(BigDecimal.ZERO)){
                if(!A.equals(BigDecimal.ZERO)){
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal sinB = sinA.multiply(b).divide(a, new MathContext(15));
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    C = new BigDecimal("180").subtract(A).subtract(B);
                    isResult = true;
                    Main.pass();
                }
            }
        }

        if(!a.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!A.equals(BigDecimal.ZERO)){
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal sinC = sinA.multiply(c).divide(a, new MathContext(15));
                    C = BigDecimal.valueOf(Math.asin(sinC.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    Main.pass();
                }
            }
        }

        if(!a.equals(BigDecimal.ZERO)){
            if(!b.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal sinA = sinB.multiply(a).divide(b, new MathContext(15));
                    BigDecimal piA = BigDecimal.valueOf(Math.asin(sinA.doubleValue()));
                    BigDecimal piC = PI.subtract(piA).subtract(piB);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    C = BigDecimal.valueOf(Math.asin(sinC.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    Main.pass();
                }
            }
        }

        if(!b.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal sinC = sinB.multiply(c).divide(b, new MathContext(15));
                    C = BigDecimal.valueOf(Math.asin(sinC.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    Main.pass();
                }
            }
        }

    }

    public static void clampingSideWithTwoAngles() {

        if(!c.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    C = new BigDecimal("180").subtract(A).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

    }
    public static void oppositeSideWithTwoAngles() {

        if(!a.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    b = a.multiply(sinB).divide(sinA, new MathContext(15));
                    C = new BigDecimal("180").subtract(A).subtract(B);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!b.equals(BigDecimal.ZERO)){
            if(!B.equals(BigDecimal.ZERO)){
                if(!A.equals(BigDecimal.ZERO)){
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    a = b.multiply(sinA).divide(sinB, new MathContext(15));
                    C = new BigDecimal("180").subtract(B).subtract(A);
                    isResult = true;
                    pass();
                }
            }
        }

    }

}