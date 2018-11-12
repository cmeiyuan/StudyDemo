import com.cmy.sort.ISort;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month);

        calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -2);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);

        System.out.println(year);
        System.out.println(month);

    }

    public static void sort(int[] array, ISort sort) {
        System.out.print(sort.getName() + "=>");
        sort.doSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }

}
