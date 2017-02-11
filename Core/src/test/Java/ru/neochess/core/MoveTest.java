package ru.neochess.core;

import org.junit.Before;
import org.junit.Test;
import ru.neochess.core.Move.IMove;
import ru.neochess.core.Move.Move;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Тестируем класс Move
 * Created by diviz on 10.02.2017.
 */
public class MoveTest {

    private CellBoard from = new CellBoard(0, 0);
    private CellBoard to = new CellBoard(1, 1);
    private Figure figure = new Figure(TypeGamer.Black);
    private IMove move;

    @Before
    public void setUp() throws Exception {
        from.setFigure(figure);
        move = new Move(from, to, figure);
    }

    @Test
    public void make() throws Exception {
        move.make();
        assertNull("После хода старое поле должно очиститься", from.getFigure());
        assertEquals("Фигура должна переместится в поле", figure, move.getTo().getFigure());
    }

    @Test
    public void makeFromAndToEquals() throws Exception {
        Figure oldFigure = new Figure(null, TypeGamer.White);
        from.setFigure(oldFigure);
        move = new Move(from, from, figure);
        move.make();
        assertNotNull("Ход из = в", move.getFrom());
        assertEquals("Фигура должна переместится в поле", figure, move.getTo().getFigure());
    }

    @Test
    public void cancelFromAndToEquals() throws Exception {
        Figure oldFigure = new Figure(null, TypeGamer.White);
        from.setFigure(oldFigure);
        move = new Move(from, from, figure);
        move.make();
        move.cancel();
        assertNotNull("Ход из = в", move.getFrom());
        assertEquals("Фигура должна переместится в поле", oldFigure, move.getFrom().getFigure());
    }

    @Test
    public void makeDouble() throws Exception {
        move.make();
        move.make();
        assertNull("После хода старое поле должно очиститься", from.getFigure());
        assertEquals("Фигура должна переместится в поле", figure, move.getTo().getFigure());
    }

    @Test
    public void cancel() throws Exception {
        Figure oldFigure = new Figure(null, TypeGamer.White);
        to.setFigure(oldFigure);
        move = new Move(from, to, figure);
        move.make();
        move.cancel();
        assertEquals("На новом поле должна остаться старая фигура", oldFigure, move.getTo().getFigure());
        assertEquals("Фигура должна остаться в поле", figure, move.getFrom().getFigure());
    }

    @Test
    public void cancelVoid() throws Exception {
        move.cancel();
        assertNull("После отмены хода, новое поле должно очистится", to.getFigure());
        assertEquals("Фигура должна остаться в поле", figure, move.getFrom().getFigure());
    }

}