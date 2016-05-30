package main.java.minerapp.classes;


import main.java.minerapp.interfaces.ICell;

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
    }

    public ICell[][] getArrayCell() {
        return arrayCell;
    }

    //инициализация нашего поля
    public void initArrayCell()
    {

    }
}
