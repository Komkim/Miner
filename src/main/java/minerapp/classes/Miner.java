package main.java.minerapp.classes;

import main.java.minerapp.gui.Action;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implField.Field;

//логика игры
public class Miner {
    public static int height;
    public static int width;

    Field field;
    canvas can;
    ICell[][] arr;
    UserLogic userLogic;

    public void Start(int x, int y, int mine) {
        Miner.height = y * 20 + 40;
        Miner.width = x * 20 + 40;

        can = new canvas(y, x, mine);
        arr = can.getArrayCell();
        field = new Field(arr);
        userLogic = new UserLogic(arr, can);

        new Action(userLogic).mouseClicked(field);


    }
}
