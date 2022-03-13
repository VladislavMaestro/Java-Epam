package com.epam.lab.task1;

import com.epam.lab.task1.comparators.SumComparator;
import com.epam.lab.task1.incomeType.*;

import java.util.Arrays;
import java.util.List;

public class Main {


    static List< ? extends Income> allTaxes = Arrays.asList(
            new MainWork(20000, "E-PAM Systems salary",false),
            new AdditionalWork(7000, "IT Consultant salary",false),
            new Royalties(8000, "Royalties",true),
            new TransfersFromAbroad(5000, "Transfers from abroad",true),
            new SaleOfProperty(140000, "Selling real estate",5),
            new Gifts(20000, "Gifts")
    );
    public static void main(String[] args) {
        allTaxes.stream().sorted(new SumComparator()).forEach(s-> System.out.println(s));
        double taxSum = allTaxes.stream().mapToDouble(s -> s.getSum()).sum();
        double incomeSum = allTaxes.stream().mapToDouble(s -> s.getAmount()).sum();
        System.out.println("\nСумма заработков: "+incomeSum+"\nСумма налоговых сборов: "+taxSum);
    }
}

