package XepHinh;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 20;
    private final int SQUARE_SIZE = 20;
    private ArrayList<Shape.Tetrominoe> board;

    public Board() {
        board = new ArrayList<Shape.Tetrominoe>();
        for (int i = 0; i < BOARD_WIDTH * BOARD_HEIGHT; i++) {
            board.add(Shape.Tetrominoe.NoShape);
        }
        setPreferredSize(new Dimension(BOARD_WIDTH * SQUARE_SIZE, BOARD_HEIGHT * SQUARE_SIZE));
    }

    public void setBoard(ArrayList<Shape.Tetrominoe> newBoard) {
        board = newBoard;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                Shape.Tetrominoe shape = board.get(i * BOARD_WIDTH + j);
                drawSquare(g, j * SQUARE_SIZE, BOARD_HEIGHT * SQUARE_SIZE - (i + 1) * SQUARE_SIZE, shape);
            }
        }
    }

    private void drawSquare(Graphics g, int x, int y, Shape.Tetrominoe shape) {
        Color colors[] = {new Color(0, 0, 0), new Color(204, 102, 102),
                new Color(102, 204, 102), new Color(102, 102, 204),
                new Color(204, 204, 102), new Color(204, 102, 204),
                new Color(102, 204, 204), new Color(218, 170, 0)};

        Color color = colors[shape.ordinal()];
        g.setColor(color);
        g.fillRect(x + 1, y + 1, SQUARE_SIZE - 2, SQUARE_SIZE - 2);

        g.setColor(color.brighter());
        g.drawLine(x, y + SQUARE_SIZE - 1, x, y);
        g.drawLine(x, y, x + SQUARE_SIZE - 1, y);

        g.setColor(color.darker());
        g.drawLine(x + 1, y + SQUARE_SIZE - 1, x + SQUARE_SIZE - 1, y + SQUARE_SIZE - 1);
        g.drawLine(x + SQUARE_SIZE - 1, y + SQUARE_SIZE - 1, x + SQUARE_SIZE - 1, y + 1);
    }
}
