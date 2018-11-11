import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControleDeClientes {
	JFrame frame;

	public ControleDeClientes() {
		
		//texto
		frame = new JFrame("Super Carros v1.1");
		frame.getContentPane().setLayout(null);
		frame.setSize(500, 400);
		
		JLabel lTitulo = new JLabel("Controle de clientes");
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lTitulo.setBounds(102, 34, 260, 20);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lTitulo);
		
		JLabel lDesc = new JLabel("Gerencie seus clientes");
		lDesc.setBounds(102, 62, 260, 20);
		lDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lDesc.setFont(new Font("Dialog", Font.ITALIC, 12));
		frame.getContentPane().add(lDesc);
		
		//botoes
		JButton bCadastrar = new JButton("Cadastrar");
		bCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bCadastrar.setBounds(128, 105, 220, 54);
		frame.getContentPane().add(bCadastrar);
		
		JButton bRel = new JButton("Remover");
		bRel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverCliente managerWindow = new RemoverCliente();
				managerWindow.frame.setVisible(true);
			}
		});
		bRel.setBounds(128, 170, 220, 54);
		frame.getContentPane().add(bRel);
		
		JButton bSobre = new JButton("Alterar");
		bSobre.setBounds(128, 233, 220, 54);
		frame.getContentPane().add(bSobre);
		
		JLabel lblJosephLevinthal = new JLabel("Joseph Levinthal");
		lblJosephLevinthal.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosephLevinthal.setFont(new Font("Dialog", Font.ITALIC, 8));
		lblJosephLevinthal.setBounds(406, 330, 78, 20);
		frame.getContentPane().add(lblJosephLevinthal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnVoltar.setBounds(0, 338, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		//listeners
		bCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroClientes managerWindow = new TelaCadastroClientes();
				managerWindow.frame.setVisible(true);    
				}      
			});
		
		
			
	}
	
	public static void main(String args[]) {
		ControleDeClientes mainWindow = new ControleDeClientes();
		mainWindow.frame.setVisible(true);
	}
}