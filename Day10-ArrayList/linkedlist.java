import java.util.ArrayList;
import java.util.LinkedList;   // similar to arraylist

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.add(45);
        l2.add(75);

        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(7);
        l1.addAll(l2);

        l1.addFirst(78564);
        l1.addLast(6565);
        l1.removeFirst();
        l1.removeLast();
        l1.offer(8); // adds elementn to the tail/end
        l1.offerFirst(5); // adds el;emt to the first of the array
        l1.offerLast(7);


        System.out.println(l1.contains(52));
        System.out.println(l1.indexOf(6));
        //System.out.println(l1.lastIndexOf());
        // l1.clear();
        l1.set(1 , 456); // replacin the index with the value

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
