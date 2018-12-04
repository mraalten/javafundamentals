package nl.craftsmen.presentation.aliexpress;

public class Position {
    public final int x;
    public final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Position otherPosition) {
        return this.x == otherPosition.x && this.y == otherPosition.y;
    }
}
