package Conversor;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Janela  implements ActionListener {
	JFrame janela = new JFrame("Conversão de Medidas");
	JLabel label = new JLabel("Hellor affsdfsdfdf", JLabel.CENTER);
	JButton jb = new JButton("login");
	JButton jb2 = new JButton("Cadastro");
	JButton jb3 = new JButton("Sair");
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jb) {
			JFrameLog log = new JFrameLog();
			
		}
		if(e.getSource() == jb3) {
			System.exit(0);
		}
		if(e.getSource() == jb2) {
			JFrameCadastro cadastro = new JFrameCadastro(); 
			
		}
	}
	
	public void Janela() {

		JPanel painelImagem = new JPanel();
		try {
			BufferedImage imagem = ImageIO.read(new File("D:\\arquivosNalyson\\testegrafico\\converso.jpeg"));
			JLabel labelImagem = new JLabel(new ImageIcon(imagem));
			painelImagem.add(labelImagem);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		label.setAlignmentX(0);
		label.setAlignmentY(0);
		janela.add(label);
		
		janela.setVisible(true);
		janela.setResizable(false);
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.add(painelImagem);
		p.add(jb);
		p.add(jb2);
		p.add(jb3);
		janela.add(p);
		janela.pack();
		janela.setLocationRelativeTo(null);
	}		
}
