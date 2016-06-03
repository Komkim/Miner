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
        interactionMyCanvas.rightClickMouse(x, y);
    }

    public void openDistrict(int x, int y)
    {
        interactionMyCanvas.openDistrict(x, y);
    }
}
