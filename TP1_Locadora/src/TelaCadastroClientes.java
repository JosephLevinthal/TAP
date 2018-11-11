import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class TelaCadastroClientes {
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public TelaCadastroClientes() {
		
		//texto
		frame = new JFrame("Super Carros v1.1");
		frame.getContentPane().setLayout(null);
		frame.setSize(470, 268);
		
		JLabel lTitulo = new JLabel("Cadastro de novo cliente");
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lTitulo.setBounds(96, 33, 260, 20);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lTitulo);
		
		textField = new JTextField();
		textField.setBounds(10, 87, 401, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 71, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIdade.setBounds(10, 129, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 145, 401, 20);
		frame.getContentPane().add(textField_1);
		
		
		//botoes
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(171, 195, 106, 23);
		frame.getContentPane().add(btnConfirmar);
		
		
		
		//listeners
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente(textField.getText(), Integer.parseInt(textField_1.getText()));
				JOptionPane.showMessageDialog(null, cliente.getCliente());
				//frame.dispose();
				}      
			});
		
		
			
	}
	
	public static void main(String args[]) {
		TelaCadastroClientes mainWindow = new TelaCadastroClientes();
		mainWindow.frame.setVisible(true);
	}
}