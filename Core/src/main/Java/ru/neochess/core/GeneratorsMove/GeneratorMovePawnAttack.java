package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.AdjacentCell;
import ru.neochess.core.CellBoard;
import ru.neochess.core.Move;
import ru.neochess.core.TypeGamer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Генерация аттаки пешки
 * Created by diviz on 05.01.2017.
 */
public class GeneratorMovePawnAttack implements IGeneratorMove {

    @Override
    public List<Move> getMove(CellBoard currentCell, TypeGamer typeGamer) {
        List<Move> result = new ArrayList<>();
        CellBoard next;
        Move move;

        Iterator<CellBoard> leftUp = currentCell.getIterator(AdjacentCell.LeftUp);
        Iterator<CellBoard> rightUp = currentCell.getIterator(AdjacentCell.RightUp);

        if (leftUp.hasNext()) {
            next = leftUp.next();
            move = createMove(currentCell, next);
            if (move != null) {
                result.add(move);
            }
        }

        if (rightUp.hasNext()) {
            next = leftUp.next();
            move = createMove(currentCell, next);
            if (move != null) {
                result.add(move);
            }
        }
        return result;

    }

    protected Move createMove(CellBoard currentCell, CellBoard next) {

        if (next.getFigure() != null) {
            return (new Move(currentCell, next, currentCell.getFigure(), false));
        }

        return null;
    }
}
