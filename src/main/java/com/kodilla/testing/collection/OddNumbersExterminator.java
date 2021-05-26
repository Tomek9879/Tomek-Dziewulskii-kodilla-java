package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List <Integer> exterminate(List<Integer> numbers) {
        List<Integer> listaLiczbParzystych = new ArrayList<>();
        if (numbers == null)
            return null;
        else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0)
                    listaLiczbParzystych.add(numbers.get(i));
            }
        }
        return listaLiczbParzystych;
    }
}