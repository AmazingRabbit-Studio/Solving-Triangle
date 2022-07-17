package io.github.armramzing;

import javax.swing.*;

public class AboutWindow {

    static String frame_1 = "关于";

    public static void start(){

        JFrame f = new JFrame(frame_1);
        f.setBounds(200,300,500,500);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setVisible(true);

    }

}
