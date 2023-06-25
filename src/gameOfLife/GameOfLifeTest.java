package gameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeTest {


    int M = 3;
    int N = 3;
    int[][] grid = {{0, 1, 0},
            {0, 1, 0},
            {0, 1, 0,}};


    @Test
    void nextGeneration() {


       int[][] future =  GameOfLife.nextGeneration(grid, M, N);



        // Verify that the next generation is correct
        int[][] expectedFuture = {{0, 0, 0},
                                    {1, 1, 1},
                                    {0, 0, 0}};
        assertArrayEquals(expectedFuture, future);

    }

//    @Test
//    void extracted() {
//    }
//
//    @Test
//    void testExtracted() {
//    }
//
//    @Test
//    void getAliveNeighbours() {
//    }
}