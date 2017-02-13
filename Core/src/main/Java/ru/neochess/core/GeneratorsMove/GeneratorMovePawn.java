package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.AdjacentCell;
import ru.neochess.core.CellBoard;
import ru.neochess.core.Move.Move;
import ru.neochess.core.TypeGamer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Ход пешки вперед
 * Created by diviz on 10.12.2016.
 */
public class GeneratorMovePawn implements IGeneratorMove {


    @Override
    public List<Move> getMove(CellBoard currentCell, TypeGamer typeGamer) {
        List<Move> result = new ArrayList<>();

        Iterator<CellBoard> iterator = currentCell.getIterator(AdjacentCell.Up);

        if (iterator.hasNext()) {
            CellBoard next = iterator.next();
            if (next.getFigure() == null) {
                result.add(new Move(currentCell, next,
                        currentCell.getFigure()));
            }
        }
        return result;
    }


}
