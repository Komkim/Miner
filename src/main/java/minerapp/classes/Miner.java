package main.java.minerapp.classes;

import main.java.minerapp.gui.Action;
import main.java.minerapp.gui.SingltonGroup;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implField.Field;

//класс собирает все в кучу
public class Miner {
    public static int HEIGHT = 0;
    public static int WIDTH = 0;
    public final static int INDENT_LEFT = 20;
    public final static int INDENT_RIGHT = 20;
    public final static int INDENT_TOP= 60;
    public final static int INDENT_BUTTOM = 20;
    public final static int SIZE_CELL = 20;

    private Field field;
    private canvas can;
    private ICell[][] arr;
    private UserLogic userLogic;
    private InteractionMyCanvas interactionMyCanvas;
    private Action action;


    public void Start(int x, int y, int mine) {

        Miner.HEIGHT = y * Miner.SIZE_CELL + Miner.INDENT_BUTTOM + Miner.INDENT_TOP;
        Miner.WIDTH = x * Miner.SIZE_CELL + Miner.INDENT_LEFT + Miner.INDENT_RIGHT;


        can = new canvas(y, x, mine);
        arr = can.getArrayCell();
        interactionMyCanvas = new InteractionMyCanvas(can, arr);
        userLogic = new UserLogic(arr, interactionMyCanvas);
        field = new Field(arr,userLogic, x, y, mine);


    }
}
