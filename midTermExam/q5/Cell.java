package q5;

public class Cell {
    int x, y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
}
