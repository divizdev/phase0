package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.AdjacentCell;
import ru.neochess.core.CellBoard;
import ru.neochess.core.IteratorCell;
import ru.neochess.core.Move;

import java.util.ArrayList;

/**
 * Генерация аттаки пешки
 * Created by diviz on 05.01.2017.
 */
public class GeneratorMovePawnAttack implements IGeneratorMove {

    @Override
    public ArrayList<Move> getMove(CellBoard currentCell) {
        ArrayList<Move> result = new ArrayList<>();
        CellBoard next;
        Move move;

        IteratorCell leftUp = currentCell.getIterator(AdjacentCell.LeftUp);
        IteratorCell rightUp = currentCell.getIterator(AdjacentCell.RightUp);

        if (leftUp.hasNext())
        {
            next = leftUp.next();
            move = createMove(currentCell, next);
            if (move != null) {
                result.add(move);
            }
        }

        if(rightUp.hasNext())
        {
            next = leftUp.next();
            move = createMove(currentCell, next);
            if (move != null) {
                result.add(move);
            }
        }
        return result;

    }

    protected Move createMove(CellBoard currentCell, CellBoard next) {

        if (next.getFigure() != null)
        {
            return(new Move(currentCell.getCell(), next.getCell(), currentCell.getFigure(), false));
        }

        return null;
    }
}
