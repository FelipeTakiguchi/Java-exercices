package com.felipe.java_api;

public class Exercicio5 {
    public void Execute() {
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            else{
                count++;
            }
        }

        System.out.println("Total de impares: " + count);
    }
}
