package com.company;


import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
public class Main  {





                        public static void main(String args[]) {
                              Scanner scanner = new Scanner(System.in);
                              int a = scanner.nextInt();
                              int[] array = new int[a];
                              int[] array1 = new int[a];
                              int min = getMin(array);
                              System.out.println("Minimum Value is: " + min);
                              for (int i = 0; i < min; i++) {
                                    System.out.print(array[i] + " ");
                                    array1[i+5]=array[i];
                                    array[i]=array1[i];
                              }
                        }

                        public static int getMin(int[] inputArray){
                              int minValue = inputArray[0];
                              for(int i=1;i<inputArray.length;i++){
                                    if(inputArray[i] < minValue){
                                          minValue = inputArray[i];
                                    }
                              }
                              return minValue;
                        }

      }

                  }

}