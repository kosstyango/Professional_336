import java.io.*;
import java.util.Scanner;

public class HomeWorkBarnaev {
    //    создать два текстовых документа с помощью IDEA. Наполнить их произвольным текстом.
    //    Из первого текстового файла во второй надо переписать все строки, вставив в конец каждой строки ее длину.
    public static void main(String[] args) throws IOException {
        try {
            String str = "Это проверочная запись в файл С:/text1.txt";
            File file1 = new File("c:/text1.txt"); //Создаём первый файл
            FileWriter fr = new FileWriter(file1);   // Открываем поток записи файла
            BufferedWriter br = new BufferedWriter(fr);  //Буферизируем поток записи
            for (int i = 0; i < 100; i++) {
                br.write(Integer.toString(i + 1)+ " " + str + (char)10); //пишем в файл строку с её порядковым номером
            }
            fr.flush(); //прочищаем поток
            br.flush(); //прочищаем поток
            System.out.println("Запись файла завершена успешно");
            fr.close(); //закрываем поток
            br.close(); //закрываем поток
        } catch (Exception e) {System.out.println("Записать первый файл не удалось");}

        try {
            String str2;
            File file2 = new File("c:/text2.txt"); //создаём второй файл
            FileWriter fr2 = new FileWriter(file2);   //Создаём поток записи 2-го файла
            BufferedWriter br2 = new BufferedWriter(fr2);  //Создаём буферизированный поток записи 2-го файла
            FileReader fr1 = new FileReader("c:/text1.txt");   //Создаём поток чтения из 1-го файла
            BufferedReader br1 = new BufferedReader(fr1);  //Буферизируем поток чтения из 1-го файла

            while (br1.ready()) {
                str2 = br1.readLine(); //считываем строку из 1-го файла
                //System.out.println("Считана строка: " + str2);
                int strLength = str2.length(); //вычисляем длину считанной строки
                //System.out.println("В этой строке "+strLength+" символов.");
                str2 += Integer.toString(strLength); //добавляем в конец строки её длину
                //System.out.println("Записываем во 2 файл строку "+str2);
                br2.write(str2+ (char)10); //записываем строку с длинной во 2-й файл
            }
            System.out.println("Перезапись файла завершена успешно");
            fr2.flush(); //очищаем поток
            br2.flush(); //очищаем поток
            fr1.close(); //закрываем поток
            br1.close(); //закрываем поток
            fr2.close(); //закрываем поток
            br2.close(); //закрываем поток
        } catch (IOException e) {
            System.out.println("Ошибка перезаписи");
        }
    }
}