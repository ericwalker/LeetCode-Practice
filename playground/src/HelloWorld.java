import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3};
        List<Integer> numList = new ArrayList<Integer>(numbers.length);
        for (int val: numbers)
            numList.add(val);

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> resultElement = new ArrayList<Integer>();

        findElement(numList, resultList, resultElement);

        System.out.println(numList);

    }

    public static List<List<Integer>> findElement (List<Integer> list, List<List<Integer>> resultList, List<Integer> curElement)
    {
        for (int i = 0; i < list.size(); i++) // decide the first element
        {
            ArrayList<Integer> newElement = new ArrayList<Integer>();
            newElement.add(list.get(i));
            list.remove(i);
            findElement (list, resultList, newElement);
        }

        return
    }
}