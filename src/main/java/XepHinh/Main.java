//package XepHinh;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import
//
//public class Main {
//    private TetrisGame tetrisGame;
//    private Board board;
//
//    public Main() {
//        tetrisGame = new TetrisGame();
//        board = new Board();
//        JFrame frame = new JFrame("Tetris");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200, 400);
//        frame.setVisible(true);
//        frame.add(board);
//
//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                tetrisGame.oneLineDown();
//                board.setBoard(tetrisGame.getBoard());
//            }
//        });
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Main();
//            }
//        });
//    }
//}
