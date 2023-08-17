package com.example.sort;

import java.util.Arrays;

public class MainQS {
    public static void main(String[] args) {
        /*
         * Array especificado
         */
        char[] arrayOfChars = { 'Z', 'H', 'J', 'A', 'B', 'I', 'S' };

        QuickSortImpl sort = new QuickSortImpl();

        System.out.println("#######  Programa de Ordenação de um Array de Caracteres #########");
        System.out.println("Array antes da ordenação: " + Arrays.toString(arrayOfChars));
        sort.sortArrayofChars(arrayOfChars);
        System.out.println("Array após ordenação: " + Arrays.toString(arrayOfChars));
    }
}