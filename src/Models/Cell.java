package src.Models;

public class Cell {
    private  int row;
    private  int col;
    private Player player;
    private CellState cellState;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.player = null;
        this.cellState = CellState.EMPTY;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void display(){
        if(player == null){
            System.out.println("| - |");
        }else{
            System.out.println("| "+ player.getSymbol() + " |");
        }
    }

}
