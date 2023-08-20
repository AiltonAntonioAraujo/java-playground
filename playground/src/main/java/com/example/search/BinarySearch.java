package com.example.search;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public BinarySearch() {
        super();
    }

    public int searchIntInArray(int[] array, int wantedInt) {
        /*
         * É necessário que o array esteje ordenado para
         * realizar a pesquisa binária
         */
        Arrays.sort(array);
        return searchWithBS(array, 0, array.length - 1, wantedInt);
    }

    private int searchWithBS(int[] array, int begin, int end, int wantedInt) {
        int middle = getMiddleElement(begin, end);
        while (end >= begin) {
            if (wantedInt == array[middle]) {
                break;
            } else if (wantedInt < array[middle]) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
            middle = getMiddleElement(begin, end);
        }

        /*
         * Se não encontrou o valor procurado
         * retorna valor de indice negativo
         */
        if (end < begin) {
            middle = -1;
        }
        return middle;
    }

    private int getMiddleElement(int begin, int end) {
        return Math.abs((begin + end) / 2);
    }

    public int[] initialize(int i) {
        return new Random().ints(i, 1, i).distinct().toArray();
    }

    public String firstElementsOfArrayInts(int[] array, int numberOfElements) {
        StringBuffer sb = new StringBuffer();
        int lastIndex = array.length <= numberOfElements ? array.length - 1 : numberOfElements - 1;
        sb.append('[');
        for (int i = 0; i <= lastIndex; i++) {
            sb.append(array[i]);
            sb.append(i <= lastIndex - 1 ? ',' : Character.MIN_VALUE);
        }
        sb.append(']');
        return sb.toString();

    }

}
