package ru.neochess.core;

/**
 * Содержит клетки хода, фигуру хода, а так же дополнительные флаги
 * Created by diviz on 10.12.2016.
 */
public class Move {

    protected Cell from, to;
    protected Figure figure;
    protected boolean isCheck;


    public Move(Cell from, Cell to, Figure figure, boolean isCheck) {
        this.from = from;
        this.to = to;
        this.figure = figure;
        this.isCheck = isCheck;
    }

    public Cell getFrom() {
        return from;
    }

    public Cell getTo() {
        return to;
    }

    public Figure getFigure() {
        return figure;
    }

    public boolean isCheck() {
        return isCheck;
    }
}
