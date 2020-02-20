class Solution {
    public int[] sortedSquares(int[] A) {

        int[] resultArr = new int[A.length];

        for (int i = 0; i < A.length; i++)
            resultArr[i] = (int) Math.pow (A[i], 2.0);

        Arrays.sort(resultArr);

        return resultArr;
    }
}