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

    private void initNumber()
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                if(!arrayCell[i][j].isMine())
                {

                }
            }
        }
    }
}
