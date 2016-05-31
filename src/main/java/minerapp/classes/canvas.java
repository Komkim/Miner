package main.java.minerapp.classes;


import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implicell.Cell;
import main.java.minerapp.start.Main;

import java.util.Random;

//матрица для наших клеток
public class canvas {
    private int height;
    private int width;
    private int numberMines;
    private ICell[][] arrayCell;

    public canvas(int height, int width, int numberMines) {
        this.height = height;
        this.width = width;
        this.numberMines = numberMines;
        arrayCell = new ICell[height][width];

        initArrayCell();
        initMineArrayCell();
        initNumber();
    }

    public ICell[][] getArrayCell() {
        return arrayCell;
    }

    //проставляет мины в произвольном порядке
    private void initMineArrayCell()
    {
        for(int i = 0; i < numberMines; i++)
        {
            Random ran = new Random();
            int x;
            int y;
            do {
                x = ran.nextInt(arrayCell[0].length);
                y = ran.nextInt(arrayCell.length);
            }while(arrayCell[y][x].isMine());
            arrayCell[y][x].setCellMine(true);
        }
    }

    //инициализирует arrayCell
    private void initArrayCell()
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                arrayCell[i][j] = new Cell();
            }
        }
        initMineArrayCell();
    }

    //проставляет цифру в клетку
    private void initNumber()
    {

        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                if(!arrayCell[i][j].isMine())
                {
                    int countMine = 0;
                    int heightStart = i - 1 < 0 ? 0 : i -1;
                    int heightFinish = i + 1 >= height ? height-1 : i + 1;
                    int widthStart = j - 1 < 0 ? 0 : j - 1;
                    int widthFinish = j + 1 >= width ? width-1 : j + 1;
                    for(int ii = heightStart; ii <= heightFinish; ii++)
                    {
                        for(int jj = widthStart; jj <= widthFinish; jj++)
                        {
                            if(arrayCell[ii][jj].isMine()) countMine++;
                        }
                    }
                    arrayCell[i][j].setNumber(countMine);
                }
            }
        }

    }
}
