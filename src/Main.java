package src;

import src.Controllers.GameController;
import src.Models.*;
import src.Stratetgy.WinningStrategy.ColWinningStrategy;
import src.Stratetgy.WinningStrategy.RowWinningStrategy;
import src.Stratetgy.WinningStrategy.diagnolWinningStrategy;
import src.Stratetgy.WinningStrategy.winningStrategy;

import java.util.ArrayList;
import java.util.List;

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
        try{
        int dimensions = 3;
        List<Player> p = new ArrayList<>();
        p.add(new Player(1,"Ridhim",new Symbol('o'), PlayerType.HUMAN));
        p.add(new Bot(1,"Ridhim",new Symbol('X'),BotDifficulity.EASY));
        List<winningStrategy> ws = List.of(
                new RowWinningStrategy(),
                new diagnolWinningStrategy(),
                new ColWinningStrategy()
        );
        Game g = gc.StartGame(dimensions,p,ws);
            while(g.getGameState().equals(GameState.INPROGRESS)){
                gc.makeMove(g);
                gc.displayBoard(g);
            }
            if(g.getGameState().equals(GameState.DRAW)){
                System.out.println("Game DRAWN!!!!");
            }else if(g.getGameState().equals(GameState.SUCCESS)){
                System.out.println("Game SUCCESS!!!");
            }
        }catch(Exception e){
            throw e;
        }
//        Game g = gc.StartGame(3,new ArrayList<>(), new ArrayList<>());
//        Game g1 = gc.StartGame(5,new ArrayList<>(), new ArrayList<>());
//        gc.displayBoard(g);

    }
}
