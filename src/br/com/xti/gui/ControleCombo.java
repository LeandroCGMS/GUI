package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ControleCombo extends JFrame implements ItemListener {

    private JComboBox<String> combo;
    private JLabel label;
    private ImageIcon[] imagens = {

            new ImageIcon(getClass().getResource("fotos/01.jpeg")),
            new ImageIcon(getClass().getResource("fotos/02.jpeg")),
            new ImageIcon(getClass().getResource("fotos/03.jpeg")),
            new ImageIcon(getClass().getResource("fotos/04.jpeg")),

    };

    public ControleCombo() {
        super("Álbum de Fotos");
        Container c = getContentPane();

        combo = new JComboBox<String>();
        combo.setFont(new Font("Serif", Font.PLAIN, 26));
        combo.addItem("Esposa");
        combo.addItem("Filhos");
        combo.addItem("Avós");
        combo.addItem("Primos");
        combo.addItemListener(this);

        label = new JLabel(imagens[0]);

        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,530);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ControleCombo();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            label.setIcon(imagens[combo.getSelectedIndex()]);
        }
    }
}
