package HW11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW11_1 extends JFrame implements ActionListener {
    private final JButton[][] buttons;
    private final JLabel playerLabel;
    private boolean isPlayer1Turn;
    private TicTacToe ticTacToe;

    public HW11_1() {
        setTitle("九宮格棋盤");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        JPanel statusPanel = new JPanel();
        statusPanel.setLayout(new FlowLayout());
        playerLabel = new JLabel("現在輪到玩家1");
        statusPanel.add(playerLabel);

        add(boardPanel, BorderLayout.CENTER);
        add(statusPanel, BorderLayout.SOUTH);

        isPlayer1Turn = true;
        ticTacToe = new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (!clickedButton.getText().equals("")) {
            return;
        }

        if (isPlayer1Turn) {
            clickedButton.setText("X");
            playerLabel.setText("現在輪到玩家2");
        } else {
            clickedButton.setText("O");
            playerLabel.setText("現在輪到玩家1");
        }

        isPlayer1Turn = !isPlayer1Turn;

        // Make a move in TicTacToe logic
        int row = -1, col = -1;
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j] == clickedButton) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }
        ticTacToe.makeMove(row, col);

        // Check for winner
        if (ticTacToe.hasWinner()) {
            JOptionPane.showMessageDialog(this, "玩家 " + ticTacToe.getCurrentPlayer() + " 獲勝！");
            resetGame();
            return;
        }

        // Check for tie
        if (ticTacToe.isBoardFull() && !ticTacToe.hasWinner()) {
            JOptionPane.showMessageDialog(this, "遊戲結束，平局！");
            resetGame();
            return;
        }

        // Switch player in TicTacToe logic
        ticTacToe.switchPlayer();
    }

    private void resetGame() {
        // Reset buttons
        for (JButton[] row : buttons) {
            for (JButton button : row) {
                button.setText("");
            }
        }
        // Reset player label
        playerLabel.setText("現在輪到玩家1");
        // Reset TicTacToe logic
        ticTacToe = new TicTacToe();
        isPlayer1Turn = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HW11_1 hw11_1 = new HW11_1();
            hw11_1.setVisible(true);
        });
    }
}
