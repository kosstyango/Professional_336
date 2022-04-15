import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkBarnaev {
    //Программа расчета суммы трех чисел

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число " + (i + 1));
            list.add(getInt());
        }
        System.out.println("Сумма чисел = " + summ(list));
    }

    public static int summ(ArrayList list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += (int) list.get(i);
        return sum;
    }

    public static int getInt() {
        Scanner s = new Scanner(System.in);
        boolean b = false;
        int a = 0;
        while (b == false) {
            try {
                a = s.nextInt();
                b = true;
            } catch (InputMismatchException e) {
                System.out.println(s.nextLine() + " это не число, попробуйте ещё");
            }
        }
        return a;
    }
}
