package com.felipe.java_api;

public class Exercicio1 {
    public void Exercicio1(){
        Float[] notas = {10f, 7.5f, 4f, 2f};

        Float media = 0.0f;

        for (Float nota : notas) {
            media += nota;
        }
        
        media /= notas.length;

        if(media > 7){
            System.out.println("Aprovado");
        } else if(media > 9 && media < 10){
            System.out.println("Parabéns");
        } else{
            System.out.println("Reprovado");
        }
    }
}
