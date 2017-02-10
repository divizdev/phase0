package ru.neochess.core;

import ru.neochess.core.GeneratorsMove.IGeneratorMove;

import java.util.ArrayList;
import java.util.List;

/**
 * Фигура на игровом поле
 * Created by diviz on 10.12.2016.
 */
public class Figure {
    private List<IGeneratorMove> listGeneratorMove = new ArrayList<>();
    private TypeGamer typeGamer;


    public Figure(ArrayList<IGeneratorMove> generatorMove, TypeGamer typeGamer) {
        this.listGeneratorMove = generatorMove;
        this.typeGamer = typeGamer;

    }

    public Figure(TypeGamer typeGamer) {
        this(null, typeGamer);
    }

    public TypeGamer getTypeGamer() {
        return typeGamer;
    }

    public void setTypeGamer(TypeGamer typeGamer) {
        this.typeGamer = typeGamer;
    }

    public ArrayList<Move> getMove(CellBoard cellBoard) {
        ArrayList<Move> list = new ArrayList<>();
        for (IGeneratorMove generatorMove : listGeneratorMove) {
            list.addAll(generatorMove.getMove(cellBoard, typeGamer));
        }
        return list;
    }

    /**
     * Getter for property 'listGeneratorMove'.
     *
     * @return Value for property 'listGeneratorMove'.
     */
    public List<IGeneratorMove> getListGeneratorMove() {
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


}
