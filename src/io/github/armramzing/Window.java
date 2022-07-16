package io.github.armramzing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;

public class Window extends Main {

    static JPanel p0 = new JPanel();
    static JTextField tf;

    static String frame_0 = "解三角形计算器";
    static String frame_0_menubar_0_menu_0 = "关于";
    static String frame_0_menubar_0_menu_1 = "语言(Language)";
    static String frame_0_menubar_0_menu_1_menuitem_0 = "简体中文";
    static String frame_0_menubar_0_menu_1_menuitem_1 = "English(United States)";
    static String frame_0_menubar_0_menu_1_menuitem_2 = "Español(España)";
    static String frame_0_menubar_0_menu_1_menuitem_3 = "Русский";
    static String frame_0_panel_0_lable_0 = "a";
    static String frame_0_panel_0_lable_1 = "b";
    static String frame_0_panel_0_lable_2 = "c";
    static String frame_0_panel_0_lable_3 = "A";
    static String frame_0_panel_0_lable_4 = "B";
    static String frame_0_panel_0_lable_5 = "C";
    static String frame_0_panel_0_lable_6 = "S";
    static String frame_0_panel_0_lable_7 = "C(周长)";
    static String frame_0_button_0 = "计算";

    public static void start(){

        JFrame f = new JFrame(frame_0);
        f.setVisible(true);
        f.setBounds(800,300,500,500);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JMenuBar mb0 = new JMenuBar();
        f.add(mb0,BorderLayout.NORTH);
        f.validate();

        JMenu mb0m0 = new JMenu(frame_0_menubar_0_menu_0);
        mb0.add(mb0m0);

        JMenu mb0m1 = new JMenu(frame_0_menubar_0_menu_1);
        mb0.add(mb0m1);

        JMenuItem mb0m1mi0 = new JMenuItem(frame_0_menubar_0_menu_1_menuitem_0);
        mb0m1mi0.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Chinese.replace();
                f.dispose();
                Window.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mb0m1.add(mb0m1mi0);

        JMenuItem mb0m1mi1 = new JMenuItem(frame_0_menubar_0_menu_1_menuitem_1);
        mb0m1mi1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                English.replace();
                f.dispose();
                Window.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mb0m1.add(mb0m1mi1);

        JMenuItem mb0m1mi2 = new JMenuItem(frame_0_menubar_0_menu_1_menuitem_2);
        mb0m1mi2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Spanish.replace();
                f.dispose();
                Window.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mb0m1.add(mb0m1mi2);

        JMenuItem mb0m1mi3 = new JMenuItem(frame_0_menubar_0_menu_1_menuitem_3);
        mb0m1mi3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Russian.replace();
                f.dispose();
                Window.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mb0m1.add(mb0m1mi3);

        p0.setLayout(new GridLayout(8,2,5,5));
        f.add(p0,BorderLayout.CENTER);

        JLabel p0l0 = new JLabel(frame_0_panel_0_lable_0);
        p0.add(p0l0);

        JTextField p0tf0 = new JTextField();
        p0.add(p0tf0);

        JLabel p0l1 = new JLabel(frame_0_panel_0_lable_1);
        p0.add(p0l1);

        JTextField p0tf1 = new JTextField();
        p0.add(p0tf1);

        JLabel p0l2 = new JLabel(frame_0_panel_0_lable_2);
        p0.add(p0l2);

        JTextField p0tf2 = new JTextField();
        p0.add(p0tf2);

        JLabel p0l3 = new JLabel(frame_0_panel_0_lable_3);
        p0.add(p0l3);

        JTextField p0tf3 = new JTextField();
        p0.add(p0tf3);

        JLabel p0l4 = new JLabel(frame_0_panel_0_lable_4);
        p0.add(p0l4);

        JTextField p0tf4 = new JTextField();
        p0.add(p0tf4);

        JLabel p0l5 = new JLabel(frame_0_panel_0_lable_5);
        p0.add(p0l5);

        JTextField p0tf5 = new JTextField();
        p0.add(p0tf5);

        JLabel p0l6 = new JLabel(frame_0_panel_0_lable_6);
        p0.add(p0l6);

        JTextField p0tf6 = new JTextField();
        p0.add(p0tf6);

        JLabel p0l7 = new JLabel(frame_0_panel_0_lable_7);
        p0.add(p0l7);

        JTextField p0tf7 = new JTextField();
        p0.add(p0tf7);

        f.validate();

        JButton b0 = new JButton(frame_0_button_0);
        b0.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

                if(p0tf0.getText().length() != 0) {
                    a = new BigDecimal(p0tf0.getText());
                } if(p0tf1.getText().length() != 0) {
                    b = new BigDecimal(p0tf1.getText());
                } if(p0tf2.getText().length() != 0) {
                    c = new BigDecimal(p0tf2.getText());
                } if(p0tf3.getText().length() != 0) {
                    A = new BigDecimal(p0tf3.getText());
                }  if(p0tf4.getText().length() != 0) {
                    B = new BigDecimal(p0tf4.getText());
                } if(p0tf5.getText().length() != 0) {
                    C = new BigDecimal(p0tf5.getText());
                } if(p0tf6.getText().length() != 0) {
                    S = new BigDecimal(p0tf6.getText());
                } if(p0tf7.getText().length() != 0) {
                    Cir = new BigDecimal(p0tf7.getText());
                }

                calculate();

                p0tf0.setText(String.valueOf(a1));
                p0tf1.setText(String.valueOf(b1));
                p0tf2.setText(String.valueOf(c1));
                p0tf3.setText(String.valueOf(A1));
                p0tf4.setText(String.valueOf(B1));
                p0tf5.setText(String.valueOf(C1));
                p0tf6.setText(String.valueOf(S1));
                p0tf7.setText(String.valueOf(Cir1));
                f.validate();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        f.add(b0,BorderLayout.SOUTH);
        f.validate();

    }

    public static void calculate(){

        Scale.calculate();
        AngleA.calculate();
        AngleB.calculate();
        AngleC.calculate();
        Circumference.calculate();

    }

}
