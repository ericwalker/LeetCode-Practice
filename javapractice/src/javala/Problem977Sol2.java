class Solution {
    public int[] sortedSquares(int[] A) {

        int[] resultArr = new int[A.length];

        int curFront = 0;
        int curBack = A.length - 1;

        int cur = A.length - 1;

        while (curFront <= curBack) {
            if (A[curBack] * A[curBack] >= A[curFront] * A[curFront]) {
                resultArr[cur] = A[curBack] * A[curBack];
                curBack--;
            } else {
                resultArr[cur] = A[curFront] * A[curFront];
                curFront++;
            }
            cur--;
        }

        return resultArr;
    }
}