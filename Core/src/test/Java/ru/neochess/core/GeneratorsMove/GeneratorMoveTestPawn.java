package ru.neochess.core.GeneratorsMove;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.neochess.core.CellBoard;

import static org.junit.Assert.*;

/**
 * Тест хода пешки
 * Created by diviz on 05.01.2017.
 */
public class GeneratorMoveTestPawn {

//    @Before

    private CellBoard getCellEndLine(){
        return new CellBoard(2, 0);
    }

    @Test
    public void getMovePawnCellEndLine() throws Exception {
        CellBoard currCell = getCellEndLine();
        IGeneratorMove generation = new GeneratorMovePawn();

        assertTrue("В стену ходить нельзя", generation.getMove(currCell).isEmpty());
    }


    @Test
    public void getMovePawnAttackCellEndLine() throws Exception {
        CellBoard currCell = getCellEndLine();
        IGeneratorMove generation = new GeneratorMovePawn();

        assertTrue("В стену бить нельзя", generation.getMove(currCell).isEmpty());
    }

}