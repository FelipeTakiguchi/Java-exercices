package com.felipe.java_api;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public List<Integer> Execute() {
        List<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 1000; i < 2000; i++) {
            if(i % 11 == 5){
                numeros.add(i);
            }
        }

        return numeros;
    }
}
