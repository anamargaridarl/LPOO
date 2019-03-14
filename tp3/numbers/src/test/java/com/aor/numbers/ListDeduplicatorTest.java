package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDeduplicatorTest {
    private List<Integer> list;
    private List<Integer> expected;

    @Before
    public void helperMethod()
    {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
    }

    @Test
    public void deduplicate() {

        class StubSort implements IListSorter
        {
            @Override
            public List<Integer> sort() {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(2);
                list.add(4);
                return list;
            }
        }


        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(new StubSort());

        assertEquals(expected, distinct);
    }
}