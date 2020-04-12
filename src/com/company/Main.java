package com.company;

import java.util.Scanner;

            public abstract class car {
                  private String model;
                  private String color;
                  private int maxSpeed;

                  public abstract void gas();

                  public abstract void brake();

                  public String getModel() {
                        return model;
                  }

                  public void setModel(String model) {
                        this.model = model;
                  }

                  public String getColor() {
                        return color;
                  }

                  public void setColor(String color) {
                        this.color = color;
                  }

                  public int getMaxSpeed() {
                        return maxSpeed;
                  }

                  public void setMaxSpeed(int maxSpeed) {
                        this.maxSpeed = maxSpeed;
                  }
            } public class Sedan extends Car {
                  @Override
                  public void gas() {
                        System.out.println("Седан газует!");
                  }

                  @Override
                  public void brake() {
                        System.out.println("Седан тормозит!");
                  }
            } public class audi extends Car {
                  @Override
                  public void gas() {
                        System.out.println("Ауди газует!");
                  }

                  @Override
                  public void brake() {
                        System.out.println("Ауди тормозит!");
                  }
            } public class hunday extends Car {
                  @Override
                  public void gas() {
                        System.out.println("Хендай газует!");
                  }

                  @Override
                  public void brake() {
                        System.out.println("Хендай тормозит!");
                  }
            }