package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField telaCalculadora;
    private GridLayout layoutGrade;
    private JPanel painel;
    private JButton bot7;
    private JButton bot8;
    private JButton bot9;
    private JButton botDiv;

    private JButton bot4;
    private JButton bot5;
    private JButton bot6;
    private JButton botMult;

    private JButton bot1;
    private JButton bot2;
    private JButton bot3;
    private JButton botMenos;

    private JButton bot0;
    private JButton botPonto;
    private JButton botIgual;
    private JButton botMais;

    public Calculadora() {

        super("Calculadora");
        telaCalculadora = new JTextField();
        telaCalculadora.setFont(new Font("serif", Font.PLAIN, 26));

        painel = new JPanel();
        layoutGrade = new GridLayout(4, 4, 5, 5);
        bot7 = new JButton("7");
        bot8 = new JButton("8");
        bot9 = new JButton("9");
        botDiv = new JButton("/");

        bot4 = new JButton("4");
        bot5 = new JButton("5");
        bot6 = new JButton("6");
        botMult = new JButton("*");

        bot1 = new JButton("1");
        bot2 = new JButton("2");
        bot3 = new JButton("3");
        botMenos = new JButton("-");

        bot0 = new JButton("0");
        botPonto = new JButton(".");
        botIgual = new JButton("=");
        botMais = new JButton("+");


        Container n = painel;
        n.setLayout(layoutGrade);
        n.add(bot7);
        n.add(bot8);
        n.add(bot9);
        n.add(botDiv);

        n.add(bot4);
        n.add(bot5);
        n.add(bot6);
        n.add(botMult);

        n.add(bot1);
        n.add(bot2);
        n.add(bot3);
        n.add(botMenos);

        n.add(bot0);
        n.add(botPonto);
        n.add(botIgual);
        n.add(botMais);

        Container c = getContentPane();
        c.add(BorderLayout.NORTH, telaCalculadora);
        c.add(BorderLayout.CENTER, n);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Calculadora();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
