package io.github.armramzing;

import java.math.BigDecimal;

public class Circumference extends Main{

    public static void calculate(){

        if(!a1.equals(BigDecimal.ZERO)){
            if(!b1.equals(BigDecimal.ZERO)){
                if(!c1.equals(BigDecimal.ZERO)){
                    Cir1 = a1.add(b1).add(c1);
                    System.out.println(Cir1);
                }
            }
        }

    }

}
