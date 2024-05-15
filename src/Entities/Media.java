package Entities;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Media extends JFrame{
	private JTextField texto01;
	private JTextField texto02;
	private JTextField texto03;
	JTextArea areatexto;

	
	public Media(){
		setVisible(true);
		setSize(1500,1500);
		setTitle("media");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	
		JTextField texto01 = new JTextField("nota01");
		texto01.setPreferredSize(new Dimension(20, 20));
		
		
		JTextField texto02 = new JTextField("nota02");
		texto02.setPreferredSize(new Dimension(20, 20));
		
		JTextField texto03 = new JTextField("nota03");
		texto03.setPreferredSize(new Dimension(20, 20));
		
		
		add(texto01);
		add(texto02);
		add(texto03);
		
		
		JButton botao = new JButton("calcular Media");
		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer notas01 = Integer.parseInt(texto01.getText());  
				Integer notas02 = Integer.parseInt(texto02.getText());;
				Integer notas03 = Integer.parseInt(texto03.getText());
				
				double media = (notas01 + notas02 + notas03) / 3;
				
				String mensagem = "primeira nota: " + notas01 + "\nsegunda nota: " + notas02 + "\nTerceira nota: " + notas03;
		
				areatexto.setText(mensagem);
				
				
				}
		
		});
		JTextArea areatexto = new JTextArea("resultado");
		areatexto.getText();

		
		
		
		
		Container containerpane = this.getContentPane();
		
		GroupLayout layout = new GroupLayout(containerpane);
		containerpane.setLayout(layout);
		
		layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
				.addComponent(texto01)
				.addComponent(texto02)
				.addComponent(texto03)
				.addComponent(botao)
				.addComponent(areatexto)
				
				);
		
		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE))
				.addComponent(texto01)
				.addComponent(texto02)
				.addComponent(texto03)
				.addComponent(botao)
				.addComponent(areatexto)
				);
		
	}
	
	

}


