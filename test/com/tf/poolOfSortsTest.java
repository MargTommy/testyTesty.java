package com.tf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class poolOfSortsTest {
    poolOfSorts testTest;
    Integer[] testArr1;
    Integer[] testArr1Res;
    Integer[] testArry2;
    Integer[] testArry3;
    Integer[] testArry3Res;

    @Before
    public void redyUp(){
        testTest = new poolOfSorts();
        testArr1 = new Integer[]{4,8,3,8,1,9,2};
        testArr1Res =new Integer[] {1,2,3,4,8,8,9};
        testArry2 = new Integer[] {1,2,3,4,5,6,7,8,9};
        testArry3 = new Integer[] {0,1,0,1,0,1,0,1};
        testArry3Res = new Integer[] {0,0,0,0,1,1,1,1};
    }
    @After
    public void cleanUp() {
        testTest=null;
        testArr1=null;
        testArr1Res=null;
        testArry2=null;
        testArry3=null;
        testArry3Res=null;
    }

    @Test(timeout = 100)
    public void sortSomesort1_st(){
        Assert.assertTrue("Tablica 1 Jest Pusta!",!(testTest.SortSomesort1(testArr1) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArr1Res,testTest.SortSomesort1(testArr1));
        Assert.assertTrue("Tablica 1 Jest Pusta!",!(testTest.SortSomesort1(testArry2) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArry2,testTest.SortSomesort1(testArry2));

    }
    @Test
    public void sortSomesort1_bin() {
        Assert.assertTrue("Tablica 1 Jest Pusta!",!(testTest.SortSomesort1(testArry3) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArry3Res,testTest.SortSomesort1(testArry3));

    }

    @Test(timeout = 100)
    public void sortSomesort2_st() {
        Assert.assertTrue("Tablica 2 Jest Pusta!",!(testTest.SortSomesort2(testArr1) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArr1Res,testTest.SortSomesort2(testArr1));
        Assert.assertTrue("Tablica 2 Jest Pusta!",!(testTest.SortSomesort2(testArry2) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArry2,testTest.SortSomesort2(testArry2));

    }
    @Test
    public void sortSomesort2_bin() {
        Assert.assertTrue("Tablica 2 Jest Pusta!",!(testTest.SortSomesort2(testArry3) == null));
        Assert.assertArrayEquals("Powieście mnie za nogi przy tablicy 1!",testArry3Res,testTest.SortSomesort2(testArry3));
    }

}