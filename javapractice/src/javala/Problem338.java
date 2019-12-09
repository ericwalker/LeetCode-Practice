package javala;

class Problem338 {
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

            int times = i;
            // while (2*i<)
        }

        return result;
    }
}
