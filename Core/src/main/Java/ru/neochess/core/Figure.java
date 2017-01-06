package ru.neochess.core;

import ru.neochess.core.GeneratorsMove.IGeneratorMove;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by znobischevdv on 10.12.2016.
 */
public class Figure {
    protected ArrayList<IGeneratorMove> listGeneratorMove;
    protected CellBoard cellBoard;


    public Figure(IGeneratorMove generatorMove, CellBoard cellBoard) {
        this.listGeneratorMove.add(generatorMove);
        this.cellBoard = cellBoard;
    }

    public ArrayList<Move> getMove()
    {
        ArrayList<Move> list = new ArrayList<>();
        for (IGeneratorMove generatorMove : listGeneratorMove) {
            list.addAll(generatorMove.getMove(getCellBoard()));
        }
        return list;
    }

    /**
     * Getter for property 'listGeneratorMove'.
     *
     * @return Value for property 'listGeneratorMove'.
     */
    public ArrayList<IGeneratorMove> getListGeneratorMove() {
        return listGeneratorMove;
    }

    /**
     * Setter for property 'listGeneratorMove'.
     *
     * @param listGeneratorMove Value to set for property 'listGeneratorMove'.
     */
    public void setListGeneratorMove(ArrayList<IGeneratorMove> listGeneratorMove) {
        this.listGeneratorMove = listGeneratorMove;
    }

    /**
     * Getter for property 'cellBoard'.
     *
     * @return Value for property 'cellBoard'.
     */
    public CellBoard getCellBoard() {
        return cellBoard;
    }

    /**
     * Setter for property 'cellBoard'.
     *
     * @param cellBoard Value to set for property 'cellBoard'.
     */
    public void setCellBoard(CellBoard cellBoard) {
        this.cellBoard = cellBoard;
    }
}
