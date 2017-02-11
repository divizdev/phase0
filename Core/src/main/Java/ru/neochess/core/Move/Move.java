package ru.neochess.core.Move;

import ru.neochess.core.CellBoard;
import ru.neochess.core.Figure;

/**
 * Содержит клетки хода, фигуру хода, а так же дополнительные флаги
 * Created by diviz on 10.12.2016.
 */
public class Move implements IMove {

    private final CellBoard from, to;
    private final Figure oldFigureFrom;
    private final Figure oldFigureTo;
    private final Figure figure;


    public Move(CellBoard from, CellBoard to, Figure figure) {
        this.from = from;
        this.to = to;
        this.figure = figure;
        oldFigureTo = to.getFigure();
        oldFigureFrom = from.getFigure();
    }

    @Override
    public void make() {
        from.setFigure(null);
        to.setFigure(figure);
    }

    @Override
    public void cancel() {
        to.setFigure(oldFigureTo);
        from.setFigure(oldFigureFrom);
    }


    @Override
    public CellBoard getFrom() {
        return from;
    }

    @Override
    public CellBoard getTo() {
        return to;
    }

    @Override
    public Figure getFigure() {
        return figure;
    }

    //TODO: Нарушаем принципы чистого кода. Вынести в отдельный интерфейс стратегию
    @Override
    public Boolean isCharacteristicsMove(CharacteristicsMove characteristicsMove){
        switch (characteristicsMove) {
            case CheckElephant:
                break;
            case CheckKing:
                break;
            default:
                return false;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Move move = (Move) o;
        if (getFrom() != null ? !getFrom().equals(move.getFrom()) : move.getFrom() != null) return false;
        if (getTo() != null ? !getTo().equals(move.getTo()) : move.getTo() != null) return false;
        if (oldFigureFrom != null ? !oldFigureFrom.equals(move.oldFigureFrom) : move.oldFigureFrom != null) return false;
        return getFigure() != null ? getFigure().equals(move.getFigure()) : move.getFigure() == null;
    }

    @Override
    public int hashCode() {
        int result = getFrom() != null ? getFrom().hashCode() : 0;
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (oldFigureFrom != null ? oldFigureFrom.hashCode() : 0);
        result = 31 * result + (getFigure() != null ? getFigure().hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return from + "->" + to + ":" + figure;
    }
}
