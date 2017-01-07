package ru.neochess.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diviz on 05.01.2017.
 */
public class CellBoardTest {
    @Test
    public void setFigure() throws Exception {

        Figure figure = new Figure(null, null, TypeGamer.White);
        CellBoard cellA = new CellBoard(0, 0);
        CellBoard cellB = new CellBoard(1,1);

        cellA.setFigure(figure);

        assertEquals("В клетке А", cellA, figure.getCellBoard());

        cellB.setFigure(figure);

        assertEquals("В клетке B", cellB, figure.getCellBoard());

    }

}