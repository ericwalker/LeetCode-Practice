package javala;

class Problem46SolRecu {
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> numList = new ArrayList<Integer>(nums.length);
        for (int val: nums)
            numList.add(val);

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> newElement = new ArrayList<Integer>();

        addElement(numList, resultList, newElement);

        return resultList;
    }

    public void addElement (List<Integer> numList, List<List<Integer>> resultList, List<Integer> curElement)
    {

        for (int i = 0; i < numList.size(); i++) // decide the first element
        {
            List<Integer> tempNumList = new ArrayList<>(numList); // <-- to reset numList
            List<Integer> newElement = new ArrayList<>(curElement); // <-- 

            newElement.add(numList.get(i));
            tempNumList.remove(i);

            if (tempNumList.isEmpty())
            {
                resultList.add(newElement);
                break;
            }

            addElement(tempNumList, resultList, newElement);
        }
    }

}