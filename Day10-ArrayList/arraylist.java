import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(12);
        l2.add(45);
        l2.add(75);

        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(7);
        l1.addAll(l2);
        System.out.println(l1.contains(52));
        System.out.println(l1.indexOf(6));
        //System.out.println(l1.lastIndexOf());
       // l1.clear();
        l1.set(1,566);

        //l1.removeAll(l2);  -- remove the elemtns of l2 from l1
        //l1.removeIf(n->(n%5==0)); -- removes elements from l1 if dicisble by 5
        //isEmpty() -- return true if array is empty
        //Collections.sort(l1);  -- ascending order sorting

        for (int i=0 ; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
