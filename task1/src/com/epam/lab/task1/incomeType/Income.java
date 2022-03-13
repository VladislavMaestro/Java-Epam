package com.epam.lab.task1.incomeType;

public abstract class Income {
    protected String name;
    protected int amount;

    public abstract double getSum();

    protected Income(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Налог:" + name +
                ", Зарплата=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

}


