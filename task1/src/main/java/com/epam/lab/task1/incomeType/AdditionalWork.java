package com.epam.lab.task1.incomeType;

public class AdditionalWork extends Income {
    private boolean privatePerson;
    public AdditionalWork(int amount, String name, boolean privatePerson) {
        super(amount, name);
        this.privatePerson=privatePerson;

    }
    @Override
    public double getSum() {
        double taxPayment = 0.13*amount;
        if(!privatePerson)
        {
            return 2*taxPayment;
        }
            return taxPayment;
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Является частным лицом - "+privatePerson+","+"Налоговый вычет="+ + getSum() +
                '}');
    }

}
