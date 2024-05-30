package src.Stratetgy.WinningStrategy;

import src.Models.Board;
import src.Models.Move;

public interface winningStrategy {
    public boolean checkWinner(Move m, Board b);
}
