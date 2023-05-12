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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	private File archivo;

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

		archivo = new File("users_Formulario.txt");
		try {
			crearDocumentoTxt();
		} catch (IOException e) {
			System.err.println("No se pudo crear el documento txt "+e);
		}
		
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
					if (!verifNombre()) {
						if (!verifApellido()) {
							if (!verifEmpresaInstitu()) {
								if (!verifCargo()) {
									if (!verifNombreUsuario()) {
										if (!verifContrasena()) {
											if (!verifReContrasena()) {
												if (!verifCorreo()) {
													
													if (esIgualContrasenas()) {
														try {
															ingresarDatos(cbox_ambitos);
															JOptionPane.showMessageDialog(null,"Sus datos se registraron exitosamente","Success",JOptionPane.INFORMATION_MESSAGE);
														} catch (IOException e1) {
															System.err.println("No se guardaron los datos de forma correcta");
														}
														
													}else {
														JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","Error al registrar",JOptionPane.ERROR_MESSAGE);
													}
													
												}else {
													JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_correo.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
													throw new CaracterProhibidoExeption(lbl_correo.getText());
												}
											}else {
												JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_contra_1.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
												throw new CaracterProhibidoExeption(lbl_contra_1.getText());
											}
										}else {
											JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_contra.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
											throw new CaracterProhibidoExeption(lbl_contra.getText());
										}
									}else {
										JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_nombreusuario.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
										throw new CaracterProhibidoExeption(lbl_nombreusuario.getText());
									}
								}else {
									JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_cargo.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
									throw new CaracterProhibidoExeption(lbl_cargo.getText());
								}
							}else {
								JOptionPane.showMessageDialog(null,"Se detectaron caracteres no permitidos en la seccion: ["+lbl_empreInst.getText()+"]","Error al registrar",JOptionPane.ERROR_MESSAGE);
								throw new CaracterProhibidoExeption(lbl_empreInst.getText());
							}
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
		
		repaint();
		revalidate();
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
	
	public boolean verifEmpresaInstitu() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList('|','°','¬','!','"','#','$','%','&','/','(',')','=','?','¡','¿','+','*','~','´','¨',
																		'{','}','[',']','^','`','<','>',',',';','.',':','-','_'));
		for (int i=0;i<ingre_empreIns.getText().length();i++) {
			char caracterActual = ingre_empreIns.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifCargo() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9','|','°','¬','!','"','#','$','%','&','/',
																		'(',')','=','?','¡','¿','+','*','~','´','¨','{','}','[',']','^','`','<','>',',',';',
																		'.',':','-','_'));
		for (int i=0;i<ingre_cargo.getText().length();i++) {
			char caracterActual = ingre_cargo.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifNombreUsuario() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList('|','°','¬','!','"','#','$','%','&','/','(',')','=','?','¡','¿','+','*','~','´','¨',
																		'{','}','[',']','^','`','<','>',',',';','.',':','-','_'));
		for (int i=0;i<ingre_nomusua.getText().length();i++) {
			char caracterActual = ingre_nomusua.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifContrasena() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList(' '));
		String contrasena = new String(ingre_contra.getPassword());
		
		for (int i=0;i<contrasena.length();i++) {
			char caracterActual = contrasena.charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifReContrasena() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList(' '));
		String contrasena = new String(ingre_recontra.getPassword());
		
		for (int i=0;i<contrasena.length();i++) {
			char caracterActual = contrasena.charAt(i);
			if (caracteresProhibidos.contains(caracterActual)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public boolean verifCorreo() {
		boolean resultado = false;
		Set<Character> caracteresProhibidos = new HashSet<>(Arrays.asList(' '));
		
		for (int i=0;i<ingre_correo.getText().length();i++) {
			char caracterActual = ingre_correo.getText().charAt(i);
			if (caracteresProhibidos.contains(caracterActual) || 
				ingre_correo.getText().contains("fakemail.com") || 
				ingre_correo.getText().contains("zzz.com") ||
				ingre_correo.getText().contains("zxo.us") ||
				ingre_correo.getText().contains("000000pay.com")) {
				resultado = true;
				System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
			}
		}
		
		return resultado;
	}
	
	public boolean esIgualContrasenas() {
		boolean resultado = false;
		String contra = new String(ingre_contra.getPassword());
		String contraRE = new String(ingre_recontra.getPassword());
		
		if (contra.equals(contraRE)) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public void crearDocumentoTxt() throws IOException {//CREA EL DOCUMENTO DE TEXTO SI NO EXISTE Y AGREGA UN USUARIO PREDIFINIDO
		if (!archivo.exists()) {
			
			try {
				archivo.createNewFile();
			}catch(Exception e) {}
		}
	}
	
	public void ingresarDatos(JComboBox<String> combo) throws IOException {
		FileWriter escritor;
		PrintWriter linea;
		
		if (archivo.exists()) {
			escritor = new FileWriter(archivo,true);
			linea = new PrintWriter(escritor);
			linea.println(ingre_nombre.getText()+"-"+ingre_apellidos.getText()+"-"+ingre_empreIns.getText()+"-"+combo.getSelectedItem().toString()+"-"+ingre_cargo.getText()+"-"+ingre_nomusua.getText()+"-"+new String(ingre_contra.getPassword())+"-"+ingre_correo.getText());
			linea.close();
			escritor.close();
		}
		
	}
	
	public class CaracterProhibidoExeption extends RuntimeException {

		public CaracterProhibidoExeption() {
			super("Se detectaron caracteres no permitidos");
		}
		
		public CaracterProhibidoExeption(String cadena) {
			super("Se detectaron caracteres no permitidos en "+cadena);
		}
		
	}
	
	public class VacioExeption extends RuntimeException {

		public VacioExeption() {
			super("Faltan elementos por llenar");
		}
		
	}
	
}
