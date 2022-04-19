import java.util.Scanner;

public class HomeWorkBarnaev {
//    Для расчета количества дней в году требуется знать несколько правил:
//    В високосном году 366 дней, в обычном 365.
//    Високосный год — это год, номер которого делится без остатка на 400 (например 2000 или 2400),
//          либо делится на 4 но не делится на 100 (например 2008, 2096, но не 2100).
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year;
        while (true) {
            System.out.print("Введите год: ");
            if (s.hasNextInt())
            {   year = s.nextInt();
                break;}
            else System.out.println(s.nextLine() + " это не число");
        }
    System.out.println(year+" "+isLeapYear(year));
    }

    public static String isLeapYear(int year) {
        if (year%400 == 0) return "високосный, в нём 366 дней";
        else if (year%4 == 0 && year%100 != 0) return "високосный, в нём 366 дней";
        else return "не високосный, в нём 365 дней";
    }
}