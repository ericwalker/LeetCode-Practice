import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Dynamic array:
// In C++, there's vector,
// In Java, there's ArrayList

public class Main {
    public static void main(String[] args) {
        // 1. Initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1; // v1 == null
        // 2. cast an array to a vector (list)
        Integer[] a = {0, 2, 4, 6, 8};
        v1 = new ArrayList<>(Arrays.asList(a));
        // 3. make a copy
        List<Integer> v2 = v1;                  // another reference to v1
        List<Integer> v3 = new ArrayList<>(v1); // actual copy of v1
        // 4. get length
        System.out.println("The size of v1 is: " + v1.size());
        // 5. access element
        System.out.println("The fourth element of v1 is: " + v1.get(3));
        // 6. iterate the vector
        System.out.print("[Version 1] The contents of v1 are:");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(" " + v1.get(i));
        }
        System.out.println();
        System.out.print("[Version 2] Te contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }

    }
}