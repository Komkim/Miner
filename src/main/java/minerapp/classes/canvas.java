package main.java.minerapp.classes;


import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implicell.Cell;

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
    private void initMineArrayCell() {
        for (int i = 0; i < numberMines; i++) {
            Random ran = new Random();
            int x;
            int y;
            do {
                x = ran.nextInt(arrayCell[0].length);
                y = ran.nextInt(arrayCell.length);
            } while (arrayCell[y][x].isMine());
            arrayCell[y][x].setCellMine(true);
        }
    }

    //инициализирует arrayCell
    private void initArrayCell() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arrayCell[i][j] = new Cell();
            }
        }
    }

    //проставляет цифру в клетку
    private void initNumber() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (!arrayCell[i][j].isMine()) {
                    int[] myCoord = startFinishPosition(j, i);
                    arrayCell[i][j].setNumber(countMine(myCoord));
                }
            }
        }
    }

    //счетает мины вокруг
    private int countMine(int[] myCoord) {
        int countMine = 0;
        for (int ii = myCoord[2]; ii <= myCoord[3]; ii++) {
            for (int jj = myCoord[0]; jj <= myCoord[1]; jj++) {
                if (arrayCell[ii][jj].isMine()) countMine++;
            }
        }
        return countMine;
    }

    //проверяет чтобы координаты не выходили за пределы поля
    private int[] startFinishPosition(int x, int y) {
        int heightStart = y - 1 < 0 ? 0 : y - 1;
        int heightFinish = y + 1 >= height ? height - 1 : y + 1;
        int widthStart = x - 1 < 0 ? 0 : x - 1;
        int widthFinish = x + 1 >= width ? width - 1 : x + 1;
        return new int[]{widthStart, widthFinish, heightStart, heightFinish};
    }
}
