package main.java.minerapp.interfaces;

//интерфейс для клетки
public interface ICell{
    void draw(); //Отрисовывает клетку
    boolean isMine();//проверяет, мина это или нет
    boolean isUnknownCell();//проверяет, неизвестная эта клетка или нет
    void makeUnknown();//сделать неизвестной
    int getNumber();//возвращает колличество мин рядом
    void thinkThatMine();//ставит ярлык, что здесь мина
    boolean isThinkMine();//проверяет есть ли ярлык
    boolean isOpenCell();//открыта ячейка или нет
    void openCell();//открывает ячейку

}
