package ru.neochess.core;

/**
 * Клетка доски. Содержит ссылки на соседние клеткки и на фигуру.
 * Created by diviz on 10.12.2016.
 */
public class CellBoard {


    private Figure figure;
    private final Cell cell;
    private final CellBoard left,
            right,
            up,
            down,

            leftDown,
            rightDown,
            leftUp,
            rightUp;

    public CellBoard(int x, int y) {
        this(x, y, null, null, null, null, null, null, null, null, null);
    }

    public CellBoard(int x, int y, Figure figure) {
        this(x, y, figure, null, null, null, null, null, null, null, null);
    }

    public CellBoard(int x, int y, CellBoard left, CellBoard right, CellBoard up, CellBoard down, CellBoard leftDown, CellBoard rightDown, CellBoard leftUp, CellBoard rightUp) {
        this(x, y, null, left, right, up, down, leftDown, rightDown, leftUp, rightUp);

    }


    public CellBoard(int x, int y, Figure figure, CellBoard left, CellBoard right, CellBoard up, CellBoard down, CellBoard leftDown, CellBoard rightDown, CellBoard leftUp, CellBoard rightUp) {
        this.figure = figure;
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
        this.leftDown = leftDown;
        this.rightDown = rightDown;
        this.leftUp = leftUp;
        this.rightUp = rightUp;
        cell = new Cell(x, y);

    }

    public Cell getCell() {
        return cell;
    }

    @Override
    public String toString() {
        return cell.toString();
    }

    public IteratorCell getIterator(AdjacentCell adjacentCell) {
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
     * Устанавливаем в клетку фигуру,
     *
     * @param figure - фигура
     */
    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    /**
     * Getter for property 'left'.
     *
     * @return Value for property 'left'.
     */
    public CellBoard getLeft() {
        return left;
    }



    /**
     * Getter for property 'right'.
     *
     * @return Value for property 'right'.
     */
    public CellBoard getRight() {
        return right;
    }



    /**
     * Getter for property 'up'.
     *
     * @return Value for property 'up'.
     */
    public CellBoard getUp() {
        return up;
    }



    /**
     * Getter for property 'down'.
     *
     * @return Value for property 'down'.
     */
    public CellBoard getDown() {
        return down;
    }


    /**
     * Getter for property 'leftDown'.
     *
     * @return Value for property 'leftDown'.
     */
    public CellBoard getLeftDown() {
        return leftDown;
    }



    /**
     * Getter for property 'rightDown'.
     *
     * @return Value for property 'rightDown'.
     */
    public CellBoard getRightDown() {
        return rightDown;
    }

    /**
     * Getter for property 'leftUp'.
     *
     * @return Value for property 'leftUp'.
     */
    public CellBoard getLeftUp() {
        return leftUp;
    }



    /**
     * Getter for property 'rightUp'.
     *
     * @return Value for property 'rightUp'.
     */
    public CellBoard getRightUp() {
        return rightUp;
    }


}
