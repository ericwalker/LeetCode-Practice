package javala;

class Problem169Sol2 {
    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> elementCounterMap = new HashMap<Integer, Integer>();

        for (int num: nums)
        {
            // if (!elementCounterMap.containsKey(num))
            if (elementCounterMap.get(num) == null)
                elementCounterMap.put(num, 1);
            else
                elementCounterMap.put(num, elementCounterMap.get(num)+1);
        }

        Map.Entry<Integer, Integer> majorityEntry = null;

        for (Map.Entry<Integer, Integer> entry : elementCounterMap.entrySet())
        {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue())
            {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}