package ru.neochess.core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.neochess.core.AdjacentCell;
import ru.neochess.core.CellBoard;
import ru.neochess.core.IteratorCell;

/** 
* IteratorCell Tester. 
* 
* @author diviz
* @since <pre>??? 10, 2016</pre> 
* @version 1.0 
*/ 
public class IteratorCellBoardTest {

    private CellBoard cellBoardLeft = new CellBoard(0 , 1);
    private CellBoard cellBoardLeftUp = new CellBoard(0, 0);
    private CellBoard cellBoardLeftDown = new CellBoard(0, 2);
    private CellBoard cellBoardRight = new CellBoard(2, 1);
    private CellBoard cellBoardRightUp = new CellBoard(2, 0);
    private CellBoard cellBoardRightDown = new CellBoard(2, 2);
    private CellBoard cellBoardUp = new CellBoard(1, 0);
    private CellBoard cellBoardDown = new CellBoard( 1, 2);

    private CellBoard core = new CellBoard(1 , 1, null, cellBoardLeft, cellBoardRight, cellBoardUp, cellBoardDown, cellBoardLeftDown, cellBoardRightDown, cellBoardLeftUp, cellBoardRightUp);


    @Before
public void before() throws Exception {
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getAdjacentCell() 
* 
*/ 
@Test
public void testGetAdjacentCell() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: hasNext() 
* 
*/ 
@Test
public void testHasNext() throws Exception {

    IteratorCell iteratorCell;


    iteratorCell = core.getIterator(AdjacentCell.Left);
    Assert.assertTrue("Должен быть левый сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один левый сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.Up);
    Assert.assertTrue("Должен быть верхний сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один верхний сосед", iteratorCell.hasNext());


    iteratorCell = core.getIterator(AdjacentCell.Right);
    Assert.assertTrue("Должен быть правый сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один правый сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.Down);
    Assert.assertTrue("Должен быть нижний сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один нижний сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.LeftUp);
    Assert.assertTrue("Должен быть сосед слева сверху", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один слева сверху сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.RightUp);
    Assert.assertTrue("Должен быть верхний сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один верхний сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.RightDown);
    Assert.assertTrue("Должен быть нижний правый сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один нижний правый сосед", iteratorCell.hasNext());

    iteratorCell = core.getIterator(AdjacentCell.LeftDown);
    Assert.assertTrue("Должен быть левый нижний сосед", iteratorCell.hasNext());
    iteratorCell.next();
    Assert.assertFalse("Должен быть один левый нижний сосед", iteratorCell.hasNext());


}


/** 
* 
* Method: onlyNext() 
* 
*/ 
@Test
public void testOnlyNext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: next() 
* 
*/ 
@Test
public void testNext() throws Exception {
    IteratorCell iteratorCell;
    CellBoard cellBoard;


    iteratorCell = core.getIterator(AdjacentCell.Left);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Левый сосед", cellBoard.toString().equals("a9"));

    iteratorCell = core.getIterator(AdjacentCell.Up);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Верхний сосед", cellBoard.toString().equals("b10"));

    iteratorCell = core.getIterator(AdjacentCell.Right);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Правый сосед", cellBoard.toString().equals("c9"));

    iteratorCell = core.getIterator(AdjacentCell.Down);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Нижний сосед", cellBoard.toString().equals("b8"));

    iteratorCell = core.getIterator(AdjacentCell.LeftUp);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Верхний левый", cellBoard.toString().equals("a10"));

    iteratorCell = core.getIterator(AdjacentCell.RightUp);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Правый верхний", cellBoard.toString().equals("c10"));

    iteratorCell = core.getIterator(AdjacentCell.RightDown);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Павый нижний", cellBoard.toString().equals("c8"));

    iteratorCell = core.getIterator(AdjacentCell.LeftDown);
    cellBoard = iteratorCell.next();
    Assert.assertTrue("Левый нижний",cellBoard.toString().equals("a8"));

}

/** 
* 
* Method: remove() 
* 
*/ 
@Test
public void testRemove() throws Exception { 
//TODO: Test goes here... 
} 


} 
