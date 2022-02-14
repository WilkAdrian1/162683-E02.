import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Zadanie_2 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        Zadanie_2.wypiszCoDrugi(l1);
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        Zadanie_2.wypiszCoDrugi(l2);

    }
    public static <T extends Iterable<E>, E>void wypiszCoDrugi(T iterable){
        ArrayList<String> list = new ArrayList<>();
        String result;
        boolean x=true;
        for(E t:iterable){
            if(x){
                list.add(String.valueOf(t));
            }
            x=!x;
        }
        result = String.join(",",list);
        System.out.println(result);
    }

}
