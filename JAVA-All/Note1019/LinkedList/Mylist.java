package Note1019.LinkedList;

import java.util.*;

public class Mylist {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add("수성 ");
        a1.add("화성 ");
        a1.add("지구 ");
        System.out.println(" ArrayList ");
        System.out.print(a1);
        a1.remove(1);
        System.out.print("\n" + a1.get(1));
        a1.add(1, "금성 ");
        System.out.print("\n" + a1);
        List l1 = new LinkedList();
        l1.add("수성 ");
        l1.add("화성 ");
        l1.add("지구 ");
        System.out.println("\n");
        System.out.println(" LinkedList ");
        System.out.print(l1);
        a1.remove(1);
        System.out.print("\n" + a1.get(1));
        a1.add(1, "금성 ");
        System.out.print("\n" + a1);
    }
}