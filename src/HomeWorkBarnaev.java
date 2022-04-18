public class HomeWorkBarnaev {
    public static void main(String[] args) {
        //дан массив [2, 3, 4, 5]
        int[] list = {2, 3, 4, 5};
        System.out.println("Произведение элементов массива равно " + multArray(list));
    }

    public static int multArray(int list[]) {
        int s = 1;
        for (int i : list) s*=i;
        return s;
    }
}
