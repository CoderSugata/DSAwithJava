import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 50);
        lhm.put("Us", 150);

        System.out.println(lhm);
    }
}
