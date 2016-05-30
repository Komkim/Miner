package main.java.minerapp.interfaces;

//интерфейс для клетки
public interface ICell{
    void draw(); //Отрисовывает клетку
    boolean isMine();//проверяет, мина это или нет
    boolean isUnknownCell();//проверяет, неизвестная эта клетка или нет
    void makeUnknown();//сделать неизвестной
}
