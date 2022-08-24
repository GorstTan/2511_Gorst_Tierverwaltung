package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainView extends JFrame {

    public MainView(){
      setTitle("Tierverwaltung");
      setSize(400,300);
      addComponents();
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      pack();
      setVisible(true);

    }

private void addComponents(){
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        JPanel centerPanel= new JPanel();
        JPanel bottomPanel= new JPanel();
        add(topPanel);
        add(centerPanel);
        add(bottomPanel);

        topPanel.add(new JLabel("Unser kleiner Tierladen"));

        centerPanel.setBorder(new EmptyBorder(5,5,5,5));
        centerPanel.add(new JLabel("Name"));
        centerPanel.add(new JLabel("Alter"));
        centerPanel.add(new JLabel("Geschlecht"));
        centerPanel.add(new JLabel("Tierart"));
        centerPanel.add(new JLabel("Persönlichkeit"));


        JButton beendenBUtton = new JButton("Beenden");
        beendenBUtton.addActionListener(e->dispose());
        bottomPanel.add(beendenBUtton);
}

}
