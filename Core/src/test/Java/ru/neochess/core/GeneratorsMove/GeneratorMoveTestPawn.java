package ru.neochess.core.GeneratorsMove;

import org.junit.Test;
import ru.neochess.core.CellBoard;
import ru.neochess.core.Figure;
import ru.neochess.core.Move;
import ru.neochess.core.TypeGamer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Тест хода пешки
 * Created by diviz on 05.01.2017.
 */
public class GeneratorMoveTestPawn {

//    @Before

    private CellBoard getCellEndLine() {
        return new CellBoard(2, 0);
    }


    private CellBoard getDisposition(Figure leftUpFigure, Figure upFigure,
                                     Figure rightUpFigure, Figure centerFigure) {
        CellBoard leftUp, up, rightUp, center;
        leftUp = new CellBoard(0, 0, leftUpFigure);
        up = new CellBoard(0, 1, upFigure);
        rightUp = new CellBoard(0, 2, rightUpFigure);
        center = new CellBoard(1, 1, centerFigure);
        center.setLeftUp(leftUp);
        center.setUp(up);
        center.setRightUp(rightUp);

        return center;
    }

    @Test
    public void testGetMovePawnCellEndLine() throws Exception {
        CellBoard currCell = getCellEndLine();
        IGeneratorMove generation = new GeneratorMovePawn();

        assertTrue("В стену ходить нельзя", generation.getMove(currCell).isEmpty());
    }


    @Test
    public void testGetMovePawnAttackCellEndLine() throws Exception {
        CellBoard currCell = getCellEndLine();
        IGeneratorMove generation = new GeneratorMovePawn();

        assertTrue("В стену бить нельзя", generation.getMove(currCell).isEmpty());
    }

    @Test
    public void testGetMovePawnCellLineOpponent() throws Exception {
        CellBoard currCell = getDisposition(new Figure(TypeGamer.White), new Figure(TypeGamer.White),
                new Figure(TypeGamer.White), new Figure(TypeGamer.Black));

        IGeneratorMove generationMove = new GeneratorMovePawn();

        List<Move> moves = generationMove.getMove(currCell);

        assertNotNull("Список ходов не должен быть пустым", moves);

    }
}

