import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangaluru");

        @SuppressWarnings("rawtypes")
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for (String string : cities) {
        // System.out.println(string);
        // }
    }
}
