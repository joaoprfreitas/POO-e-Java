package chess.chess;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        int[] array1 = new int[] {-1, 1};
        int[] array2 = new int[] {-2, 2};

        for (int i : array1) {
            for (int j : array2) {
                // Row -1, 1 - Column -2, 2
                p.setValues(position.getRow() + i, position.getColumn() + j);
                if (getBoard().positionExists(p) && canMove(p)) {
                    matrix[p.getRow()][p.getColumn()] = true;
                }

                // Row -2, 2 - Column -1, 1
                p.setValues(position.getRow() + j, position.getColumn() + i);
                if (getBoard().positionExists(p) && canMove(p)) {
                    matrix[p.getRow()][p.getColumn()] = true;
                }
            }
        }

        return matrix;
    }
}
