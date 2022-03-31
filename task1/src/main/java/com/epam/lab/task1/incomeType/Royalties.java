package com.epam.lab.task1.incomeType;

public class Royalties extends Income {
    private boolean clubOfCraftsmen;
    public Royalties(int amount, String name, boolean clubOfCraftsmen) {
        super(amount, name);
        this.clubOfCraftsmen=clubOfCraftsmen;
    }
    @Override
    public double getSum() {
        if(clubOfCraftsmen) {return 0.13*amount;}
        else{return 0.22*amount;}
    }
    @Override
    public String toString() {
        return super.toString().replace("}", ", {" +
                "Состоит в организации ремесленников - "+clubOfCraftsmen+","+"Налоговый вычет=" + getSum() +
                '}');
    }
}
