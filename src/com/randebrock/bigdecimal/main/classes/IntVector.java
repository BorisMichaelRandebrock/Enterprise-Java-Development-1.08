package com.randebrock.bigdecimal.main.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntVector implements IntList{
    int index;
    int[] arr = new int[20];
    private int counter;
    int[] list;
    public void add(int value) {
        if (arr.length == index){
            int longArr = new BigDecimal(arr.length *2f).setScale(0, RoundingMode.UP).intValue();
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
