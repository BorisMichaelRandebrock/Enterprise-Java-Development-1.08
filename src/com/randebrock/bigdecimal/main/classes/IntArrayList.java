package com.randebrock.bigdecimal.main.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntArrayList implements IntList {

    int index = 0;

    int[] arr = new int[10];

    public IntArrayList(int index, int[] arr) {
        this.index = index;
        this.arr = arr;
    }


    public void add(int value) {
        if (arr.length == index){
            int longArr = new BigDecimal(arr.length *1.5f).setScale(0, RoundingMode.UP).intValue();
            int newArr[] = new int[longArr];
            for (int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
                index++;
            }
            this.arr = newArr;
        }
        arr[index] = value;
        index++;
    }

    public int getElementById(int id) {
        return id;
    }
}
   /*
    int arrayLength = 0;
    private int[] array;

    public IntArrayList() {
        this.array = array;
    }
//    int arrayLength = 10;

        //private int[] array = new int[arrayLength];

    public void add() {

        if (array.length == arrayLength){
            int longerArray = new BigDecimal(array.length * 1.5f).setScale(0,RoundingMode.DOWN).intValue();
            int newArray[] = new int[longerArray];
            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
                arrayLength++;
            }
            this.array = newArray;

        }
        array[arrayLength] = number;
        arrayLength++;


    }

    @Override
    public int getElementById(int id) {
        return 0;
    }
}
*/


