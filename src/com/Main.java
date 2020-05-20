package com;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(43);
        numbers.add(76);
        numbers.add(23);

        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(numbers);
    }
}
