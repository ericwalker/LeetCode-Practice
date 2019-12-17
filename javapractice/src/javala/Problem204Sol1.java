package javala;

class Problem204Sol1 {
    public static int countPrimes(int n) {

        if (n <= 2)
            return 0;
        else if (n == 3)
            return 1;

        List<Integer> primeArray = new ArrayList<Integer>();
        primeArray.add(2);
        primeArray.add(3);

        for (int i = 4; i <= n-1; i++)
        {
            // judge if i is prime or not
            if ((i+1)%6 == 0 || (i-1)%6 == 0)
            {
                boolean isPrime = true;

                for (int primeNum : primeArray) {
                    if (i % primeNum == 0) {
                        isPrime = false;
                        break;
                    }
                    else if (primeNum > Math.sqrt(i))
                    {
                        break;
                    }
                }
                if (isPrime)
                {
                    primeArray.add(i);
                }
            }
        }
        return primeArray.size();
    }
}