package XepHinh;

import java.util.ArrayList;

public class TetrisGame {
    private Shape currentPiece;
    private ArrayList<Shape.Tetrominoe> board;

    public TetrisGame() {
        currentPiece = new Shape();
        board = new ArrayList<Shape.Tetrominoe>();
        for (int i = 0; i < 200; i++) {
            board.add(Shape.Tetrominoe.NoShape);
        }
    }

    public boolean tryMove(Shape newPiece, int newX, int newY) {
        for (int i = 0; i < 4; ++i) {
            int x = newX + newPiece.x(i);
            int y = newY - newPiece.y(i);
            if (x < 0 || x >= 10 || y < 0 || y >= 20) {
                return false;
            }
            if (shapeAt(x, y) != Shape.Tetrominoe.NoShape) {
                return false;
            }
        }
        currentPiece = newPiece;
        return true;
    }

    private Shape.Tetrominoe shapeAt(int x, int y) {
        return board.get(y * 10 + x);
    }

    public void dropDown() {
        int newY = 0;
        for (int i = 0; i < 4; ++i) {
            int y = currentPiece.y(i);
            newY = Math.max(newY, y);
        }
        tryMove(currentPiece, 0, newY);
    }

    public void oneLineDown() {
        if (!tryMove(currentPiece, 0, -1)) {
            pieceDropped();
        }
    }

    private void pieceDropped() {
        for (int i = 0; i < 4; ++i) {
            int x = currentPiece.x(i);
            int y = -currentPiece.y(i);
            board.set((y * 10 + x), currentPiece.getShape());
        }
        removeFullLines();
    }

    private void removeFullLines() {
        for (int i = 19; i >= 0; --i) {
            boolean isFullLine = true;
            for (int j = 0; j < 10; ++j) {
                if (shapeAt(j, i) == Shape.Tetrominoe.NoShape) {
                    isFullLine = false;
                    break;
                }
            }
            if (isFullLine) {
                for (int k = i; k < 19; ++k) {
                    for (int j = 0; j < 10; ++j) {
                        board.set((k * 10 + j), shapeAt(j, k + 1));
                    }
                }
            }
        }
    }
}
