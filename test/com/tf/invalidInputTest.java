package com.tf;

import org.junit.Test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class invalidInputTest {
    @Test (expected=invalidInput.class)
    public void incorrectData(){
        try {
            String testTest = "b";
            Scanner scan = new Scanner(testTest);
            Integer captureNumberInt = scan.nextInt();
        }
        catch(InputMismatchException t) {
            throw new invalidInput();
        }
    }
}