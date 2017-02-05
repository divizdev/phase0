package ru.neochess.core;

/**
 * Created by diviz on 22.12.2016.
 */
public class Cell {

    public static final int length = 9;
    private int x, y;
    private String[] convertX= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private String[] convertY= {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1" };

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString()
    {
        if (x > length || y > length || x < 0 || y < 0){
            return null;
        }
        return convertX[x] + convertY[y];
    }
}

