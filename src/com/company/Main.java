package com.company;


import com.company.exeptions.MyArrayDataException;
import com.company.exeptions.MyArraySizeException;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = {
                {"7","9","7","5"},
                {"4","5","4","1"},
                {"6","1","3","8"},
                {"2","7","1","4"}
        };


        Connector.checkIsArr4x4(arr);
        Connector.calculateArrSum(arr);

    }


}



