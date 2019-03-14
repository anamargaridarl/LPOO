package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {

    private List<Integer> list;

    public ListFilter(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> filter(IListFilter filter)
    {
        List<Integer> filtered = new ArrayList<>();

        for(Integer i: this.list)
        {
            if(filter.accept(i))
                filtered.add(i);
        }

        return filtered;

    }



}
