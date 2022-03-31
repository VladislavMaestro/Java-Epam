package com.epam.lab.task1.incomeType;

public class Gifts extends Income {
    public Gifts(int amount, String name) {
        super(amount, name);
    }
    @Override
    public double getSum() {
        double taxPayment = 0.12 * amount;
        if (amount <= 7521) {
            return 0;
        }
        return taxPayment;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Имеется фиксированная налоговая ставка,"+" Налоговый вычет=" + getSum() +
                '}');
    }
}