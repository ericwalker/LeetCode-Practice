import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {


    public static class MyHashSet {

        boolean[] map = new boolean[1000000];

        /** Initialize your data structure here. */
        public MyHashSet() {

        }

        public void add(int key) {

            map[key] = true;
        }

        public void remove(int key) {
            map[key] = false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return map[key];
        }
    }


    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.remove(2);
        boolean param_3 = obj.contains(3);
    }
}