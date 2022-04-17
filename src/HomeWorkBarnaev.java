import java.util.Random;
import java.util.Scanner;

public class HomeWorkBarnaev {
    //Программа угадай число

    public static void main(String[] args) {

        int compNumber = random();

        boolean f = true;
        while (f == true) {
            if (scan() == compNumber) {
                System.out.println("Вы выиграли");
                System.out.println("ПОЗДРАВЛЯЮ!!!");
                f = false;
            } else {
                System.out.println("Это неправильный ответ :(");
                System.out.println("Вы проиграли");
            }
        }
    }
        public static int random() {
            Random newRandom = new Random();
            int randoNumber = newRandom.nextInt(11) + 1;
            return randoNumber;
        }

        public static int scan(){
            System.out.println("Введите число от 1 до 10");
            Scanner scanner = new Scanner(System.in);
            int humanNumber = Integer.parseInt(scanner.nextLine());
            return humanNumber;
        }
    }