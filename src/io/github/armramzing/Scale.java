package io.github.armramzing;

import java.math.BigDecimal;
import java.math.MathContext;

public class Scale extends Main {

    public static void calculate() {

        while(true){
            Scale.heron();
            if(S.equals(BigDecimal.ZERO)){
                Scale.clampingAngleWithTwoSides();
                if(S.equals(BigDecimal.ZERO)){
                    Scale.oppositeAngleWithTwoSides();
                    if(S.equals(BigDecimal.ZERO)){
                        Scale.clampingSideWithTwoAngles();
                        if(S.equals(BigDecimal.ZERO)){
                            Scale.oppositeSideWithTwoAngles();
                            if(S.equals(BigDecimal.ZERO)){
                                Scale.threeAngles();
                            }
                        }
                    }
                }
            }
            break;
        }

    }

    public static void heron(){

        if (!a.equals(BigDecimal.ZERO)) {
            if (!b.equals(BigDecimal.ZERO)) {
                if (!c.equals(BigDecimal.ZERO)) {
                    BigDecimal p = a.add(b).add(c).divide(new BigDecimal("2"),new MathContext(15));
                    BigDecimal s2 = p.multiply(p.subtract(a).multiply(p.subtract(b)).multiply(p.subtract(c)));
                    S = s2.sqrt(MathContext.DECIMAL64);
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }

    }

    public static void clampingAngleWithTwoSides(){

            if (!b.equals(BigDecimal.ZERO)) {
                if (!c.equals(BigDecimal.ZERO)) {
                    if (!A.equals(BigDecimal.ZERO)) {
                        BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                        BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                        S = b.multiply(c).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                        System.out.println(S);
                        Main.pass();
                        Main.clear();
                    }
                }
            }
        if (!a.equals(BigDecimal.ZERO)) {
                if (!c.equals(BigDecimal.ZERO)) {
                    if (!B.equals(BigDecimal.ZERO)) {
                        BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                        BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                        S = a.multiply(c).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                        System.out.println(S);
                        Main.pass();
                        Main.clear();
                    }
                }
            }
        if (!a.equals(BigDecimal.ZERO)) {
            if (!b.equals(BigDecimal.ZERO)) {
                    if (!C.equals(BigDecimal.ZERO)) {
                        BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                        BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                        S = a.multiply(b).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                        System.out.println(S);
                        Main.pass();
                        Main.clear();
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
                    BigDecimal piB = BigDecimal.valueOf(Math.asin(sinB.doubleValue()));
                    BigDecimal piC = PI.subtract(piA).subtract(piB);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    S = a.multiply(b).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    S = a.multiply(b).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    S = a.multiply(c).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    S = a.multiply(c).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piA = PI.subtract(piB).subtract(piC);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    S = b.multiply(c).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piA = PI.subtract(piB).subtract(piC);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    S = b.multiply(c).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }

    }

    public static void clampingSideWithTwoAngles() {

        if(!a.equals(BigDecimal.ZERO)){
            if(!B.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    A = new BigDecimal("180").subtract(B).subtract(C);
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    b = a.multiply(sinB).divide(sinA, new MathContext(15));
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    S = a.multiply(b).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }
        if(!b.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    B = new BigDecimal("180").subtract(A).subtract(C);
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    c = b.multiply(sinC).divide(sinB, new MathContext(15));
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    S = b.multiply(c).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }
        if(!c.equals(BigDecimal.ZERO)){
            if(!A.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    C = new BigDecimal("180").subtract(A).subtract(C);
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    a = c.multiply(sinA).divide(sinC, new MathContext(15));
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    S = a.multiply(c).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    S = a.multiply(b).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    S = a.multiply(c).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }
        if(!b.equals(BigDecimal.ZERO)){
            if(!B.equals(BigDecimal.ZERO)){
                if(!C.equals(BigDecimal.ZERO)){
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    c = b.multiply(sinC).divide(sinB, new MathContext(15));
                    A = new BigDecimal("180").subtract(B).subtract(C);
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    S = b.multiply(c).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    S = b.multiply(a).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
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
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    S = b.multiply(a).multiply(sinC).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }
        if(!c.equals(BigDecimal.ZERO)){
            if(!C.equals(BigDecimal.ZERO)){
                if(!A.equals(BigDecimal.ZERO)){
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    a = c.multiply(sinA).divide(sinC, new MathContext(15));
                    B = new BigDecimal("180").subtract(C).subtract(A);
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    S = c.multiply(a).multiply(sinB).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }
        if(!c.equals(BigDecimal.ZERO)){
            if(!C.equals(BigDecimal.ZERO)){
                if(!B.equals(BigDecimal.ZERO)){
                    BigDecimal piC = C.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinC = BigDecimal.valueOf(Math.sin(piC.doubleValue()));
                    BigDecimal piB = B.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinB = BigDecimal.valueOf(Math.sin(piB.doubleValue()));
                    b = c.multiply(sinB).divide(sinC, new MathContext(15));
                    A = new BigDecimal("180").subtract(C).subtract(B);
                    BigDecimal piA = A.divide(new BigDecimal("180"), new MathContext(15)).multiply(PI);
                    BigDecimal sinA = BigDecimal.valueOf(Math.sin(piA.doubleValue()));
                    S = c.multiply(b).multiply(sinA).divide(new BigDecimal("2"), new MathContext(15));
                    System.out.println(S);
                    Main.pass();
                    Main.clear();
                }
            }
        }

    }

    public static void threeAngles(){

        if(!A.equals(BigDecimal.ZERO)) {
            if (!B.equals(BigDecimal.ZERO)) {
                if (!C.equals(BigDecimal.ZERO)) {
                    Main.clear();
                    System.out.println("只给出三个角的数据无法解三角形！");
                }
            }
        }

    }

    public void others(){
        System.out.println("请检查你是否已经给出至少三个数据！");
    }

}