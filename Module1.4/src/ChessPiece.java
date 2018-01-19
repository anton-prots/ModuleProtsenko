import javafx.scene.control.Cell;

public abstract class ChessPiece {
    protected Cell currentCell;
    public abstract boolean move(Cell toCell);
}