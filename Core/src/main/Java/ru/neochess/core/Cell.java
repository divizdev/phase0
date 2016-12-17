package ru.neochess.core;

/**
 * Created by znobischevdv on 10.12.2016.
 */
public class Cell {
    protected Figure figure;
    protected Cell Left,
            Right,
            Up,
            Down,
            LeftDown,
            RightDown,
            LeftUp,
            RightUp;

    public Cell()
    {

    }

    public Cell(Figure figure, Cell left, Cell right, Cell up, Cell down, Cell leftDown, Cell rightDown, Cell leftUp, Cell rightUp) {
        this.figure = figure;
        Left = left;
        Right = right;
        Up = up;
        Down = down;
        LeftDown = leftDown;
        RightDown = rightDown;
        LeftUp = leftUp;
        RightUp = rightUp;
    }

    public IteratorCell getIterator(AdjacentCell adjacentCell)
    {
        return new IteratorCell(this, adjacentCell);
    }

    /**
     * Getter for property 'figure'.
     *
     * @return Value for property 'figure'.
     */
    public Figure getFigure() {
        return figure;
    }

    /**
     * Getter for property 'left'.
     *
     * @return Value for property 'left'.
     */
    public Cell getLeft() {
        return Left;
    }

    /**
     * Getter for property 'right'.
     *
     * @return Value for property 'right'.
     */
    public Cell getRight() {
        return Right;
    }

    /**
     * Getter for property 'up'.
     *
     * @return Value for property 'up'.
     */
    public Cell getUp() {
        return Up;
    }

    /**
     * Getter for property 'down'.
     *
     * @return Value for property 'down'.
     */
    public Cell getDown() {
        return Down;
    }

    /**
     * Getter for property 'leftDown'.
     *
     * @return Value for property 'leftDown'.
     */
    public Cell getLeftDown() {
        return LeftDown;
    }

    /**
     * Getter for property 'rightDown'.
     *
     * @return Value for property 'rightDown'.
     */
    public Cell getRightDown() {
        return RightDown;
    }

    /**
     * Getter for property 'leftUp'.
     *
     * @return Value for property 'leftUp'.
     */
    public Cell getLeftUp() {
        return LeftUp;
    }

    /**
     * Getter for property 'rightUp'.
     *
     * @return Value for property 'rightUp'.
     */
    public Cell getRightUp() {
        return RightUp;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void setLeft(Cell left) {
        Left = left;
    }

    public void setRight(Cell right) {
        Right = right;
    }

    public void setUp(Cell up) {
        Up = up;
    }

    public void setDown(Cell down) {
        Down = down;
    }

    public void setLeftDown(Cell leftDown) {
        LeftDown = leftDown;
    }

    public void setRightDown(Cell rightDown) {
        RightDown = rightDown;
    }

    public void setLeftUp(Cell leftUp) {
        LeftUp = leftUp;
    }

    public void setRightUp(Cell rightUp) {
        RightUp = rightUp;
    }
}
