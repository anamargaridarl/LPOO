package com.aor.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListFiltertest {

    private List<Integer> list;
    private List<Integer> expectedPos;
    private List<Integer> expectedDiv;

    @Before
    public void HelperMethod(){
        list = new ArrayList<>();
        list.add(-2);
        list.add(6);
        list.add(-1);
        list.add(4);
        list.add(2);

        expectedPos= new ArrayList<>();
        expectedPos.add(6);
        expectedPos.add(4);
        expectedPos.add(2);

        expectedDiv= new ArrayList<>();
        expectedDiv.add(-2);
        expectedDiv.add(6);
        expectedDiv.add(4);
        expectedDiv.add(2);




    }

    @Test
    public void Positive() {

        ListFilter filterer = new ListFilter(list);
        assertEquals(expectedPos,filterer.filter(new PositiveFilter()));

    }

    @Test
    public void Divisible() {

        ListFilter filterer = new ListFilter(list);
        assertEquals(expectedDiv,filterer.filter(new DivisibleByFilter(2)));

    }

}
