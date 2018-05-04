package br.com.xti.gui;

import javax.swing.*;

public class Janela extends JFrame {

    public Janela() {

        super("Minha Janela");

        JButton botao = new JButton("Clique.");
        this.getContentPane().add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Janela();
    }
}
