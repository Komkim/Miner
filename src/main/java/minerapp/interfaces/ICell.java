package main.java.minerapp.interfaces;

import javafx.scene.canvas.GraphicsContext;

//интерфейс для клетки
public interface ICell{
    void draw(GraphicsContext gc, int x, int y); //Отрисовывает клетку
    int getNumber();//возвращает колличество мин рядом
    void setNumber(int number);//записывает цифру в ячейку

    boolean isMine();//проверяет, мина это или нет
    boolean isUnknownCell();//проверяет, неизвестная эта клетка или нет
    boolean isThinkMine();//проверяет есть ли ярлык
    boolean isOpenCell();//открыта ячейка или нет
    boolean isChecknotCkech();//чекнута ячейка или нет(нужно для логики открывания пустых клеток)

    void setCellMine(boolean cellMine);//устанавливает мину
    void makeUnknown();//сделать неизвестной
    void thinkThatMine();//ставит ярлык, что здесь мина
    void openCell();//открывает ячейку
    void setChecknotCkech(boolean checkOnCkech);//устанавливает значения чекнута ячейка или нет


}
