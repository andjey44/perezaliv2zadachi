package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String args[]) {
            int n, arr[];
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер массива");
            n = in.nextInt();
            arr = new int[n];
            for (int i : arr)
                  i = (int) (Math.random() * n);
            for (int i : arr)
                  System.out.print(i + " ");
      }
}