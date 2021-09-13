package com.tf;
import java.util.InputMismatchException;
import java.util.Scanner;

public class captureNumber {

    Integer captureInt () {
        try {
            Scanner scan = new Scanner(System.in);
            Integer captureNumberInt = scan.nextInt();
            return captureNumberInt;
        }
        catch (InputMismatchException ho) {
            throw new invalidInput();
        }
    }
}
