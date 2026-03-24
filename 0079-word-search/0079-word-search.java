class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (dfs(board, word, i, j, 0)) return true;
        return false;
    }

    private boolean dfs(char[][] b, String w, int i, int j, int index) {
        if (index == w.length()) return true;
        if (i < 0 || j < 0 || i >= b.length || j >= b[i].length || b[i][j] != w.charAt(index)) return false;

        char temp = b[i][j];
        b[i][j] = '#'; 

        boolean found = dfs(b, w, i + 1, j, index + 1)
                     || dfs(b, w, i - 1, j, index + 1)
                     || dfs(b, w, i, j + 1, index + 1)
                     || dfs(b, w, i, j - 1, index + 1);

        b[i][j] = temp; 
        return found;
    }
}
