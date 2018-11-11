import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaPrincipal {
	private JFrame frame;

	public TelaPrincipal() {
		
		//texto
		frame = new JFrame("Super Carros v1.1");
		frame.getContentPane().setLayout(null);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lTitulo = new JLabel("Super Carros");
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lTitulo.setBounds(102, 34, 260, 20);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lTitulo);
		
		JLabel lDesc = new JLabel("Sistema de Locação de Veículos");
		lDesc.setBounds(102, 62, 260, 20);
		lDesc.setHorizontalAlignment(SwingConstants.CENTER);
		lDesc.setFont(new Font("Dialog", Font.ITALIC, 12));
		frame.getContentPane().add(lDesc);
		
		//botoes
		JButton bVeiculos = new JButton("Veiculos");
		bVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleDeVeiculos managerWindow = new ControleDeVeiculos();
				managerWindow.frame.setVisible(true);
			}
		});
		bVeiculos.setBounds(128, 168, 220, 54);
		frame.getContentPane().add(bVeiculos);
		
		JButton bClientes = new JButton("Clientes");
		bClientes.setBounds(128, 103, 220, 54);
		frame.getContentPane().add(bClientes);
		
		JButton bSobre = new JButton("Sobre");
		bSobre.setBackground(Color.LIGHT_GRAY);
		bSobre.setForeground(Color.BLACK);
		bSobre.setBounds(178, 310, 122, 40);
		frame.getContentPane().add(bSobre);
		
		JLabel lblJosephLevinthal = new JLabel("Joseph Levinthal");
		lblJosephLevinthal.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosephLevinthal.setFont(new Font("Dialog", Font.ITALIC, 8));
		lblJosephLevinthal.setBounds(406, 330, 78, 20);
		frame.getContentPane().add(lblJosephLevinthal);
		
		//listeners
		bSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sistema de locação de veículos Super Carros"
						+ " (2018 - 2018).");
				}  
			});
		
		bClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleDeClientes managerWindow = new ControleDeClientes();
				managerWindow.frame.setVisible(true);    
				}      
			}); 
		
		
		
		
		
	}
	
	public static void main(String args[]) {
		TelaPrincipal mainWindow = new TelaPrincipal();
		mainWindow.frame.setVisible(true);
	}
}