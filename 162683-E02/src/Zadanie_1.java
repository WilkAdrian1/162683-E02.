import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Zadanie_1 {
    public static <T extends Comparable<? super T>> boolean jestPalindromem(ArrayList<T> ar) {
        for (int i = 0; i < ar.size() / 2; i++) {
            if(ar.get(i).compareTo(ar.get(ar.size() - 1 - i)) != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(Integer.valueOf("1"));
        ints.add(Integer.valueOf("2"));
        ints.add(Integer.valueOf("5"));
        ints.add(Integer.valueOf("2"));
        ints.add(Integer.valueOf("1"));
        System.out.println(ints);
        System.out.println(jestPalindromem(ints));

        ArrayList<LocalTime> times = new ArrayList<LocalTime>();
        times.add(LocalTime.of(20, 2, 1));
        times.add(LocalTime.of(13, 3, 4));
        times.add(LocalTime.of(23, 1, 3));
        times.add(LocalTime.of(20, 7, 4));
        times.add(LocalTime.of(21, 23, 1));
        System.out.println(times);
        System.out.println(jestPalindromem(times));
    }
}
