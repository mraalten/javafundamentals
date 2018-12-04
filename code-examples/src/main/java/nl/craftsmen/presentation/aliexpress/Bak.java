package nl.craftsmen.presentation.aliexpress;

public class Bak {
    private Position startPosition;
    private Position targetPosition;
    private Position currentPosition;
    private int nbrOfItems;

    public Bak(int targetPositionX, int targetPositionY) {
        if (targetPositionX == 0 && targetPositionY == 0) {
            throw new IllegalStateException("TargetPosition may not be equal to start position");
        }
        this.startPosition = new Position(0, 0);
        this.targetPosition = new Position(targetPositionX, targetPositionY);
        this.currentPosition = new Position(0, 0);
    }


    public boolean destinationReached() {
        return (currentPosition.equals(targetPosition));
    }
}
