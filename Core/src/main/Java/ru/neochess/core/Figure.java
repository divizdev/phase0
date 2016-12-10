package ru.neochess.core;

import ru.neochess.core.GeneratorsMove.IGeneratorMove;

import java.util.List;

/**
 * Created by znobischevdv on 10.12.2016.
 */
public class Figure {
    protected ru.neochess.core.GeneratorsMove.IGeneratorMove IGeneratorMove;
    protected Cell cell;


    public Figure(IGeneratorMove IGeneratorMove, Cell cell) {
        this.IGeneratorMove = IGeneratorMove;
        this.cell = cell;
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
     * Getter for property 'cell'.
     *
     * @return Value for property 'cell'.
     */
    public Cell getCell() {
        return cell;
    }

    /**
     * Setter for property 'cell'.
     *
     * @param cell Value to set for property 'cell'.
     */
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
