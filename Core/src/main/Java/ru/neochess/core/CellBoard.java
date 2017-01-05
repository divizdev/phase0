package ru.neochess.core;

/**
 * Created by diviz on 10.12.2016.
 */
public class CellBoard {


    protected Figure figure;
    protected Cell cell;
    //
//    public void setName(String name) {
//        this.name = name;
//    }
    protected CellBoard left,
            right,
            up,
            down,
            leftDown,
            rightDown,
            leftUp,
            rightUp;
    CellBoard(int x, int y) {
        cell = new Cell(x, y);
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
     * У фигуры так же меняется ссылка на клетку
     * @param figure - фигура
     */
    public void setFigure(Figure figure) {
        this.figure = figure;
        this.figure.setCellBoard(this);
    }

    /**
     * Getter for property 'left'.
     *
     * @return Value for property 'left'.
     */
    public CellBoard getLeft() {
        return left;
    }

    public void setLeft(CellBoard left) {
        this.left = left;
    }

    /**
     * Getter for property 'right'.
     *
     * @return Value for property 'right'.
     */
    public CellBoard getRight() {
        return right;
    }

    public void setRight(CellBoard right) {
        this.right = right;
    }

    /**
     * Getter for property 'up'.
     *
     * @return Value for property 'up'.
     */
    public CellBoard getUp() {
        return up;
    }

    public void setUp(CellBoard up) {
        this.up = up;
    }

    /**
     * Getter for property 'down'.
     *
     * @return Value for property 'down'.
     */
    public CellBoard getDown() {
        return down;
    }

    public void setDown(CellBoard down) {
        this.down = down;
    }

    /**
     * Getter for property 'leftDown'.
     *
     * @return Value for property 'leftDown'.
     */
    public CellBoard getLeftDown() {
        return leftDown;
    }

    public void setLeftDown(CellBoard leftDown) {
        this.leftDown = leftDown;
    }

    /**
     * Getter for property 'rightDown'.
     *
     * @return Value for property 'rightDown'.
     */
    public CellBoard getRightDown() {
        return rightDown;
    }

    public void setRightDown(CellBoard rightDown) {
        this.rightDown = rightDown;
    }

    /**
     * Getter for property 'leftUp'.
     *
     * @return Value for property 'leftUp'.
     */
    public CellBoard getLeftUp() {
        return leftUp;
    }

    public void setLeftUp(CellBoard leftUp) {
        this.leftUp = leftUp;
    }

    /**
     * Getter for property 'rightUp'.
     *
     * @return Value for property 'rightUp'.
     */
    public CellBoard getRightUp() {
        return rightUp;
    }

    public void setRightUp(CellBoard rightUp) {
        this.rightUp = rightUp;
    }
}
