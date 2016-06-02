package main.java.minerapp.classes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Стили для клетки
public class StyleCell {
    private GraphicsContext gc;

    public void crearCell(int x, int y) {
        gc.clearRect(Miner.INDENT_LEFT + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL * y, Miner.SIZE_CELL, Miner.SIZE_CELL);
    }

    public StyleCell(GraphicsContext gc) {
        this.gc = gc;
    }

    public void openCell(int x, int y) {
        gc.setFill(Color.BLACK);
        gc.strokeRoundRect(Miner.INDENT_LEFT + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL * y, Miner.SIZE_CELL, Miner.SIZE_CELL, 10, 10);
    }

    public void mine(int x, int y) {
        gc.fillOval(Miner.INDENT_LEFT + Miner.SIZE_CELL/4 + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL/4 + Miner.SIZE_CELL * y, Miner.SIZE_CELL/2, Miner.SIZE_CELL/2);
    }

    public void text(int x, int y, int number) {
        gc.fillText(String.valueOf(number), Miner.INDENT_LEFT + Miner.SIZE_CELL/2.96296 + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL/1.48148 + Miner.SIZE_CELL * y);
    }

    public void thinkMine(int x, int y) {
        gc.setFill(Color.BLACK);
        gc.fillRoundRect(Miner.INDENT_LEFT + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL * y, Miner.SIZE_CELL, Miner.SIZE_CELL, 20, 20);
    }

    public void unknownCell(int x, int y) {
        gc.setFill(Color.SALMON);
        gc.fillRoundRect(Miner.INDENT_LEFT + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL * y, Miner.SIZE_CELL, Miner.SIZE_CELL, 20, 20);
    }

    public void defoultCell(int x, int y) {
        gc.setFill(Color.CHOCOLATE);
        gc.fillRoundRect(Miner.INDENT_LEFT + Miner.SIZE_CELL * x, Miner.INDENT_TOP + Miner.SIZE_CELL * y, Miner.SIZE_CELL, Miner.SIZE_CELL, 10, 10);
    }
}
