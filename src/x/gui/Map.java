package x.gui;

import x.ucf.UcfCoder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by 13th on 31.01.2017.
 */
public class Map extends JTable{
    private int mapSize = 129;
    private int cellSize = 5;

    public Map(){
      setModel(new DefaultTableModel(this.mapSize,this.mapSize));
      setRowHeight(this.cellSize);
      for (int i = 0; i < this.mapSize; i++){
          getColumnModel().getColumn(i).setMinWidth(this.cellSize);
          getColumnModel().getColumn(i).setMaxWidth(this.cellSize);
      }
      for (int i = 0; i<mapSize;i++)
          for (int j = 0; j<mapSize;j++)
          {
            setValueAt((Object)0x000,j,i);
          }

        generateLandscape();
    }

    private final void generateLandscape()
    {
        setValueAt(UcfCoder.LANDSCAPE_MOUNTAIN_LOW,0,0);
        setValueAt(UcfCoder.LANDSCAPE_MOUNTAIN_LOW,0,0+this.mapSize - 1);
        setValueAt(UcfCoder.LANDSCAPE_MOUNTAIN_LOW,0+this.mapSize-1,0);
        setValueAt(UcfCoder.LANDSCAPE_MOUNTAIN_LOW,0+this.mapSize-1,0+this.mapSize-1);
        float landscapeShif = 15.0f;
        for(int bigStep = mapSize-1;bigStep>=2;bigStep /=2,landscapeShif /=2.0f)
        {
          //  bigStep = bigStep
        }


    }
}
