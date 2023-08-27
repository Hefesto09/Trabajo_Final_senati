package pTrabajoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frmTrabajoFinal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtcantamox;
	
	double subtotamox, subtotpeni, subtotantal, subtotibu;
	double descuento, imporparcial, totpago;
	int cantamox, cantpeni, cantibu, cantantal;
	private JTextField txtcantibu;
	private JTextField txtcantantal;
	private JTextField txtcantpeni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTrabajoFinal frame = new frmTrabajoFinal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTrabajoFinal() {
		setBackground(new Color(153, 204, 255));
		setTitle("Factura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FACTURA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(62, 11, 360, 42);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 64, 429, 31);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"S/N", "Descripcion", "Pre_unitario", "Cantidad", "Sub_total"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(61);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JCheckBox chckbxamox = new JCheckBox("AMOXILINA");
		chckbxamox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxamox.setBounds(38, 109, 131, 23);
		contentPane.add(chckbxamox);
		 chckbxamox.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	//seleccion de amoxilina
	                if (chckbxamox.isSelected()) {
	                    txtcantamox.requestFocus();
	                }
	                
	            }
	        });
		
		JCheckBox chckbxibu = new JCheckBox("IBUPROFENO");
		chckbxibu.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxibu.setBounds(38, 145, 131, 23);
		contentPane.add(chckbxibu);
		chckbxibu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//seleccion de ibuprofeno
                if (chckbxibu.isSelected()) {
                    txtcantibu.requestFocus();
                }
            }
        });
		
		JCheckBox chckbxantal = new JCheckBox("ANTALGINA");
		chckbxantal.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxantal.setBounds(38, 177, 131, 23);
		contentPane.add(chckbxantal);
		chckbxantal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//seleccion de antalgina
                if (chckbxantal.isSelected()) {
                    txtcantantal.requestFocus();
                }
            }
        });
		
		JCheckBox chckbxpeni = new JCheckBox("PENICILINA");
		chckbxpeni.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxpeni.setBounds(38, 213, 131, 23);
		contentPane.add(chckbxpeni);
		chckbxpeni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//seleccion de penicilina
                if (chckbxpeni.isSelected()) {
                    txtcantpeni.requestFocus();
                }
            }
        });
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("80.00");
		textField.setBounds(203, 110, 60, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("50.00");
		textField_1.setColumns(10);
		textField_1.setBounds(203, 146, 60, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setText("65.00");
		textField_2.setColumns(10);
		textField_2.setBounds(203, 178, 60, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("40.00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(203, 214, 60, 20);
		contentPane.add(textField_3);
		
		txtcantamox = new JTextField();
		txtcantamox.setBounds(293, 110, 60, 20);
		contentPane.add(txtcantamox);
		txtcantamox.setColumns(10);
		
		txtcantibu = new JTextField();
		txtcantibu.setColumns(10);
		txtcantibu.setBounds(293, 146, 60, 20);
		contentPane.add(txtcantibu);
		
		txtcantantal = new JTextField();
		txtcantantal.setColumns(10);
		txtcantantal.setBounds(293, 178, 60, 20);
		contentPane.add(txtcantantal);
		
		txtcantpeni = new JTextField();
		txtcantpeni.setColumns(10);
		txtcantpeni.setBounds(293, 214, 60, 20);
		contentPane.add(txtcantpeni);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(383, 143, 68, 25);
		contentPane.add(scrollPane_2);
		
		JTextArea txtsubtotibu = new JTextArea();
		scrollPane_2.setViewportView(txtsubtotibu);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(383, 107, 68, 25);
		contentPane.add(scrollPane_2_1);
		
		JTextArea txtsubtotamox = new JTextArea();
		scrollPane_2_1.setViewportView(txtsubtotamox);
		
		JScrollPane scrollPane_2_2 = new JScrollPane();
		scrollPane_2_2.setBounds(383, 175, 68, 25);
		contentPane.add(scrollPane_2_2);
		
		JTextArea txtsubtotantal = new JTextArea();
		scrollPane_2_2.setViewportView(txtsubtotantal);
		
		JScrollPane scrollPane_2_3 = new JScrollPane();
		scrollPane_2_3.setBounds(383, 211, 68, 25);
		contentPane.add(scrollPane_2_3);
		
		JTextArea txtsubtotpeni = new JTextArea();
		scrollPane_2_3.setViewportView(txtsubtotpeni);
		
		JLabel lblNewLabel_1 = new JLabel("Importe parcial");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(25, 263, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descuentos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(25, 303, 80, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total a pagar");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(25, 341, 80, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane_2_1_1 = new JScrollPane();
		scrollPane_2_1_1.setBounds(115, 263, 68, 25);
		contentPane.add(scrollPane_2_1_1);
		
		JTextArea txtimporparcial = new JTextArea();
		scrollPane_2_1_1.setViewportView(txtimporparcial);
		
		JScrollPane scrollPane_2_1_2 = new JScrollPane();
		scrollPane_2_1_2.setBounds(115, 299, 68, 25);
		contentPane.add(scrollPane_2_1_2);
		
		JTextArea txtdescuento = new JTextArea();
		scrollPane_2_1_2.setViewportView(txtdescuento);
		
		JScrollPane scrollPane_2_1_3 = new JScrollPane();
		scrollPane_2_1_3.setBounds(115, 330, 68, 25);
		contentPane.add(scrollPane_2_1_3);
		
		JTextArea txttotpago = new JTextArea();
		scrollPane_2_1_3.setViewportView(txttotpago);
		
		JButton btnproceso = new JButton("Procesar");
		btnproceso.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnproceso.setBackground(new Color(143, 188, 143));
		btnproceso.setBounds(210, 265, 89, 52);
		contentPane.add(btnproceso);
		
		JButton btnnuevo = new JButton("Nuevo");
		btnnuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Limpiar los campos de entrada y resultados
		        chckbxamox.setSelected(false);
		        chckbxibu.setSelected(false);
		        chckbxantal.setSelected(false);
		        chckbxpeni.setSelected(false);
		        
		        txtcantamox.setText("");
		        txtcantibu.setText("");
		        txtcantantal.setText("");
		        txtcantpeni.setText("");
		        
		        txtsubtotamox.setText("");
		        txtsubtotpeni.setText("");
		        txtsubtotantal.setText("");
		        txtsubtotibu.setText("");
		        txtimporparcial.setText("");
		        txtdescuento.setText("");
		        txttotpago.setText("");
		        
			}
		});
		btnnuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnnuevo.setBackground(new Color(218, 165, 32));
		btnnuevo.setBounds(309, 265, 89, 52);
		contentPane.add(btnnuevo);
		
		JButton btnsalir = new JButton("Salir");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Salir
				System.exit(0);
			}
		});
		btnsalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnsalir.setBackground(new Color(255, 102, 51));
		btnsalir.setBounds(264, 332, 89, 23);
		contentPane.add(btnsalir);
		btnproceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Calcular subtotales y sumarlos para el Importe Parcial
            	
            	if(chckbxamox.isSelected()) {
            		subtotamox = 80.00 * Double.parseDouble(txtcantamox.getText());
            	}
            	else
            		subtotamox = 0.00 * Double.parseDouble(txtcantamox.getText());
            	
            	if(chckbxibu.isSelected()) {
            		subtotibu = 50.00 * Double.parseDouble(txtcantibu.getText());
            	}
            	else
            		subtotibu = 0.00 * Double.parseDouble(txtcantibu.getText());
            	
            	if(chckbxantal.isSelected()) {
            		subtotantal = 65.00 * Double.parseDouble(txtcantantal.getText());
            	}
            	else
            		subtotantal = 0.00 * Double.parseDouble(txtcantantal.getText());
            	
            	if (chckbxpeni.isSelected()) {
            		subtotpeni = 40.00 * Double.parseDouble(txtcantpeni.getText());
            	}
            	else
            		subtotpeni = 0.00 * Double.parseDouble(txtcantpeni.getText());
                
                
                
                imporparcial = subtotamox + subtotpeni + subtotantal + subtotibu;

                // Calcular descuento
                if (imporparcial < 50) {
                    descuento = 0;
                } else if (imporparcial <= 200) {
                    descuento = imporparcial * 0.08;
                } else if (imporparcial <= 250) {
                    descuento = imporparcial * 0.10;
                } else if (imporparcial <= 300) {
                    descuento = imporparcial * 0.15;
                } else {
                    descuento = imporparcial * 0.20;
                }

                // Calcular total a pagar
                totpago = imporparcial - descuento;

                // Mostrar resultados correspondientes
                txtsubtotamox.setText(String.valueOf(subtotamox));
                txtsubtotpeni.setText(String.valueOf(subtotpeni));
                txtsubtotantal.setText(String.valueOf(subtotantal));
                txtsubtotibu.setText(String.valueOf(subtotibu));
                txtimporparcial.setText(String.valueOf(imporparcial));
                txtdescuento.setText(String.valueOf(descuento));
                txttotpago.setText(String.valueOf(totpago));
            }
        });
	}

}
