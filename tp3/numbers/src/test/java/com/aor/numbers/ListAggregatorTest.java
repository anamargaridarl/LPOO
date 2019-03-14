package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;

public class ListAggregatorTest  {
    List<Integer> list;
    List<Integer> list2;
    List<Integer> list3;

    @Before
    public void helperMethod()
    {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(-4);
        list2.add(-5);

        list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(4);
        list3.add(2);

    }




    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void max2() {

        ListAggregator aggregator = new ListAggregator(list2);

        int max = aggregator.max();

        assertEquals(-1, max);
    }

    @Test
    public void min() {

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }


    @Test
    public void distinct() {

        ListAggregator aggregator = new ListAggregator(list3);


        class StubDeDup implements IListDeduplicator
        {
            @Override
            public List<Integer> deduplicate(IListSorter sorted) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(3);
                return list;
            }
        }


        int distinct = aggregator.distinct(new ListDeduplicator(list3));

        assertEquals(3, distinct);


        List<Integer> mockList = new ArrayList<>();
        mockList.add(1);
        mockList.add(2);
        mockList.add(4);


        IListDeduplicator mockDedup = Mockito.mock(IListDeduplicator.class);

        Mockito.when(mockDedup.deduplicate(any(IListSorter.class))).thenReturn(mockList);

        assertEquals(3, aggregator.distinct(mockDedup));


    }
}