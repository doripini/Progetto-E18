package gui.finestre;

import gui.panels.PannelloLogin;
import gui.panels.PannelloRegistrazione;
import locale.Locale;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FinestraRegistrazione extends JFrame {
    public FinestraRegistrazione(ArrayList<Locale> locali){
        setSize(800,800);
        PannelloRegistrazione p= new PannelloRegistrazione(locali);
        Container c=getContentPane();
        c.add(p);

    }
}
