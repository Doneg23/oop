//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}


	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int ox = grid.length;
		int oy = grid[0].length;

		int check = 0;

		for (int j = 0; j < oy; j++) {
			boolean fullRow = true;

			for (int i = 0; i < ox; i++) {
				if (!grid[i][j]) {
					fullRow = false;
					break;
				}
			}
			if (!fullRow) {
				for (int i = 0; i < ox; i++) {
					grid[i][check] = grid[i][j];
				}
				check++;
			}
		}
		while (check < oy) {
			for (int i = 0; i < ox; i++) {
				grid[i][check] = false;
			}
			check++;
		}
	}

	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	public boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
