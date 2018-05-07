package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ControleTextArea extends JFrame implements ActionListener {

    private JTextArea texto = new JTextArea();
    private Font fonte = new Font("Serif",Font.PLAIN, 26);


    public ControleTextArea() {
        super("Editor de Textos");



        JScrollPane scroll = new JScrollPane(texto);
        JButton botao = new JButton("Abrir Arquivo");
        botao.setFont(fonte);
        botao.addActionListener(this);

        texto.setFont(fonte);

        Container c = getContentPane();

        c.add(BorderLayout.CENTER, scroll);
        c.add(BorderLayout.SOUTH, botao);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ControleTextArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);
        File file = c.getSelectedFile();
        try {
            Path path = Paths.get(file.getAbsolutePath());
            String retorno = new String(Files.readAllBytes(path));
            texto.setText(retorno);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Não conseguimos abrir seu arquivo. Lamentamos" +
                    " o ocorrido e estamos trabalhando para tornar as coisas um pouco melhor, cof, gasp.");
        }
    }
}
