package ru.netology.sqr;

public class SQRService {
    int rangeLimit = 200;
    int rangeMax = 300;
    int amountFirst = 10;
    int amountLast = 99;

    public int calcSQRT(int rangeLimit, int rangeMax) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeLimit && i * i <= rangeMax) {
                amount++;
            }
        }
        return amount;
    }
}
