package com.company;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class drygoereshenie {
      public static void main(String[] args) {
            try (FileWriter writer = new FileWriter(namefile, false)) {
                  {
                        String text = "hello gold";
                        writer.write(text);
                        writer.append('\n');
                        writer.append('E');
                  }
      catch(IOException ex){
                        System.out.println(ex.getMessage());
                  }
            }
      }
}