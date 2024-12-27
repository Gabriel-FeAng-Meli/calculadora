package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 double firstNumber, secondNumber;

        Scanner scanInput = new Scanner(System.in);

        System.out.println("\n============================================================\n");

        System.out.println("Escolha o primeiro numero:");

        try {
            firstNumber = scanInput.nextDouble();
        } catch (Exception e) {
            System.err.println("Não foi inserido um número válido. Fechando programa...");
            System.out.println("\n============================================================\n");


            scanInput.close();
            throw new RuntimeException("Input inválido");
        }


        System.out.println("Agora escolha o segundo numero:");

    
        try {
            secondNumber = scanInput.nextDouble();
        } catch (Exception e) {
            System.err.println("Não foi inserido um número válido. Fechando programa...");
            System.out.println("\n============================================================\n");

            scanInput.close();
            throw new Error("Input inválido");
        }

        System.out.println("Escolha a operação a ser realizada: (+, -, *, /)");

        char operation = scanInput.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default: 
                System.out.println("Não foi utilizada uma das 4 operações válidas (soma, subtração, multiplicação ou divisão). Fechando programa...");
                System.out.println("\n============================================================\n");
                scanInput.close();
                throw new RuntimeException("Operação inválida");
        }

        scanInput.close();

        System.out.println("\nResultado: ");
        System.out.print(firstNumber + " " + operation + " " + secondNumber + " = " + result);

        System.out.println("\n============================================================\n");
    }
}