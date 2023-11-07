package com.felipe.java_api;

import java.util.Scanner;

public class Exercicio2 {
    public Float Execute() {
        Float[] numbers = new Float[4];
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira números para a soma: ");

        String nums[] = scan.nextLine().split("\\s+");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Float.parseFloat(nums[i]);
        }

        scan.close();
        Float sum = 0.0f;

        for (Float number : numbers) {
            sum += number;    
        }

        return sum;
    }
}
