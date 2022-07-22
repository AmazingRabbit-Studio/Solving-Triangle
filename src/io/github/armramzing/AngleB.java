package io.github.armramzing;

import java.math.BigDecimal;
import java.math.MathContext;

public class AngleB extends Main{

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
                    B = b.multiply(new BigDecimal("180").divide(a.add(b).add(c),new MathContext(15)));
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
                    BigDecimal cosA = BigDecimal.valueOf(Math.sqrt(new BigDecimal("1").subtract(sinA.pow(2)).doubleValue()));
                    a = BigDecimal.valueOf(Math.sqrt(b.pow(2).add(c.pow(2)).subtract(new BigDecimal("2").multiply(b).multiply(c).multiply(cosA)).doubleValue()));
                    BigDecimal sinC = c.divide(a.multiply(sinA),new MathContext(15));

                    //TODO 莫名其妙的报错
                    C = BigDecimal.valueOf(Math.asin(sinC.doubleValue())).divide(PI, new MathContext(15)).multiply(new BigDecimal("180"));

                    B = new BigDecimal("180").subtract(A).subtract(C);
                    isResult = true;
                    Main.pass();
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
                    isResult = true;
                    pass();
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
                    BigDecimal piC = BigDecimal.valueOf(Math.asin(sinC.doubleValue()));
                    BigDecimal piB = PI.subtract(piA).subtract(piC);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    Main.pass();
                }
            }
        }

        if(!a.equals(BigDecimal.ZERO)){
            if(!c.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal sinA = sinC.multiply(a).divide(c, new MathContext(15));
                    BigDecimal piA = BigDecimal.valueOf(Math.asin(sinA.doubleValue()));
                    BigDecimal piB = PI.subtract(piA).subtract(piC);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
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
                    B = BigDecimal.valueOf(Math.asin(sinB.doubleValue())).divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void clampingSideWithTwoAngles(){

        if(!b.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    B = new BigDecimal("180").subtract(A).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

    }

    public static void oppositeSideWithTwoAngles() {

        if(!b.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    B = new BigDecimal("180").subtract(A).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

        if(!a.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    c = a.multiply(sinC).divide(sinA, new MathContext(15));
                    B = new BigDecimal("180").subtract(A).subtract(C);
                    isResult = true;
                    pass();
                }
            }
        }

    }

}