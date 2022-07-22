package io.github.armramzing;

import java.math.BigDecimal;
import java.math.MathContext;

public class AngleA extends Main{

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
                    A = a.multiply(new BigDecimal("180").divide(a.add(b).add(c),new MathContext(15)));
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void clampingAngleWithTwoSides() {

        if (!a.equals(BigDecimal.ZERO)) {
            if (!c.equals(BigDecimal.ZERO)) {
                if (!B.equals(BigDecimal.ZERO)) {
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));

                    //TODO 精度问题
                    BigDecimal cosB = BigDecimal.valueOf(Math.sqrt(new BigDecimal("1").subtract(sinB.pow(2)).doubleValue()));
                    b = BigDecimal.valueOf(Math.sqrt(a.pow(2).add(c.pow(2)).subtract(new BigDecimal("2").multiply(a).multiply(c).multiply(cosB)).doubleValue()));
                    BigDecimal sinA = a.multiply(sinB).divide(b, new MathContext(15));
                    A = BigDecimal.valueOf(Math.asin(sinA.doubleValue())).divide(PI, new MathContext(15)).multiply(new BigDecimal("180"));

                    isResult = true;
                    pass();
                }
            }
        }

        if (!a.equals(BigDecimal.ZERO)) {
            if (!b.equals(BigDecimal.ZERO)) {
                if (!C.equals(BigDecimal.ZERO)) {
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal sinB = a.multiply(sinC).divide(b, new MathContext(15));
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    A = new BigDecimal("180").subtract(B).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void oppositeAngleWithTwoSides(){

        if(!a.equals(BigDecimal.ZERO)){
            if(!b.equals(BigDecimal.ZERO)) {
                if (!B.equals(BigDecimal.ZERO)) {
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal sinA = sinB.multiply(a).divide(b, new MathContext(15));
                    A = BigDecimal.valueOf(Math.asin(sinA.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!a.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal sinA = sinC.multiply(a).divide(c, new MathContext(15));
                    A = BigDecimal.valueOf(Math.asin(sinA.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!b.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal sinC = sinB.multiply(c).divide(b, new MathContext(15));
                    BigDecimal piC = BigDecimal.valueOf(Math.asin(sinC.doubleValue()));
                    A = PI.subtract(piB).subtract(piC).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!b.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal sinB = sinC.multiply(c).divide(b, new MathContext(15));
                    BigDecimal piB = BigDecimal.valueOf(Math.asin(sinB.doubleValue()));
                    A = PI.subtract(piB).subtract(piC).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void clampingSideWithTwoAngles(){

            if(!a.equals(BigDecimal.ZERO)) {
                if (!B.equals(BigDecimal.ZERO)) {
                    if (!C.equals(BigDecimal.ZERO)) {
                        A = new BigDecimal("180").subtract(B).subtract(C);
                        isResult = true;
                        pass();
                    }
                }
            }

    }

    public static void oppositeSideWithTwoAngles() {

        if (!b.equals(BigDecimal.ZERO)) {
            if (!B.equals(BigDecimal.ZERO)) {
                if (!C.equals(BigDecimal.ZERO)) {
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    c = b.multiply(sinC).divide(sinB, new MathContext(15));
                    A = new BigDecimal("180").subtract(B).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!c.equals(BigDecimal.ZERO)) {
            if (!C.equals(BigDecimal.ZERO)) {
                if (!B.equals(BigDecimal.ZERO)) {
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    b = c.multiply(sinB).divide(sinC, new MathContext(15));
                    A = new BigDecimal("180").subtract(C).subtract(B);
                    isResult = true;
                    pass();
                }
            }
        }

    }

}