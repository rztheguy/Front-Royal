package gameui;

import java.awt.event.*;
import javax.swing.*;

public class UI extends JFrame implements ActionListener{
    private final UIButtons[] menuBar = new UIButtons[5];
    private final String[] menuBarImages = {};
    public UI(){
        super("Front Royal");
        setSize(600, 1000);
        setResizable(false);
        setFocusable(true);
        setLayout(null);
        
        menuBar();

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private void menuBar() {
        for (int i = 0; i < 5; i++) {
            menuBar[i] = new UIButtons("");
            menuBar[i].setBounds(5 + 116 * i, 820, 110, 140);
            add(menuBar[i]);
        }
    }

    public static void main(String[] args) {
        new UI();
    }
}