package com.company;
public interface Messenger{
      public void sendMessage();

      public void getMessage();
} public class Telegram implements Messenger {
      public void sendMessage() {

            System.out.println("Отправляем сообщение в Telegram!");
      }

      public void getMessage() {
            System.out.println("Читаем сообщение в Telegram!");
      }
} public class Viber implements Messenger {
      public void sendMessage() {

            System.out.println("Отправляем сообщение в Viber!");
      }

      public void getMessage() {
            System.out.println("Читаем сообщение в Viber!");
      }
} public class Vk implements Messenger {
      public void sendMessage() {

            System.out.println("Отправляем сообщение в Vk!");
      }

      public void getMessage() {
            System.out.println("Читаем сообщение в Vk!");
      }
} public class odnoclassniki implements Messenger {
      public void sendMessage() {

            System.out.println("Отправляем сообщение в odnoklassniki!");
      }

      public void getMessage() {
            System.out.println("Читаем сообщение в odnoklassniki!");
      }
} public class vatsapp implements Messenger {
      public void sendMessage() {

            System.out.println("Отправляем сообщение в vatsapp!");
      }

      public void getMessage() {
            System.out.println("Читаем сообщение в vatsapp!");
      }
}