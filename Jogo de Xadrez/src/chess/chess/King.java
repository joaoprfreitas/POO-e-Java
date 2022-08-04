package chess.chess;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // 3x3 area
        for (int i = -1; i < 2; i++) { // each line
            for (int j = -1; j < 2; j++) { // each column
                if (i == 0 && j == 0) continue;

                p.setValues(position.getRow() + i, position.getColumn() + j);
                if (getBoard().positionExists(p) && canMove(p)) {
                    matrix[p.getRow()][p.getColumn()] = true;
                }

            }
        }

        return matrix;
    }
}
