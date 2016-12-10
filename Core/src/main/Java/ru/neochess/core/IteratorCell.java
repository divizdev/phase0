package ru.neochess.core;

import java.util.Iterator;

/**
 * Created by znobischevdv on 10.12.2016.
 */
public class IteratorCell implements Iterator<Cell> {

    protected Cell currentCell;
    protected AdjacentCell adjacentCell;

    public IteratorCell(Cell currentCell, AdjacentCell adjacentCell) {
        this.currentCell = currentCell;
        this.adjacentCell = adjacentCell;
    }

    /**
     * Getter for property 'AdjacentCell'.
     *
     * @return Value for property 'AdjacentCell'.
     */
    public AdjacentCell getAdjacentCell() {
        return adjacentCell;
    }

    public boolean hasNext() {
        return onlyNext() != null;
    }

    protected Cell onlyNext() {
        switch (adjacentCell) {
            case Left:
                return currentCell.getLeft();
            case Right:
                return currentCell.getRight();
            case Up:
                return currentCell.getUp();
            case Down:
                return currentCell.getDown();
            case LeftDown:
                return currentCell.getLeftDown();
            case RightDown:
                return currentCell.getRightDown();
            case LeftUp:
                return currentCell.getLeftUp();
            case RightUp:
                return currentCell.getRightUp();
        }

        return null;
    }

    public Cell next() {
        Cell returnCell = currentCell;
        currentCell = onlyNext();
        if (currentCell == null){
            currentCell = returnCell;
        }
        return returnCell;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
