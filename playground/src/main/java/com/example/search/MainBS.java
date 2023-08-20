package com.example.search;

public class MainBS {

    public static void main(String[] args) {

        /*
         * Programa realiza a busca em um Array
         * especificado retornando a posição encontrada
         * 
         */
        System.out.println("########### PROGRAMA REALIZA PESQUISA BINARIA ##################");

        BinarySearch bs = new BinarySearch();

        /*
         * Inicializa um array de inteiros
         * com a quantidade de elementos especificada
         */
        int[] array = bs.initialize(1000);

        System.out.println(bs.firstElementsOfArrayInts(array, 20));


        /*
         * Realizar a busca informando o valor a ser pesquisado
         */
        int valor_pesquisa = 10;

        int posicao = bs.searchIntInArray(array, valor_pesquisa);
        
        if (posicao >= 0) {
            System.out.printf("O valor pesquisado %d foi encontrado no array \n", valor_pesquisa,
                    posicao);

        } else {
            System.out.printf("O valor pesquisado %d não foi encontrado no array \n", valor_pesquisa);
        }

    }
}
