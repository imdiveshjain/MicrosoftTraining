import java.util.HashSet;
import java.util.Set;

public class hashsett{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        hs.add(2);
        hs.add(4);
        hs.add(6);

        for (Integer elem : hs) {
            System.out.println(elem);
        }
    }
}
