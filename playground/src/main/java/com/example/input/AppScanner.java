package com.example.input;

import java.util.Scanner;




public class AppScanner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um valor");
            String nome = scanner.nextLine();

            System.out.println("Valor digitado foi: "+nome);
        }



    }
}