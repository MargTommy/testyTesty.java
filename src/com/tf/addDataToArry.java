package com.tf;

public class addDataToArry {
    public Integer[] DataInput(){
        System.out.print("Proszę podczac liczę liczb :) :");
        captureNumber inputNumber = new captureNumber();
        int capturedCountInt = inputNumber.captureInt();
        Integer[] arryOrdynary = new Integer[capturedCountInt];
        int arrLoopCount=0;
        while (arrLoopCount < capturedCountInt) {
            System.out.println("Proszę podać " + (arrLoopCount+1) + " liczbę:");
            int capturedArryInt = inputNumber.captureInt();
            arryOrdynary[arrLoopCount] = capturedArryInt;
            ++arrLoopCount;
        }
        return arryOrdynary;
    }
}
