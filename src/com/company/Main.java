package com.company;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {


            {

                  Scanner con = new Scanner(System.in);

                  int n = con.nextInt();

                  int a = con.nextInt(), b = con.nextInt();

                  int c = con.nextInt(), d = con.nextInt();


                  int m[] = new int[n + 1];

                  for (int i = 1; i <= n; i++)

                        m[i] = i;


                  for (; a < b; a++, b--) {

                        int temp = m[a];
                        m[a] = m[b];
                        m[b] = temp;

                  }


                  for (; c < d; c++, d--) {

                        int temp = m[c];
                        m[c] = m[d];
                        m[d] = temp;

                  }


                  for (int i = 1; i <= n; i++)

                        System.out.printf("%d ", m[i]);


                  con.close();

            }

      }
}