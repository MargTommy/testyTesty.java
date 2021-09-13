package com.tf;
import java.util.Arrays;


public class Main {

    public static void main(String[] args){
            poolOfSorts arryTest = new poolOfSorts();
            addDataToArry addMe = new addDataToArry();
            Integer[] arr1 = addMe.DataInput();
            Integer[] arr2 = addMe.DataInput();
            System.out.println("Pierwszy sort: " + Arrays.toString(arryTest.SortSomesort1(arr1)));
            System.out.println("Drugi sort: " + Arrays.toString(arryTest.SortSomesort2(arr2)));
    }
}
