package com.epam.lab.task1.incomeType;

public class MainWork extends Income {
    private boolean privatePerson;
    public MainWork(int amount, String name, boolean privatePerson) {
        super(amount, name);
        this.privatePerson=privatePerson;
    }
    @Override
    public double getSum() {
        if(privatePerson) {return 0.13*amount;}
        else {return 0.20*amount;}
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Является частным лицом - "+privatePerson+","+" Налоговый вычет=" + getSum() +
                '}');
    }
}
