package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRTest {
    @Test
    public void calcSQRT() {
        SQRService service = new SQRService();
        int expect = 3;
        int rangeLimit = 200;
        int rangeMax = 300;
        int actual = service.calcSQRT(200, 300);
        Assertions.assertEquals(expect, actual);
        System.out.println("итого " + actual);

    }

    @Test
    public void calcMinBorders() {
        SQRService service = new SQRService();
        int expect = 0;
        int rangeLimit = 10;
        int rangeMax = 99;
        int actual = service.calcSQRT(rangeLimit, rangeMax);
        Assertions.assertEquals(expect, actual);
        System.out.println("итого " + actual);

    }

    @Test
    public void calcMaxBorders() {
        SQRService service = new SQRService();
        int expect = 86;
        int rangeLimit = 100;
        int rangeMax = 9081;
        int actual = service.calcSQRT(rangeLimit, rangeMax);
        Assertions.assertEquals(expect, actual);
        System.out.println("итого " + actual);

    }
}
