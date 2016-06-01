package main.java.minerapp.classes;

import main.java.minerapp.interfaces.ICell;

//Возможные действия пользователя
public class UserLogic {
    private ICell[][] arrCell;
    canvas can;

    public UserLogic(ICell[][] arrCell, canvas can)
    {
        this.arrCell = arrCell;
        this.can = can;
    }

    //открыть клетку
    public void openCell(int x, int y)
    {
        if(!arrCell[y][x].isUnknownCell() && !arrCell[y][x].isThinkMine()) {
            can.resetCheckCell();
            can.checkZeroCell(x, y);
        }
    }

    //клик правой кнопкой мыши
    public void rightClickMouse(int x , int y)
    {
        if(!arrCell[y][x].isThinkMine() && !arrCell[y][x].isUnknownCell())
        {
            arrCell[y][x].thinkThatMine();
        }
        else if(arrCell[y][x].isThinkMine())
        {
            arrCell[y][x].thinkThatMine();
            arrCell[y][x].makeUnknown();
        }
        else arrCell[y][x].makeUnknown();

    }



}
