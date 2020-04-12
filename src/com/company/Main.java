package com.company;

import java.util.Scanner;

public class Main {


                  public static void main(String args[]) {
                        int firstnumber, secondnumber, choice;

                        System.out.println("1- Add");
                        System.out.println("2- Sub");
                        System.out.println("3- Div");
                        System.out.println("4- Mul");
                        System.out.print("Enter your choice -");
                        Scanner var = new Scanner(System.in);

                        choice = var.nextInt();
                        System.out.print("Enter first number -");
                        firstnumber = var.nextInt();
                        System.out.print("Enter second number -");
                        secondnumber = var.nextInt();
                        calc(choice, firstnumber, secondnumber); // 3rd arg added for choice
                  }

                  public static void calc(int choice, int x, int y) { // 3rd param added for choice
                        int c;

                        switch (choice) {
                              case 1:
                                    c = x + y;
                                    System.out.print("Output-" + c);
                                    break;

                              case 2:
                                    c = x - y;
                                    System.out.print("Output-" + c);
                                    break;

                              case 3:
                                    c = x / y;
                                    System.out.print("Output-" + c);
                                    break;

                              case 4:
                                    c = x * y;
                                    System.out.print("Output-" + c);
                                    break;
                        }
                  }
            }
