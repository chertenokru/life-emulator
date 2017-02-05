package x.gui;

import javax.swing.*;

/**
 * Created by 13th on 31.01.2017.
 */
public class MainWindow extends JFrame{

    public MainWindow() throws Exception
    {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        setBounds(20,20,700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Map());


        setVisible(true);
    }



}
