package javala;

class Problem204Sol2 {
    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        int primeCounter = 0;

        boolean[] isPrimeArray = new boolean[n];
        for (int val = 2; val < n; val++) // val==0 or 1 should
            isPrimeArray[val] = true;

        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (!isPrimeArray[i])
                continue;
            for (int j = i * i; j <= n-1; j += i) // <== KEY POINT!!!
            {
                isPrimeArray[j] = false;
            }
        }

        for (boolean val: isPrimeArray)
            if (val)
                primeCounter++;

        return primeCounter;
    }
}