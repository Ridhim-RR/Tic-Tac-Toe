package src.Controllers;

import src.Models.Game;
import src.Models.GameState;
import src.Models.Player;
import src.WinningStrategy.winningStrategy;

import java.util.List;

public class GameController {
//  client ->> gameController
//    start the game .... ->> create the game object.....
//     1.1 create board and the sie of the board.....
//
//    public Game game;

    public Game StartGame(int dimension, List<Player> p, List<winningStrategy> winningStrategies) throws Exception{
//    First VALIDATE....
        Game g = Game.getInstance().setDimensions(3).setPlayers(p).setWinningStrategies(winningStrategies).build();
        return  g;
//    Create Game Object....
//     SET STATUS.......
    }

    public void displayBoard(Game g){
        g.getBoard().printBoard();
    }

    public void makeMove(){
//        This is the functionality of Player.........
//        TODO Implementation.......

    }

    public GameState checkGameState(Game g){
        return g.getGameState();
    }

    public Player getWinner(Game g){
    return g.getWinner();
    }


}
