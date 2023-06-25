package gameOfLife;


// A simple Java program to implement Game of Life
public class GameOfLife {
    public static void main(String[] args) {
        int M = 3, N = 3;

        // Initializing the grid.
        int[][] grid = {{0, 1, 0},
                {0, 1, 0},
                {0, 1, 0},

        };

        // Displaying the grid
        System.out.println("Original Generation");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration(grid, M, N);
    }

    // Function to print next generation
    static int[][] nextGeneration(int grid[][], int M, int N) {
        int[][] future = new int[M][N];

        // Loop through every cell
        for (int l = 0; l < M; l++) {
            for (int m = 0; m < N; m++) {
                // finding no Of Neighbours that are alive
                int aliveNeighbours = getAliveNeighbours(grid, M, N, l, m);

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= grid[l][m];

                // Implementing the Rules of Life

                extracted(grid, future, l, m, aliveNeighbours);
            }
        }

        System.out.println("Next Generation");
        extracted(M, N, future);
        return future;

    }

    private static void extracted(int M, int N, int[][] future) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (future[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void extracted(int[][] grid, int[][] future, int l, int m, int aliveNeighbours) {
        // Cell is lonely and dies
        if ((grid[l][m] == 1) && (aliveNeighbours < 2))
            future[l][m] = 0;

            // Cell dies due to over population
        else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
            future[l][m] = 0;

            // A new cell is born
        else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
            future[l][m] = 1;

            // Remains the same
        else
            future[l][m] = grid[l][m];
    }

    private static int getAliveNeighbours(int[][] grid, int M, int N, int l, int m) {
        int aliveNeighbours = 0;
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++)
                if ((l + i >= 0 && l + i < M) && (m + j >= 0 && m + j < N))
                    aliveNeighbours += grid[l + i][m + j];
        return aliveNeighbours;
    }
}

