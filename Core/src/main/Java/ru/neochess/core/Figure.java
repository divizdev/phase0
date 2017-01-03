package ru.neochess.core;

import ru.neochess.core.GeneratorsMove.IGeneratorMove;

import java.util.List;

/**
 * Created by znobischevdv on 10.12.2016.
 */
public class Figure {
    protected ru.neochess.core.GeneratorsMove.IGeneratorMove IGeneratorMove;
    protected CellBoard cellBoard;


    public Figure(IGeneratorMove IGeneratorMove, CellBoard cellBoard) {
        this.IGeneratorMove = IGeneratorMove;
        this.cellBoard = cellBoard;
    }

    public List<List<Move>> getMove()
    {
        return IGeneratorMove.getMove();
    }

    /**
     * Getter for property 'IGeneratorMove'.
     *
     * @return Value for property 'IGeneratorMove'.
     */
    public IGeneratorMove getIGeneratorMove() {
        return IGeneratorMove;
    }

    /**
     * Setter for property 'IGeneratorMove'.
     *
     * @param IGeneratorMove Value to set for property 'IGeneratorMove'.
     */
    public void setIGeneratorMove(IGeneratorMove IGeneratorMove) {
        this.IGeneratorMove = IGeneratorMove;
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
