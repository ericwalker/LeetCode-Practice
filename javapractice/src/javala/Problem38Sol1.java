// I wrote it using ArrayList, then transfer it into String. Maybe it's the reason why it's slow.
// I'll use String and append to solve it in sol2.

class Solution {
    public String countAndSay(int n) {

        // 1.     1
        // 2.     11
        // 3.     21
        // 4.     1211
        // 5.     111221

        if (n == 1)
            return "1";

        ArrayList<Integer> list = new ArrayList<>(1); // n = 111221, nList = {1,1,1,2,2,1}
        list.add(1);

        // create list for n == i
        for (int i = 2; i <= n; i++)
            list = findNextList(list);

        String result = "";
        for (int i = 0; i < list.size(); i++)
        {
            result += Integer.toString(list.get(i));
        }
        // result = list.toString();

        return result;
    }

    public ArrayList<Integer> findNextList(ArrayList<Integer> list)
    {
        int curNum = 0;
        int counter = 0;
        ArrayList<Integer> newList = new ArrayList<>();

        for (int val: list) // list == {1,2,1,1}
        {
            // val is the first item
            if (curNum == 0)
            {
                curNum = val;
                counter = 1;
            }

            // same item
            else if (curNum == val)
                counter++;

            // new item
            else
            {
                newList.add(counter);
                newList.add(curNum);

                // reset the counter and set new val as new curNum
                curNum = val;
                counter = 1;
            }
        }
        newList.add(counter);
        newList.add(curNum);

        return newList;
    }

}
