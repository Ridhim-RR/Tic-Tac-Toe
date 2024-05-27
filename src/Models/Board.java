package src.Models;

import java.util.List;

public class Board {
    private int size;
    List<List<Cell>> board;

    public Board(int size){
        this.size=size;
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
    }
}

