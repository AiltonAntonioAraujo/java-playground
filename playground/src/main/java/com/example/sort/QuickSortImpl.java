package com.example.sort;

public class QuickSortImpl {

    /*
     * Método de ordenação de um Array de Chars
     * 
     */
    public void sortArrayofChars(char[] arr) {
        sortArrayWithQuickSort(arr, 0, arr.length - 1);

    }

    /*
     * Método recursivo de ordenação de um Array de Chars
     * utilizando o método de ordenação QuickSort
     */
    private void sortArrayWithQuickSort(char[] arr, int start, int end) {

        if (end > start) {
            int pivot = partitionArray(arr, start, end);
            sortArrayWithQuickSort(arr, start, pivot - 1);
            sortArrayWithQuickSort(arr, pivot + 1, end);

        }

    }

    /*
     * método de partição
     * Pivô o primeiro elemento do Array
     */
    private int partitionArray(char[] arr, int start, int end) {
        char pivot = arr[start];

        // indice da direita
        int indEsquerda = start + 1;
        // indice da esquerda
        int indDireita = end;

        while (indEsquerda <= indDireita) {
            while (indEsquerda <= indDireita && arr[indEsquerda] <= pivot) {
                indEsquerda++;
            }
            while (indDireita >= indEsquerda && arr[indDireita] > pivot) {
                indDireita--;
            }
            if (indEsquerda < indDireita) {
                change(arr, indDireita, indEsquerda);
                indEsquerda++;
                indDireita--;
            }
        }
        change(arr, start, indDireita);
        return indDireita;
    }

    /*
     * Método que efetua a troca de duas posições de
     * um Array de Chars
     */
    private void change(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}