package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ControleCheck extends JFrame {

    private JCheckBox negrito, italico;
    private JTextField campoTexto;
    private FlowLayout layout;
    private Font fonte;

    public ControleCheck() {
        super("Controle Check");
        layout = new FlowLayout();

        negrito = new JCheckBox("Bold");
        negrito.addItemListener(new CheckListener());

        italico = new JCheckBox("Itálico");
        italico.addItemListener(new CheckListener());
        campoTexto = new JTextField("Veja a Fonte Mudar.", 12);
        fonte = new Font("serif", Font.PLAIN, 26);
        campoTexto.setFont(fonte);

        Container c = getContentPane();
        c.setLayout(layout);
        c.add(campoTexto);
        c.add(negrito);
        c.add(italico);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    private class CheckListener implements ItemListener {


        @Override
        public void itemStateChanged(ItemEvent e) {
            if( negrito.isSelected() && italico.isSelected()) {
                campoTexto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
            } else if( negrito.isSelected()) {
                campoTexto.setFont(new Font("serif", Font.BOLD, 26));
            } else if( italico.isSelected()) {
                campoTexto.setFont(new Font("serif", Font.ITALIC, 26));
            } else {
                campoTexto.setFont(new Font("serif", Font.PLAIN, 26));
            }

            System.out.println("Mudar");
        }
    }

    public static void main(String[] args) {

        new ControleCheck();
    }
}
