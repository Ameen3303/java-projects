package java_with_DSA;

import java.util.*;

public class N_queensExample {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        backtrack(0, board, result);
        return result;
    }
    private static void backtrack(int row, char[][] board, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            result.add(construct(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, result);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
    private static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (number of queens and board size): ");
        int n = sc.nextInt();
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("Total solutions: " + solutions.size());
        int count = 1;
        for (List<String> solution : solutions) {
            System.out.println("Solution " + count++ + ":");
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
        sc.close();
    }
}
