package io.github.armramzing;

import javax.swing.*;

public class HelpWindow {

    static String frame_2 = "帮助页面";

    public static void start(){

        JFrame f = new JFrame(frame_2);
        f.setBounds(1200,300,500,500);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setVisible(true);

    }

}
