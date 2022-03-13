package com.epam.lab.task1.incomeType;

public class SaleOfProperty extends Income {
    private int counterOfSales;
    public SaleOfProperty(int amount, String name, int counterOfSales) {
        super(amount, name);
        this.counterOfSales = counterOfSales;
    }
    @Override
    public double getSum() {
        double taxPayment =0.13*amount;
        if (counterOfSales >= 5) {return 2*taxPayment;}
        return taxPayment;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Количество проданного имущества за 5 лет - "+counterOfSales+","+"Налоговый вычет=" + getSum() +
                '}');
    }
}