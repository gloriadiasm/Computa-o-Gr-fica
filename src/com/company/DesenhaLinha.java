package com.company;

import javax.swing.*;
import java.awt.*;

public class DesenhaLinha extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
    }
}
