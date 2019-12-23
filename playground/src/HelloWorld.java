import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        if (needle.length() == 0)
            System.out.println(0);

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                System.out.println(i);
                break;
            }
        }

        System.out.println(-1);
    }
}