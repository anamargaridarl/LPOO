package com.aor.numbers;

public class PositiveFilter implements IListFilter{


    public boolean accept(Integer number) {

        if (number > 0)
            return true;
        else
            return false;
    }

}
