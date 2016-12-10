package ru.neochess.core.GeneratorsMove;

import ru.neochess.core.Cell;
import ru.neochess.core.Move;

import java.util.List;

/**
 * Стратегия для генерации ходов
 * Created by znobischevdv on 10.12.2016.
 */
public interface IGeneratorMove {
     List<List<Move>> getMove(Cell cell);
}
