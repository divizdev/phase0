package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.CellBoard;
import ru.neochess.core.Move;

import java.util.ArrayList;
import java.util.List;

/**
 * Стратегия для генерации ходов
 * Created by znobischevdv on 10.12.2016.
 */
public interface IGeneratorMove {
     ArrayList<ArrayList<Move>> getMove(CellBoard currentCell);
}
