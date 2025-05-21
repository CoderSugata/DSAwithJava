import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            ts.add(nums[i]);
        }
        System.out.println("Totals Distinct Elements = " + ts.size());
    }
}
