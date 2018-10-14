
public class NQueens {
	static final int N = 8;
	static boolean[][] board = new boolean[N][N];

	public static void main(String[] args) {
		backtrack(0);
		printBoard();
	}

	static boolean backtrack(int row) {
		if (row == N) {
			return true;
		}
		for (int col = 0; col < N; col ++) {
			if (isOk(row, col)) {
				board[row][col] = true;
				if (backtrack(row + 1))
					return true;
				board[row][col] = false;
			}
		}
		return false;
	}

	static boolean isOk(int row, int col) {
		for (int r = 0; r < row; r++) 
			if (board[r][col])
				return false;
		int rr = row, cc = col;
		while (row >= 0 && col >= 0) {
			if (board[row][col]) {
				row--; col--;
				return false;
			}
			row--; col--;
		}
		while (cc < N && rr >= 0) {
			if (board[rr][cc]) {
				rr--; cc++;
				return false;
			}
			rr--; cc++;
		}
		return true;
	}

	static void printBoard() {
		for (boolean[] row: board) {
			for (boolean col: row)
				System.out.print(col ? " Q " : " _ ");
			System.out.println();
		}
		System.out.println();
	}

}
