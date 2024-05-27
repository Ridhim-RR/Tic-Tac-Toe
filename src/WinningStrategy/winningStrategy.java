package src.WinningStrategy;

import src.Models.Board;
import src.Models.Player;

public interface winningStrategy {
    public boolean checkWinner(Player p, Board b);
}
