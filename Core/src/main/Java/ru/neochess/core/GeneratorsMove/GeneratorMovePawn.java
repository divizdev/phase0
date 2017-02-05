package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.AdjacentCell;
import ru.neochess.core.CellBoard;
import ru.neochess.core.Move;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ход пешки вперед
 * Created by znobischevdv on 10.12.2016.
 */
public class GeneratorMovePawn implements IGeneratorMove {


    public ArrayList<Move> getMove(CellBoard currentCell) {
        ArrayList<Move> result = new ArrayList<>();

        Iterator<CellBoard> iterator = currentCell.getIterator(AdjacentCell.Up);

        if (iterator.hasNext()) {
            CellBoard next = iterator.next();
            if (next.getFigure() == null) {
                result.add(new Move(currentCell.getCell(), next.getCell(),
                        currentCell.getFigure(), false));
            }
        }
        return result;
    }
}
