
import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(23);
        l1.add(45);
        l1.add(47);
        l1.add(98);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
