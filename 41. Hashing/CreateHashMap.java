import java.util.*;

public class CreateHashMap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert -> O(1)
        hm.put("India", 100);
        hm.put("China", 10);
        hm.put("US", 40);

        // System.out.println(hm);

        // // Get -> O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Australlia")); // null

        // // ContainsKey -> O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // // remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // // size
        // System.out.println(hm.size());

        // // is Empty
        // System.out.println(hm.isEmpty());

        // // clear
        // hm.clear();
        // // System.out.println(hm.isEmpty());
        // System.err.println(hm);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= " + k + " ,Value= " + hm.get(k));
        }
    }
}
