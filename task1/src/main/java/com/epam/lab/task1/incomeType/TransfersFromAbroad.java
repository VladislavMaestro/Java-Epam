package com.epam.lab.task1.incomeType;

public class TransfersFromAbroad extends Income {
    private boolean transferFromRelative;
    public TransfersFromAbroad(int amount, String name, boolean transferFromRelative) {
        super(amount, name);
        this.transferFromRelative=transferFromRelative;
    }
    @Override
    public double getSum() {
        if(transferFromRelative) {return 0;}
        else {return 0.13*amount;}
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Перевод денег от родственника - "+transferFromRelative+","+"Налоговый вычет=" + getSum() +
                '}');
    }
}
