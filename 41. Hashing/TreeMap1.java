import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 50);
        tm.put("Us", 150);

        System.out.println(tm);
    }
}
