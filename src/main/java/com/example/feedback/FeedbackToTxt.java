package com.example.feedback;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FeedbackToTxt {
        /** Метод записи в файл **/
        public void WriteToTxt(String Name, String Mail, String Message){
            try {
                //Создание Separator для определения слеша
                String sprtr = File.separator;
                //Имя файла
                String fileName = Name + ".txt";
                //Создание файла
                File file = new File('.' + sprtr + "Data" + sprtr + "Users-feedback" + sprtr + fileName);
                if (file.createNewFile()) {
                    //запись в файл
                    FileWriter file_write = new FileWriter(file);
                    file_write.write("Дата записи: " + java.time.LocalDateTime.now() + "\n" + "Имя: " + Name + "\n" + "Почта: " + Mail + "\n" + "Сообщение: " + Message);
                    //остановка записи
                    file_write.close();
                    System.out.println("Файл сохранен в Users-feedback как: " + fileName);
                } else {
                    System.out.println("Файл уже существует");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла");
                e.printStackTrace();
            }

        }
}

