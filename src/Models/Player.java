package src.Models;

import java.util.Scanner;

public class Player {
    private final Scanner scanner;
    private  int Id;
    private  String name;
    private Symbol symbol;
    private PlayerType playerType;

    public  Player(int id, String name, Symbol symbol, PlayerType playerType){
        this.Id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.scanner = new Scanner(System.in);
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public Move makeMove(Board b){
        System.out.println("Please mention row");
        int row = scanner.nextInt();
        System.out.println("Please mention column");
        int col = scanner.nextInt();
        return new Move(new Cell(row,col),this);
    }
}
