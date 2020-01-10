import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        int[] arr = {9, 76, 64, 21};
        System.out.println(maxCoins(arr));
//        System.out.println(76 * 64 * 21 + 9 * 76 * 21 + 9 * 21 + 21);

    }

    public static int maxCoins(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        List<Integer> numsList = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++)
            numsList.add(nums[i]);

        int score = 0;

        while (numsList.size() > 2)
        {
            int min = Collections.min(numsList.subList(1,numsList.size()-1));
            int minIndex = numsList.indexOf(min);
            score += numsList.get(minIndex-1) * min * numsList.get(minIndex+1);
            numsList.remove(min);
        }

        System.out.println (score);
        return numsList.get(2);
    }

}