import java.lang.reflect.Array;
import java.util.*;

public class List {
        public static void main(String[] args) {
                // ArrayList<Integer> list = new ArrayList<>();
                // list.add(25);
                // ArrayList<Integer> list2 = new ArrayList<>();
                // list2.add(50);
                // list.addAll(list2);
                //
                // //access
                // System.out.println(list.get(0));
                //
                // //set
                // list.set(0,100);
                //
                // //size
                // System.out.println(list.size());
                //
                // //removal
                // list.remove(0);
                //
                // System.out.println(list.size());
                //
                // list.removeAll(list2);
                //
                // System.out.println(list.size());
                // list.add(11);
                // list.clear();
                //
                // System.out.println(list.size());
                // list.add(12);
                //
                // Object[] arr= list.toArray();
                // System.out.println("Printing");
                // for(Object obj: arr) {
                // System.out.println(obj.toString());
                // }
                //
                // System.out.println(list.contains(10));
                // list.add(23);
                // list.add(2);
                // //sorting
                // Collections.sort(list, Collections.reverseOrder());
                // System.out.println(list);
                // Collections.sort(list);
                // System.out.println(list);
                //
                // ArrayList<Integer> listCopy = (ArrayList<Integer>)list.clone();
                // System.out.println(listCopy);
                //
                // //ensureCapacity
                // list.ensureCapacity(2);
                //
                // System.out.println(list.indexOf(12));
                // System.out.println(list.isEmpty());

                // LL starts here
                // LinkedList<Integer> list = new LinkedList<>();
                // list.add(10);
                // list.add(20);
                // list.add(30);
                // System.out.println(list);
                // list.addFirst(5);
                // list.addLast(50);
                // System.out.println(list);
                // System.out.println(list.getFirst());
                // System.out.println(list.getLast());
                // System.out.println(list.removeFirst());
                // System.out.println(list.removeLast());
                // System.out.println(list);
                //
                // System.out.println(list.peek());
                // System.out.println(list);
                // System.out.println(list.poll());
                // System.out.println(list);
                //
                //
                // System.out.println(list.offer(1001));
                // System.out.println(list);

                // Vector Starts here
                // Vector<Integer> v = new Vector<>();
                // v.add(10);
                // v.add(20);
                // v.add(30);
                // System.out.println(v);
                // v.set(0,100);
                // System.out.println(v);
                //
                // Object[] arr = v.toArray();
                // for(Object obj: arr) {
                // System.out.println(obj);
                // }
                // System.out.println(v.toString());

                // Stack starts here
                Stack<Integer> st = new Stack<>();
                st.push(10);
                st.push(20);
                st.push(30);
                System.out.println(st);
                st.pop();

                System.out.println(st);

                System.out.println(st.peek());

                System.out.println(st.empty());

                System.out.println(st.search(10));

        }
}