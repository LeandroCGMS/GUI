package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;

public class ControleLabel extends JFrame {

    public ControleLabel() {
        super("Controle Label");

        JLabel simples = new JLabel("Label Simples");
        simples.setToolTipText("Meu Tooltip");

        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
        JLabel label = new JLabel("Label Simples");
        label.setFont(fonte);
        label.setForeground(Color.BLUE);
        label.setToolTipText("Label com mais formatações.");


        ImageIcon icon = new ImageIcon(getClass().getResource("fotos/lampada.jpeg"));
        JLabel imagem = new JLabel(icon);
        imagem.setToolTipText("Label com imagem.");


        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        c.add(label);
        c.add(imagem);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {

        new ControleLabel();

    }
}
