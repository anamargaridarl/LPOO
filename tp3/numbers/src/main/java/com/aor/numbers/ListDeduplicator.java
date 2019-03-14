package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * An utility class that removes duplicate numbers
 * from a list.
 */
public class ListDeduplicator implements IListDeduplicator {
    private final List<Integer> list;

    public ListDeduplicator(List<Integer> list) {
        this.list = list;
    }

    /**
     * Removes duplicate numbers from a list.
     *
     * @return A list having the same numbers as the original
     * but withou duplicates. The order of the numbers might
     * change.
     */

    Integer flag = 0;

    public List<Integer> deduplicate(IListSorter list) {

        List<Integer> sorted = list.sort();
        List<Integer> unique = new ArrayList<>();

        for (int n = 0; n < sorted.size(); n++) {
            for (int i = n + 1; i < sorted.size(); i++) {

                if (sorted.get(n).equals(sorted.get(i)))
                    flag = 1;
            }
                if (flag != 1) {
                    unique.add(sorted.get(n));
                }
            flag = 0;


        }
        return unique;
    }

}
