package main.java.minerapp.interfaces;

import javafx.scene.canvas.GraphicsContext;

//интерфейс для клетки
public interface ICell{
    void draw(GraphicsContext gc, int x, int y); //Отрисовывает клетку
    boolean isMine();//проверяет, мина это или нет
    void setCellMine(boolean cellMine);//устанавливает мину
    boolean isUnknownCell();//проверяет, неизвестная эта клетка или нет
    void makeUnknown();//сделать неизвестной
    int getNumber();//возвращает колличество мин рядом
    void thinkThatMine();//ставит ярлык, что здесь мина
    boolean isThinkMine();//проверяет есть ли ярлык
    boolean isOpenCell();//открыта ячейка или нет
    void openCell();//открывает ячейку
    void setNumber(int number);//записывает цифру в ячейку
    void setCheckOnCkech(boolean checkOnCkech);
    boolean isCheckOnCkech();

}
