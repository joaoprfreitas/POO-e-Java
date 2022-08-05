package chess.chess;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0) continue;

                p.setValues(position.getRow() + i, position.getColumn() + j);
                while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                    matrix[p.getRow()][p.getColumn()] = true;
                    p.setValues(p.getRow() + i, p.getColumn() + j);
                }
                if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                    matrix[p.getRow()][p.getColumn()] = true;
                }
            }
        }

        return matrix;
    }
}
