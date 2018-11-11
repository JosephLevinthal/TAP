import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCadastroVeiculos {
	JFrame frame;
	private JTextField textField_Passageiros;
	private JTextField textField_Bagagem;
	private JTextField textField_Consumo;
	private JTextField textField_Preco;

	public TelaCadastroVeiculos() {
		
		//texto
		frame = new JFrame("Super Carros v1.1");
		frame.getContentPane().setLayout(null);
		frame.setSize(541, 559);
		
		JLabel lTitulo = new JLabel("Cadastro de novo Veículo");
		lTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lTitulo.setBounds(144, 21, 237, 20);
		lTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lTitulo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTipo.setBounds(24, 78, 46, 14);
		frame.getContentPane().add(lblTipo);
		
		JRadioButton rdbtnCompacto = new JRadioButton("Compacto");
		rdbtnCompacto.setBounds(24, 99, 88, 23);
		frame.getContentPane().add(rdbtnCompacto);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(24, 125, 84, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnGrande = new JRadioButton("Grande");
		rdbtnGrande.setBounds(24, 151, 75, 23);
		frame.getContentPane().add(rdbtnGrande);
		
		JRadioButton rdbtnEconmico = new JRadioButton("Econ\u00F4mico");
		rdbtnEconmico.setBounds(117, 99, 88, 23);
		frame.getContentPane().add(rdbtnEconmico);
		
		JRadioButton rdbtnPremium = new JRadioButton("Premium");
		rdbtnPremium.setBounds(116, 126, 78, 23);
		frame.getContentPane().add(rdbtnPremium);
		
		JRadioButton rdbtnMinivan = new JRadioButton("Minivan");
		rdbtnMinivan.setBounds(116, 152, 75, 23);
		frame.getContentPane().add(rdbtnMinivan);
		
		JLabel lblNmeroDePassageiros = new JLabel("N\u00FAmero de passageiros:");
		lblNmeroDePassageiros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNmeroDePassageiros.setBounds(25, 205, 180, 21);
		frame.getContentPane().add(lblNmeroDePassageiros);
		
		JLabel lblNewLabel = new JLabel("Bagagem (em L):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 257, 144, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField_Passageiros = new JTextField();
		textField_Passageiros.setColumns(10);
		textField_Passageiros.setBounds(24, 224, 55, 20);
		frame.getContentPane().add(textField_Passageiros);
		
		textField_Bagagem = new JTextField();
		textField_Bagagem.setColumns(10);
		textField_Bagagem.setBounds(24, 279, 55, 20);
		frame.getContentPane().add(textField_Bagagem);
		
		JLabel lblCmbio = new JLabel("C\u00E2mbio:");
		lblCmbio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCmbio.setBounds(24, 328, 62, 20);
		frame.getContentPane().add(lblCmbio);
		
		JRadioButton rdbtnManual = new JRadioButton("Manual");
		rdbtnManual.setBounds(24, 355, 75, 23);
		frame.getContentPane().add(rdbtnManual);
		
		JRadioButton rdbtnAutomtico = new JRadioButton("Autom\u00E1tico");
		rdbtnAutomtico.setBounds(101, 355, 94, 23);
		frame.getContentPane().add(rdbtnAutomtico);
		
		JLabel lblPossuiArcondicionado = new JLabel("Possui ar-condicionado?");
		lblPossuiArcondicionado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPossuiArcondicionado.setBounds(319, 327, 163, 23);
		frame.getContentPane().add(lblPossuiArcondicionado);
		
		JToggleButton tglbtnArCondicionado = new JToggleButton("Sim");
		tglbtnArCondicionado.setBounds(354, 355, 65, 23);
		frame.getContentPane().add(tglbtnArCondicionado);
		
		JLabel lblMdiaDeConsumo = new JLabel("M\u00E9dia de consumo:");
		lblMdiaDeConsumo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMdiaDeConsumo.setBounds(319, 200, 163, 31);
		frame.getContentPane().add(lblMdiaDeConsumo);
		
		textField_Consumo = new JTextField();
		textField_Consumo.setBounds(319, 224, 86, 20);
		frame.getContentPane().add(textField_Consumo);
		textField_Consumo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o/DIA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(319, 260, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_Preco = new JTextField();
		textField_Preco.setBounds(319, 279, 86, 20);
		frame.getContentPane().add(textField_Preco);
		textField_Preco.setColumns(10);
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.addActionListener(new ActionListener() {
			Veiculo veiculo = new Veiculo(0, 0, 0, 0, 0, 0, 0, 0);
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCompacto.isSelected()) {
					veiculo.tipo = 1;
				}
				if(rdbtnStandard.isSelected()) {
					veiculo.tipo = 2;
				}
				if(rdbtnGrande.isSelected()) {
					veiculo.tipo = 3;
				}
				if(rdbtnEconmico.isSelected()) {
					veiculo.tipo = 4;
				}
				if(rdbtnPremium.isSelected()) {
					veiculo.tipo = 5;
				}
				if(rdbtnMinivan.isSelected()) {
					veiculo.tipo = 6;
				}
				
				veiculo.nPassageiros = Integer.parseInt(textField_Passageiros.getText());
				veiculo.bagagem = Integer.parseInt(textField_Bagagem.getText());
				
				if(rdbtnManual.isSelected()) {
					veiculo.cambio = 0;
					}
				if(rdbtnAutomtico.isSelected()) {
					veiculo.cambio = 1;
				}
				
				veiculo.consumo = Integer.parseInt(textField_Consumo.getText());
				veiculo.preco = Integer.parseInt(textField_Preco.getText());
				
				if(tglbtnArCondicionado.isSelected()) {
					veiculo.possuiAr = 1;
				}
				
				JOptionPane.showMessageDialog(null, veiculo.getVeiculo());
				//frame.dispose();
			}
		});
		btnNewButton.setBounds(117, 441, 116, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblAcess = new JLabel("Acess\u00F3rios:");
		lblAcess.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAcess.setBounds(319, 75, 100, 20);
		frame.getContentPane().add(lblAcess);
		
		JCheckBox chckbxAirbag = new JCheckBox("AirBag");
		chckbxAirbag.setBounds(307, 99, 97, 23);
		frame.getContentPane().add(chckbxAirbag);
		
		JCheckBox chckbxFreiosAbs = new JCheckBox("Freios ABS");
		chckbxFreiosAbs.setBounds(307, 125, 97, 23);
		frame.getContentPane().add(chckbxFreiosAbs);
		
		JCheckBox chckbxDvd = new JCheckBox("DVD");
		chckbxDvd.setBounds(307, 151, 97, 23);
		frame.getContentPane().add(chckbxDvd);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancelar.setBounds(259, 441, 122, 44);
		frame.getContentPane().add(btnCancelar);
		
		
		/* Tentativa de lista
		 
		DefaultListModel model = new DefaultListModel();
	    JList list = new JList(model);
	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	    // Initialize the list with items
	    String[] items = { "A", "B", "C", "D" };
	    for (int i = 0; i < items.length; i++) {
	      model.add(i, items[i]);
	    }
	    list.setBounds(49, 90, 124, 99);
		frame.getContentPane().add(list);
	   */
			
	}
	
	public static void main(String args[]) {
		TelaCadastroVeiculos mainWindow = new TelaCadastroVeiculos();
		mainWindow.frame.setVisible(true);
	}
}