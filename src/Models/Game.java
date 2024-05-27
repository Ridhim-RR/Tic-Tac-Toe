package src.Models;

import src.Exception.InvalidBotCount;
import src.Exception.InvalidPlayersCount;
import src.WinningStrategy.winningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
private Board board;
private List<Player> players;
private List<Move> moves;
private Player winner;
private int nextPlayerTurn;
private GameState gameState;
private List<winningStrategy> winningStrategies;

private Game(int dimensions, List<Player> p, List<winningStrategy> ws){
  this.board = new Board(dimensions);
  this.players = p;
  this.winningStrategies = ws;
  this.nextPlayerTurn = 0;
  this.gameState = GameState.INPROGRESS;
  this.winner = null;
  this.moves = new ArrayList<>();
}
    public void setBoard(Board board) {
        this.board = board;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Board getBoard() {
        return board;
    }

    public int getNextPlayerTurn() {
        return nextPlayerTurn;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setNextPlayerTurn(int nextPlayerTurn) {
        this.nextPlayerTurn = nextPlayerTurn;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<winningStrategy> getWinningStrategies() {
        return winningStrategies;
    }


    public static gameBuilder getInstance(){
        return new gameBuilder();
    }
    public static class gameBuilder{
        private int dimensions;
        private List<Player> players;
        private List<winningStrategy> winningStrategies;

        public List<winningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public gameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public int getDimensions() {
            return dimensions;
        }

        public gameBuilder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public gameBuilder setWinningStrategies(List<winningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public  void validate() throws Exception{
            int botCount = 0;
            for(Player p : players){
                if(p.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw  new InvalidBotCount();
            }
            if(players.size() != dimensions-1){
                throw new InvalidPlayersCount();
            }
//            Symbol Validation::::
//                ToDO::::::
        }
        public Game build() throws Exception{
          validate();
            return new Game(this.dimensions,this.players, this.winningStrategies);
        }
    }
}
