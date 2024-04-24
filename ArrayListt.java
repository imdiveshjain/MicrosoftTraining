import java.util.ArrayList;
import java.util.List; // Added import statement

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(15);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println(al.size());
        System.out.println(al.remove(0));
    }
}
