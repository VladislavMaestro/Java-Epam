package com.epam.lab.task1.comparators;

import com.epam.lab.task1.incomeType.*;
import java.util.Comparator;

public class SumComparator implements Comparator<Income> {
    @Override
    public int compare(Income o1, Income o2) {
            return Double.compare(o1.getSum(), o2.getSum());
        }
}
