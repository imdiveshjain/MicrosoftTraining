import java.util.HashSet;

public class hashmapp {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        set<Integer> hs2 = new HashSet<>();

        hs.add(2);
        hs.add(4);
        hs.add(6);
        
        for (Integer elem : hs) {
            System.out.println(elem);
        }
    }
}
