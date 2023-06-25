package gameOfLife;

public class Cell {

    int alive = 0 ;

    int vecini = 0;
    int x = 0 ;
    int y = 0 ;

    public Cell(int alive, int x, int y) {
        this.alive = alive;
        this.x = x;
        this.y = y;
    }
}
