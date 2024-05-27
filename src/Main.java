package src;

import src.Controllers.GameController;
import src.Models.Game;
import src.Models.GameState;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
//        client -> gameController
//        1. start the game....  -> create Game Object.
//          1.1 create board and size of board;
//          1.2 add players;
//          1.3 select symbol;
//        2.While the game state in progress:
//          2.1
        GameController gc = new GameController();
        Game g = gc.StartGame(3,new ArrayList<>(), new ArrayList<>());
        Game g1 = gc.StartGame(5,new ArrayList<>(), new ArrayList<>());
        gc.displayBoard(g);

        while(gc.game.getGameState().equals(GameState.INPROGRESS)){
         gc.makeMove();
         gc.displayBoard(g);
        }
        if(gc.game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game DRAWN!!!!");
        }else if(gc.game.getGameState().equals(GameState.SUCCESS)){
            System.out.println("Game SUCCESS!!!");
        }
    }
}
