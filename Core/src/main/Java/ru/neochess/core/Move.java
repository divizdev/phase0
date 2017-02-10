package ru.neochess.core;

/**
 * Содержит клетки хода, фигуру хода, а так же дополнительные флаги
 * Created by diviz on 10.12.2016.
 */
public class Move {

    private final CellBoard from, to;
    private final Figure oldFigure;
    private final Figure figure;
    private final boolean isCheck;


    public Move(CellBoard from, CellBoard to, Figure figure, boolean isCheck) {
        this.from = from;
        this.to = to;
        this.figure = figure;
        this.isCheck = isCheck;
        oldFigure = from.getFigure();
    }

    public void make() {
        from.setFigure(null);
        to.setFigure(figure);
    }

    public void cancel() {
        from.setFigure(oldFigure);
        to.setFigure(null);
    }


    public CellBoard getFrom() {
        return from;
    }

    public CellBoard getTo() {
        return to;
    }

    public Figure getFigure() {
        return figure;
    }

    public boolean isCheck() {
        return isCheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Move move = (Move) o;

        if (isCheck() != move.isCheck()) return false;
        if (getFrom() != null ? !getFrom().equals(move.getFrom()) : move.getFrom() != null) return false;
        if (getTo() != null ? !getTo().equals(move.getTo()) : move.getTo() != null) return false;
        if (oldFigure != null ? !oldFigure.equals(move.oldFigure) : move.oldFigure != null) return false;
        return getFigure() != null ? getFigure().equals(move.getFigure()) : move.getFigure() == null;
    }

    @Override
    public int hashCode() {
        int result = getFrom() != null ? getFrom().hashCode() : 0;
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (oldFigure != null ? oldFigure.hashCode() : 0);
        result = 31 * result + (getFigure() != null ? getFigure().hashCode() : 0);
        result = 31 * result + (isCheck() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return from + "->" + to + ":" + figure;
    }
}
