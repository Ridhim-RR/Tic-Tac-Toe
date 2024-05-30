package src.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    List<List<Cell>> board;

    public Board(int size){
        this.size=size;
        board  = new ArrayList<>();
        for(int i=0; i<size; i++){
            board.add(new ArrayList<>());
            for(int j=0; j<size; j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
    public void printBoard(){
//        TODO Implementation........
      for(List<Cell> row :board){
          for(Cell cell :row){
              cell.display();
          }
      }
      System.out.println();
    }
}

