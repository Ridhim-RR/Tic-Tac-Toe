package src.Stratetgy.BotStrategy;

import src.Models.Board;
import src.Models.Cell;
import src.Models.CellState;
import src.Models.Move;

import java.util.List;

public class EasyBotStrategy implements botStrategy{
    @Override
    public Move makeMove(Board b) {
        for(List<Cell> row : b.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return  new Move(cell,null);
                }
            }
        }
        return null;
    }
}
