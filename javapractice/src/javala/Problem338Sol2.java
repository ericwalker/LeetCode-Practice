package javala;

class Problem338Sol2 {
    public int[] countBits(int num) {
        // Dynamic Programming

        int[] result = new int[num+1];
        result[0] = 0;

        // result[0] = 0
        // result[1] = 1
        // result[2] = result[1]
        // result[3] = result[1] + 1
        // result[4] = result[2]
        // result[5] = result[2] + 1
        // result[6] = result[3]

        for (int i = 1; i <= num; i++)
        {
            if (i%2 == 0)
                result[i] = result[i/2];
            else
                result[i] = result[i/2] + 1;
        }

        return result;
    }
}