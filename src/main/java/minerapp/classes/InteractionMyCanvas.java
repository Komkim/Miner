package main.java.minerapp.classes;

import main.java.minerapp.interfaces.ICell;

public class InteractionMyCanvas {

    private ICell[][] arrayCell;
    private canvas can;

    public InteractionMyCanvas(canvas can, ICell[][] arrayCell)
    {
        this.arrayCell = arrayCell;
        this.can = can;
    }
/*
    public void checkZeroCell(int x, int y)
    {
        arrayCell[y][x].openCell();
        if(arrayCell[y][x].getNumber() == 0 && !arrayCell[y][x].isChecknotCkech())
        {
            arrayCell[y][x].setChecknotCkech(true);

            int[] myCoord = startFinishPosition(x, y);
            for(int ii = myCoord[2]; ii <= myCoord[3]; ii++)
            {
                for(int jj = myCoord[0]; jj <= myCoord[1]; jj++)
                {
                    checkZeroCell(jj,ii);
                }
            }
        }
    }

    //проверяет чтобы координаты не выходили за пределы поля
    private int[] startFinishPosition(int x, int y)
    {
        int heightStart = y - 1 < 0 ? 0 : y -1;
        int heightFinish = y + 1 >= height ? height-1 : y + 1;
        int widthStart = x - 1 < 0 ? 0 : x - 1;
        int widthFinish = x + 1 >= width ? width-1 : x + 1;
        return new int[]{widthStart,widthFinish,heightStart,heightFinish};
    }


    //открывает нулевые ячейки


    //
    public void resetCheckCell() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arrayCell[i][j].setChecknotCkech(false);
            }
        }
    }
*/
}
