package Act_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ventana_Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField ingre_nombre;
	private JTextField ingre_apellidos;
	private JTextField ingre_empreIns;
	private JTextField ingre_cargo;
	private JTextField ingre_nomusua;
	private JPasswordField ingre_contra;
	private JPasswordField ingre_recontra;
	private JTextField ingre_correo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Formulario frame = new Ventana_Formulario();
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
	public Ventana_Formulario() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(190, 241, 239));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_SubTitulo = new JLabel("Formulario de inscripción al sistema");
		lbl_SubTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(100, 63, 400, 50);
		contentPane.add(lbl_SubTitulo);
		
		JLabel lbl_titulo = new JLabel("Sistema de seguimiento a graduados del IAEN");
		lbl_titulo.setForeground(new Color(0, 0, 255));
		lbl_titulo.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setBounds(10, 11, 564, 41);
		contentPane.add(lbl_titulo);
		
		JLabel lbl_nombre = new JLabel("Nombre(s):");
		lbl_nombre.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_nombre.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombre.setBounds(10, 124, 100, 30);
		contentPane.add(lbl_nombre);
		
		ingre_nombre = new JTextField();
		ingre_nombre.setBounds(174, 124, 400, 30);
		contentPane.add(ingre_nombre);
		ingre_nombre.setColumns(10);
		
		JLabel lbl_apellidos = new JLabel("Apellidos:");
		lbl_apellidos.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_apellidos.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_apellidos.setBounds(10, 165, 100, 30);
		contentPane.add(lbl_apellidos);
		
		ingre_apellidos = new JTextField();
		ingre_apellidos.setColumns(10);
		ingre_apellidos.setBounds(174, 165, 400, 30);
		contentPane.add(ingre_apellidos);
		
		JLabel lbl_empreInst = new JLabel("Empresa/Institución:");
		lbl_empreInst.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_empreInst.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_empreInst.setBounds(10, 206, 157, 30);
		contentPane.add(lbl_empreInst);
		
		ingre_empreIns = new JTextField();
		ingre_empreIns.setColumns(10);
		ingre_empreIns.setBounds(174, 206, 400, 30);
		contentPane.add(ingre_empreIns);
		
		JLabel lbl_ambitoEmpresa = new JLabel("Ámbito de la empresa:");
		lbl_ambitoEmpresa.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_ambitoEmpresa.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_ambitoEmpresa.setBounds(10, 247, 157, 30);
		contentPane.add(lbl_ambitoEmpresa);
		
		JComboBox cbox_ambitos = new JComboBox();
		cbox_ambitos.setModel(new DefaultComboBoxModel(new String[] {"Educación", "Docente", "Administración"}));
		cbox_ambitos.setBounds(174, 247, 400, 30);
		contentPane.add(cbox_ambitos);
		
		JLabel lbl_cargo = new JLabel("Cargo:");
		lbl_cargo.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_cargo.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_cargo.setBounds(10, 288, 157, 30);
		contentPane.add(lbl_cargo);
		
		ingre_cargo = new JTextField();
		ingre_cargo.setColumns(10);
		ingre_cargo.setBounds(174, 288, 400, 30);
		contentPane.add(ingre_cargo);
		
		JLabel lbl_nombreusuario = new JLabel("Nombre de usuario:");
		lbl_nombreusuario.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_nombreusuario.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_nombreusuario.setBounds(10, 329, 157, 30);
		contentPane.add(lbl_nombreusuario);
		
		ingre_nomusua = new JTextField();
		ingre_nomusua.setColumns(10);
		ingre_nomusua.setBounds(174, 329, 200, 30);
		contentPane.add(ingre_nomusua);
		
		JLabel lbl_contra = new JLabel("Contraseña:");
		lbl_contra.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_contra.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_contra.setBounds(10, 370, 157, 30);
		contentPane.add(lbl_contra);
		
		ingre_contra = new JPasswordField();
		ingre_contra.setBounds(174, 370, 200, 30);
		contentPane.add(ingre_contra);
		
		JLabel lbl_contra_1 = new JLabel("Repita contraseña:");
		lbl_contra_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_contra_1.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_contra_1.setBounds(10, 411, 157, 30);
		contentPane.add(lbl_contra_1);
		
		ingre_recontra = new JPasswordField();
		ingre_recontra.setBounds(174, 411, 200, 30);
		contentPane.add(ingre_recontra);
		
		JLabel lbl_correo = new JLabel("Correo electronico:");
		lbl_correo.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_correo.setFont(new Font("Dubai Light", Font.BOLD, 15));
		lbl_correo.setBounds(10, 452, 157, 30);
		contentPane.add(lbl_correo);
		
		ingre_correo = new JTextField();
		ingre_correo.setColumns(10);
		ingre_correo.setBounds(174, 452, 200, 30);
		contentPane.add(ingre_correo);
		
		JCheckBox chbox_terminos = new JCheckBox("He leído y acepto los términos del sistema");
		chbox_terminos.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		chbox_terminos.setHorizontalAlignment(SwingConstants.CENTER);
		chbox_terminos.setBounds(150, 500, 300, 30);
		contentPane.add(chbox_terminos);
		
		JButton btn_enviar = new JButton("Enviar formulario");
		btn_enviar.setBackground(new Color(192, 192, 192));
		btn_enviar.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btn_enviar.setBounds(206, 563, 200, 30);
		contentPane.add(btn_enviar);
		
		JLabel lbl_SubTitulo_1 = new JLabel("(Nombre dentro de la empresa)");
		lbl_SubTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo_1.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 12));
		lbl_SubTitulo_1.setBounds(378, 333, 206, 20);
		contentPane.add(lbl_SubTitulo_1);
		
		JLabel lbl_SubTitulo_1_1 = new JLabel("(Recomendable utilizar");
		lbl_SubTitulo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo_1_1.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 12));
		lbl_SubTitulo_1_1.setBounds(384, 364, 206, 20);
		contentPane.add(lbl_SubTitulo_1_1);
		
		JLabel lbl_SubTitulo_1_1_1 = new JLabel("combinaciones alfanuméricos)");
		lbl_SubTitulo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.ITALIC, 12));
		lbl_SubTitulo_1_1_1.setBounds(384, 378, 206, 20);
		contentPane.add(lbl_SubTitulo_1_1_1);
		
		btn_enviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (verificarLlenado() && chbox_terminos.isSelected()) {
					System.out.println("PRIMER PASO BIEN");
					if (!verifNombre()) {
						System.out.println("SEGUNDO PASO BIEN");
						if (!verifApellido()) {
							System.out.println("TERCER PASO BIEN");
						}else {
							JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_apellidos.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
							throw new CaracterProhibidoExeption(lbl_apellidos.getText());
						}
					}else {
						JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_nombre.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
						throw new CaracterProhibidoExeption(lbl_nombre.getText());
					}
				}else {
					JOptionPane.showMessageDialog(null,"Todos los campos deben de ser llenados","Error al registrar",JOptionPane.ERROR_MESSAGE);
					throw new VacioExeption();
				}
				
			}
		});
		
	}
	
	public boolean verificarLlenado() {
		boolean resultado = false;
		
		if (ingre_nombre.getText().length()!=0 && 
			ingre_apellidos.getText().length()!=0 && 
			ingre_empreIns.getText().length()!=0 && 
			ingre_cargo.getText().length()!=0 && 
			ingre_nomusua.getText().length()!=0 && 
			ingre_contra.getPassword().length!=0 && 
			ingre_recontra.getPassword().length!=0 && 
			ingre_correo.getText().length()!=0 ) {
			resultado=true;
		}
		
		return resultado;
	}
	
	public boolean verifNombre() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9','|','°','¬','!','"','#','$','%','&','/',
																		'(',')','=','?','¡','¿','+','*','~','´','¨','{','}','[',']','^','`','<','>',',',';',
																		'.',':','-','_'));
		for (int i=0;i<ingre_nombre.getText().length();i++) {
			char caracterActual = ingre_nombre.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifApellido() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9','|','°','¬','!','"','#','$','%','&','/',
																		'(',')','=','?','¡','¿','+','*','~','´','¨','{','}','[',']','^','`','<','>',',',';',
																		'.',':','-','_'));
		for (int i=0;i<ingre_apellidos.getText().length();i++) {
			char caracterActual = ingre_apellidos.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
}
