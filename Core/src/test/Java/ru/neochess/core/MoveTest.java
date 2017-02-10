package ru.neochess.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diviz on 10.02.2017.
 */
public class MoveTest {

    CellBoard from = new CellBoard(0,0);
    CellBoard to = new CellBoard(1,1);
    Figure figure = new Figure(TypeGamer.Black);
    Move move;

    @Before
    public void setUp() throws Exception {
        from.setFigure(figure);
        move = new Move(from, to, figure, true);
    }

    @Test
    public void make() throws Exception {
        move.make();
        assertNull("После хода старое поле должно очиститься", from.getFigure());
        assertEquals("Фигура должна переместится в поле", figure, to.getFigure());
    }

    @Test
    public void cancel() throws Exception {
        move.make();
        move.cancel();
        assertNull("После хода старое поле должно очистится", to.getFigure());
        assertEquals("Фигура должна переместится в поле", figure, from.getFigure());
    }

}