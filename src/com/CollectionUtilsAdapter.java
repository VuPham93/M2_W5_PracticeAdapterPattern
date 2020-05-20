package com;

import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{

    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<Integer> newNumbers = convertSetToList(numbers);
        return collectionUtils.findMax(newNumbers);
    }

    public static <T> List<T> convertSetToList(Set<T> set) {
        List<T> list = new ArrayList<>();

        for (T t : set)
            list.add(t);

        return list;
    }
}
