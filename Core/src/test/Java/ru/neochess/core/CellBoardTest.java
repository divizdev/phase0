package ru.neochess.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diviz on 05.01.2017.
 */
public class CellBoardTest {
    @Test
    public void setFigure() throws Exception {

        Figure figure = new Figure(null,  TypeGamer.White);
        CellBoard cellA = new CellBoard(0, 0);

        cellA.setFigure(figure);

        assertEquals(figure, cellA.getFigure());


    }

}