package javala;

class Problem338Sol1 {
    public int[] countBits(int num) {

        int[] result = new int[num+1];
        result[0] = 0;

        for (int i = 1; i <= num; i++)
        {
            // used to neglect the result[i] which is already given the number
            if (result[i]>0)
                continue;

            int temp = i;

            while (temp != 1)
            {
                result[i] = result[i] + temp%2;
                temp = temp/2;
            }
            result[i] += 1;

            int multi = i;
            while (2*multi<=num)
            {
                multi = multi * 2;
                result[multi] = result[i];
            }
        }

        return result;
    }
}