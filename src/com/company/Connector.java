package com.company;

import com.company.exeptions.MyArrayDataException;
import com.company.exeptions.MyArraySizeException;

public class Connector {


    /**
     * Проверка является ли масив 4x4
     *
     * @param arr , должен быть двумерый масив
     * @throws MyArraySizeException При подачи масива не 4x4
     */

    public static void checkIsArr4x4(String[][] arr) throws MyArraySizeException {

        final int SIZE = 4;
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
             if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        System.out.println("Масив действительно 4х4 ");
    }

    /**
     * Сумирование
     * @param arr , должен быть масив
     * @return  сумму
     * @throws MyArrayDataException в случай если в масиве символ вместо цыфры
     */
    public static void calculateArrSum(String[][] arr) throws MyArrayDataException {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException();
                }

            }

        }
        System.out.println(sum);
    }

}
