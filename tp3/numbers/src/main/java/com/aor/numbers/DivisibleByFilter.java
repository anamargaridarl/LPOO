package com.aor.numbers;

import java.util.List;

public class DivisibleByFilter implements IListFilter{

    private Integer num;

    public DivisibleByFilter(Integer num) {
        this.num = num;
    }

    public boolean accept(Integer number) {
        if (number % num == 0)
            return true;
        else
            return false;
    }
}
