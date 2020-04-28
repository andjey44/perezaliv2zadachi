package com.company;

import java.util.Scanner;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;



public class Main
{
    public static int[] shiftArr(int[] inArr, int shift) {
        while (shift > 0) {
            int lastVar = inArr[inArr.length - 1];
            for (int counter = 0; counter < inArr.length; counter++) {
                int curVal = inArr[counter];
                inArr[counter] = lastVar;
                lastVar = curVal;
            }
            shift--;
        }
        return inArr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размерность массива: ");
        int n = scanner.nextInt();
        int[] testArr = new int[n];
        System.out.println("Введи сам массив: ");
        for(int i = 0; i < n; i++){
            testArr[i] = scanner.nextInt();
        }
        int min = getMin(testArr);
        System.out.println("Минимальное массива: " + min);
        testArr = shiftArr(testArr, min);
        System.out.println("Массив после сдвига на " + min + " элементов вправа: ");
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i] + " ");
        }
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}



