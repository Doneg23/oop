// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int row = grid.length;
		int col = grid[0].length;

		int minRow = Integer.MAX_VALUE, minCol = Integer.MAX_VALUE;
		int maxRow = -1, maxCol = -1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == ch) {
					minRow = Math.min(minRow, i);
					maxRow = Math.max(maxRow, i);
					minCol = Math.min(minCol, j);
					maxCol = Math.max(maxCol, j);
				}
			}
		}
		if (maxRow == -1) {
			return 0;
		}
		int result = (maxRow - minRow + 1) * (maxCol - minCol + 1);
		return result;
		// YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */

	private int getLength(int x, int y, int x_, int y_, char key) {
		int length = 0;
		int row = grid.length;
		int col = grid[0].length;

		int i = x + x_;
		int j = y + y_;
		while (i >= 0 && i < row && j >= 0 && j < col && grid[i][j] == key) {
			length++;
			i += x_;
			j += y_;
		}
		return length;
	}

	public int countPlus() {
		return 0; // YOUR CODE HERE
	}
	int row = grid.length;
	int col = grid[0].length;
	int count = 0;

	for (int i = 1; i < row - 1; i++) {
		for (int j = 1; j < col - 1; j++) {
			char midChar = grid[i][j];

			int up = getLength(i, j, -1, 0, midChar)
			int down = getLength(i, j, 1, 0, midChar);
			int left = getLength(i, j, 0, -1, midChar);
			int right = getLength(i, j, 0, 1, midChar);

			int Length_ = Math.min(Math.min(up, down), Math.min(left, right));
			if (Length_ >= 2) {
				count++;
			}
		}
	}
	return count;
}
