import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RemoverCliente {
	JFrame frame;

	public RemoverCliente() {
		
		//texto
		frame = new JFrame("Super Carros v1.1");
		frame.getContentPane().setLayout(null);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lTitulo = new JLabel("Remover Clientes");
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lTitulo.setBounds(102, 34, 260, 20);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lTitulo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				}
		});
		btnVoltar.setBounds(0, 338, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		//JOptionPane.showMessageDialog(null, "oi");

		
		
		
		
	}
	
	public static void main(String args[]) {
		RemoverCliente mainWindow = new RemoverCliente();
		mainWindow.frame.setVisible(true);
	}
}