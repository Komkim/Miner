package main.java.minerapp.classes;

import main.java.minerapp.interfaces.ICell;

//Возможные действия пользователя
public class UserLogic {
    private ICell[][] arrCell;
    private InteractionMyCanvas interactionMyCanvas;

    public UserLogic(ICell[][] arrCell, InteractionMyCanvas interactionMyCanvas) {
        this.arrCell = arrCell;
        this.interactionMyCanvas = interactionMyCanvas;
    }

    //открыть клетку
    public void openCell(int x, int y) {
        if (!arrCell[y][x].isUnknownCell() && !arrCell[y][x].isThinkMine()) {
            interactionMyCanvas.resetCheckCell();
            interactionMyCanvas.checkZeroCell(x, y);
        }
    }

    //клик правой кнопкой мыши
    public void rightClickMouse(int x, int y) {
        if (!arrCell[y][x].isThinkMine() && !arrCell[y][x].isUnknownCell()) {
            arrCell[y][x].thinkThatMine();
        } else if (arrCell[y][x].isThinkMine()) {
            arrCell[y][x].thinkThatMine();
            arrCell[y][x].makeUnknown();
        } else arrCell[y][x].makeUnknown();
    }
}
