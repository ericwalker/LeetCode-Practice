package javala;

class Problem36 {
    public boolean isValidSudoku(char[][] board) {

        boolean isValid = true;

        for (int i = 0; i <= 6; i += 3)
        {
            for (int j = 0; j <= 6; j += 3)
            {
                int[] isExist= new int[10];

                for (int x = 0; x <= 2; x++)
                    for (int y = 0; y <= 2; y++)
                        if (board[i+x][j+y] != '.')
                            isExist[Character.getNumericValue(board[i+x][j+y])]++;

                for (int k = 1; k <= 9; k++)
                    if (isExist[k] >= 2)
                        return false;
            }
        }

        for (int row = 0; row <= 8; row++)
        {
            int[] isExist= new int[10];
            for (int order = 0; order <= 8; order++)
                if (board[row][order] != '.')
                    isExist[Character.getNumericValue(board[row][order])]++;

            for (int k = 1; k <= 9; k++)
                if (isExist[k] >= 2)
                    return false;
        }

        for (int col = 0; col <= 8; col++)
        {
            int[] isExist= new int[10];
            for (int order = 0; order <= 8; order++)
                if (board[order][col] != '.')
                    isExist[Character.getNumericValue(board[order][col])]++;

            for (int k = 1; k <= 9; k++)
                if (isExist[k] >= 2)
                    return false;
        }
        return isValid;
    }
}