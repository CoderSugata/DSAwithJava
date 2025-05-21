import java.util.*;

public class ChainofPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 36, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected pair
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("maximum length of chain = " + chainLen);
    }
}
