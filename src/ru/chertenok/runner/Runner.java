package ru.chertenok.runner;

import x.gui.MainWindow;

/**
 * Created by 13th on 31.01.2017.
 */
public class Runner {
    public static void main(String[] args)
    {
        try {
            MainWindow mainWindow = new MainWindow();
        } catch (Exception e)
            {
                e.printStackTrace();

            }
    }
}
