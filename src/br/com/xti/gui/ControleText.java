package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleText extends JFrame {

    private JButton ok, cancel;
    private JLabel login, senha;
    private JTextField textoLogin;
    private JPasswordField textoSenha;


    public ControleText() {
        super("Textos e Senhas");

        textoLogin = new JTextField();
        textoSenha = new JPasswordField();

        ok = new JButton("Ok");
        ok.addActionListener(new botaoOkListener());

        cancel = new JButton("Cancel");
        cancel.addActionListener(new botaoCancelListener());

        login = new JLabel("Login:");
        senha = new JLabel("Senha:");

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2));
        c.add(login);
        c.add(textoLogin);
        c.add(senha);
        c.add(textoSenha);
        c.add(ok);
        c.add(cancel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ControleText();

    }

    class botaoOkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Clicou no botão Ok.");

            String s = "Login: " + textoLogin.getText() + " \nSenha: " + new String(textoSenha.getPassword());
            JOptionPane.showMessageDialog(null, s);


        }
    }

    class botaoCancelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            textoSenha.setText("");
            textoLogin.setText("");

            System.out.println("Clicou no botão Cancel.");

        }
    }


}
