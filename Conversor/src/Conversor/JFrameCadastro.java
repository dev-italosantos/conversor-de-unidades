package Conversor;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrameCadastro extends JFrame {
	private JLabel labelNome;
	private JLabel labelSobreNome;
	private JLabel labelEmail;
	private JLabel labelSenha;
	private JLabel labelRepitaSenha;
	private JTextField textNome;
	private JTextField textSobreNome;
	private JTextField textEmail;
	private JPasswordField textSenha;
	private JPasswordField textRepitaSenha;
	private JButton buttonOk;
	private JButton buttonCancelar;
	
	public JFrameCadastro(){
		labelNome = new JLabel("Nome");
		labelSobreNome = new JLabel("Sobrenome");
		labelEmail = new JLabel("Email");
		labelSenha = new JLabel("Senha");
		labelRepitaSenha = new JLabel("Confimar Senha");
		
		textNome = new JTextField(25);
		textSobreNome = new JTextField(25);
		textEmail = new JTextField(25);
		textSenha = new JPasswordField(25);
		textRepitaSenha = new JPasswordField(25);
		textSenha.setEchoChar('*');
		buttonOk = new JButton("OK");
		buttonCancelar = new JButton("Cancelar");
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane.add(labelNome);
		pane.add(textNome);
		pane.add(labelSobreNome);
		pane.add(textSobreNome);
		pane.add(labelEmail);
		pane.add(textEmail);
		pane.add(labelSenha);
		pane.add(textSenha);
		pane.add(labelRepitaSenha);
		pane.add(textRepitaSenha);
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
				if (e.getSource() == buttonOk) {
					JFrameLog login = new JFrameLog();
					dispose();
				}
			}
		});
		
		this.setTitle("Cadastro");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(310, 295);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
}
	public static void main(String[] args) {
		JFrameCadastro Cadastro = new JFrameCadastro();
	}
}