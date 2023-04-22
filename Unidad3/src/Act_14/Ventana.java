package Act_14;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private char[] turno = {'X','O'};
	private char[][] casillasSeleccionadas ={ {' ',' ',' '},
											  {' ',' ',' '},
											  {' ',' ',' '} };
	private int turnoNum = 0; //0 = X && 1 = O
	private int vicX = 0;
	private int vicO = 0;
	private boolean finRonda = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Gato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(255, 128, 128));
		panelPrincipal.setBounds(0, 0, 483, 461);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel etiqueX = new JLabel("X: "+vicX, JLabel.CENTER);
		etiqueX.setBackground(new Color(255, 255, 128));
		etiqueX.setOpaque(true);
		etiqueX.setFont(new Font("Rockwell", Font.PLAIN, 15));
		etiqueX.setBounds(10, 11, 205, 25);
		panelPrincipal.add(etiqueX);
		
		JLabel etiqueO = new JLabel("O: "+vicO);
		etiqueO.setOpaque(true);
		etiqueO.setBackground(new Color(255, 255, 128));
		etiqueO.setFont(new Font("Rockwell", Font.PLAIN, 15));
		etiqueO.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueO.setBounds(268, 11, 205, 25);
		panelPrincipal.add(etiqueO);
		
		JLabel etiqueTurno = new JLabel("Turno de: X");
		etiqueTurno.setFont(new Font("Rockwell", Font.BOLD, 15));
		etiqueTurno.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueTurno.setBounds(10, 47, 463, 25);
		panelPrincipal.add(etiqueTurno);
		
		JButton btnReiniciar = new JButton("R E I N I C I A R");
		btnReiniciar.setBackground(new Color(128, 255, 128));
		btnReiniciar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnReiniciar.setBounds(10, 416, 463, 34);
		panelPrincipal.add(btnReiniciar);
		
		JPanel panelbtnJuego = new JPanel();
		panelbtnJuego.setBackground(new Color(255, 0, 0));
		panelbtnJuego.setBounds(10, 72, 463, 333);
		panelPrincipal.add(panelbtnJuego);
		panelbtnJuego.setLayout(new GridLayout(0, 3, 3, 0));
		
		JButton btn1_1 = new JButton("");
		panelbtnJuego.add(btn1_1);
		
		JButton btn1_2 = new JButton("");
		panelbtnJuego.add(btn1_2);
		
		JButton btn1_3 = new JButton("");
		panelbtnJuego.add(btn1_3);
		
		JButton btn2_1 = new JButton("");
		panelbtnJuego.add(btn2_1);
		
		JButton btn2_2 = new JButton("");
		panelbtnJuego.add(btn2_2);
		
		JButton btn2_3 = new JButton("");
		panelbtnJuego.add(btn2_3);
		
		JButton btn3_1 = new JButton("");
		panelbtnJuego.add(btn3_1);
		
		JButton btn3_2 = new JButton("");
		panelbtnJuego.add(btn3_2);
		
		JButton btn3_3 = new JButton("");
		panelbtnJuego.add(btn3_3);
		
		btn1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(1,1) && !finRonda) {
					rellenarCasilla(1,1,btn1_1);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn1_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(1,2) && !finRonda) {
					rellenarCasilla(1,2,btn1_2);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn1_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(1,3) && !finRonda) {
					rellenarCasilla(1,3,btn1_3);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(2,1) && !finRonda) {
					rellenarCasilla(2,1,btn2_1);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn2_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(2,2) && !finRonda) {
					rellenarCasilla(2,2,btn2_2);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn2_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(2,3) && !finRonda) {
					rellenarCasilla(2,3,btn2_3);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn3_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(3,1) && !finRonda) {
					rellenarCasilla(3,1,btn3_1);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn3_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(3,2) && !finRonda) {
					rellenarCasilla(3,2,btn3_2);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		btn3_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isCasillaVacia(3,3) && !finRonda) {
					rellenarCasilla(3,3,btn3_3);
					
					//CAMBIAR LA ETIQUETA TURNO
					etiqueTurno.setText("Turno de: "+turno[turnoNum]);
				}
				actualizarDatosEnPantalla(etiqueX, etiqueO);
			}
		});
		
		//ACCION REINICIAR JUEGO
		btnReiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i=0;i<3;i++) {
					for (int o=0;o<3;o++) {
						casillasSeleccionadas[i][o]=' ';
					}
				}
				btn1_1.setText("");
				btn1_2.setText("");
				btn1_3.setText("");
				btn2_1.setText("");
				btn2_2.setText("");
				btn2_3.setText("");
				btn3_1.setText("");
				btn3_2.setText("");
				btn3_3.setText("");
				turnoNum=0;
				etiqueTurno.setText("Turno de: X");
				
				//MARCAR JUEGO COMO INICIADO
				buscarJugadaGanadora();
			}
		});
		
		this.repaint();
		this.revalidate();
	}
	
	public void rellenarCasilla(int fila, int columna, JButton boton) {
		if (turnoNum==0) {
			casillasSeleccionadas[fila-1][columna-1]=turno[0];
			boton.setText("X");	
		}
		else {
			casillasSeleccionadas[fila-1][columna-1]=turno[1];
			boton.setText("O");
		}
		buscarJugadaGanadora();
		adminTurno();
	}
	
	public void adminTurno() {
		if (turnoNum==0)
			turnoNum=1;
		else
			turnoNum=0;
	}
	
	public boolean isCasillaVacia(int fila, int columna) {
		boolean resultado = true;
		
		if (casillasSeleccionadas[fila-1][columna-1]==' ')
			resultado = true;
		else
			resultado = false;
		
		return resultado;
	}
	
	public void buscarJugadaGanadora() {
		char buscadorDeTurno = (turnoNum==0)? 'X':'O';
		
		//COMPRUEBA FILAS
		if (casillasSeleccionadas[0][0]==buscadorDeTurno &&
			casillasSeleccionadas[0][1]==buscadorDeTurno &&
			casillasSeleccionadas[0][2]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		else if (casillasSeleccionadas[1][0]==buscadorDeTurno &&
			casillasSeleccionadas[1][1]==buscadorDeTurno &&
			casillasSeleccionadas[1][2]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		else if (casillasSeleccionadas[2][0]==buscadorDeTurno &&
			casillasSeleccionadas[2][1]==buscadorDeTurno &&
			casillasSeleccionadas[2][2]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		//COMPRUEBA COLUMNAS
		else if (casillasSeleccionadas[0][0]==buscadorDeTurno &&
			casillasSeleccionadas[1][0]==buscadorDeTurno &&
			casillasSeleccionadas[2][0]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		else if (casillasSeleccionadas[0][1]==buscadorDeTurno &&
			casillasSeleccionadas[1][1]==buscadorDeTurno &&
			casillasSeleccionadas[2][1]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		else if (casillasSeleccionadas[0][2]==buscadorDeTurno &&
			casillasSeleccionadas[1][2]==buscadorDeTurno &&
			casillasSeleccionadas[2][2]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		//COMPRUEBA DIAGONALMENTE
		else if (casillasSeleccionadas[0][0]==buscadorDeTurno &&
			casillasSeleccionadas[1][1]==buscadorDeTurno &&
			casillasSeleccionadas[2][2]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		
		else if(casillasSeleccionadas[0][2]==buscadorDeTurno &&
			casillasSeleccionadas[1][1]==buscadorDeTurno &&
			casillasSeleccionadas[2][0]==buscadorDeTurno) {
			JOptionPane.showMessageDialog(null,"¡¡El jugador "+buscadorDeTurno+" gano!!","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
			if (turnoNum==0)
				vicX+=1;
			else
				vicO+=1;
			finRonda = true;
		}
		else
			finRonda = false;
		
		int ocupado=0;
		for (int i=0;i<3;i++) {
			for (int o=0;o<3;o++) {
				if (casillasSeleccionadas[i][o]!=' ' && !finRonda)
					ocupado+=1;
			}
		}
		if (ocupado==9) {
			JOptionPane.showMessageDialog(null,"Empate, nadie gana puntos","Fin de la ronda",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public void actualizarDatosEnPantalla(JLabel puntX,JLabel puntO) {
		puntX.setText("X: "+vicX);
		puntO.setText("O: "+vicO);
	}
}
