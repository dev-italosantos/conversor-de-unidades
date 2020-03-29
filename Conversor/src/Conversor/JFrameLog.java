package Conversor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameLog extends JFrame{
private JLabel labelEmail;
private JLabel labelSenha;;
private JTextField textNome;
private JPasswordField textSenha;
private JButton buttonOk;
private JButton buttonCancelar;

public JFrameLog(){
	
labelEmail = new JLabel("Email");
labelSenha = new JLabel("Senha");

textNome = new JTextField(25);
textSenha = new JPasswordField(25);
textSenha.setEchoChar('*');
buttonOk = new JButton("OK");
buttonCancelar = new JButton("Cancelar");
Container pane = this.getContentPane();
pane.setLayout(new FlowLayout(FlowLayout.LEFT));

pane.add(labelEmail);
pane.add(textNome);
pane.add(labelSenha);
pane.add(textSenha);
pane.add(buttonOk);
pane.add(buttonCancelar);

buttonCancelar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonCancelar) {
			dispose();
		}
	}
});

buttonOk.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOk) {
			Unidades un = new Unidades();
			dispose();
			un.escolherUnidade();
		}
	}
});

this.setTitle("Login");
//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(310, 180);
this.setResizable(false);
this.setVisible(true);
this.setLocationRelativeTo(null);
	}
public static void main(String args[]) {
	JFrameLog log = new JFrameLog();
}

}
