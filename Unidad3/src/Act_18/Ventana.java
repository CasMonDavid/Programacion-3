package Act_18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	private String numerosJuego[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"," "};
	private String numerosResueltos[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"," "};
	private boolean finDelJuego=false;
	
	List<String> lista = Arrays.asList(numerosJuego);	
	List<String> listaResuelta = Arrays.asList(numerosResueltos);
	
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btnReiniciar;
	
	public Ventana() {
		this.setSize(600,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Rompecabezas numerico - Menor a mayor");
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBackground(Color.darkGray);
		this.add(panelPrincipal);
		
		JPanel panelJuego = new JPanel();
		panelJuego.setVisible(true);
		panelJuego.setOpaque(true);
		panelJuego.setLayout(new GridLayout(4,4));
		panelJuego.setBackground(Color.orange);
		panelPrincipal.add(panelJuego,BorderLayout.CENTER);
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(Color.orange);
		panelPrincipal.add(panelArriba,BorderLayout.NORTH);
		
		JPanel panelderecha = new JPanel();
		panelderecha.setBackground(Color.orange);
		panelPrincipal.add(panelderecha,BorderLayout.WEST);
		
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setBackground(Color.orange);
		panelPrincipal.add(panelIzquierda,BorderLayout.EAST);
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.orange);
		panelPrincipal.add(panelAbajo,BorderLayout.SOUTH);
		
		Collections.shuffle(lista);
		
		btn1 = new JButton(lista.get(0));
		btn1.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn1);
		
		btn2 = new JButton(lista.get(1));
		btn2.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn2);
		
		btn3 = new JButton(lista.get(2));
		btn3.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn3);
		
		btn4 = new JButton(lista.get(3));
		btn4.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn4);
		
		btn5 = new JButton(lista.get(4));
		btn5.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn5);
		
		btn6 = new JButton(lista.get(5));
		btn6.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn6);
		
		btn7 = new JButton(lista.get(6));
		btn7.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn7);
		
		btn8 = new JButton(lista.get(7));
		btn8.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn8);
		
		btn9 = new JButton(lista.get(8));
		btn9.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn9);
		
		btn10 = new JButton(lista.get(9));
		btn10.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn10);
		
		btn11 = new JButton(lista.get(10));
		btn11.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn11);
		
		btn12 = new JButton(lista.get(11));
		btn12.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn12);
		
		btn13 = new JButton(lista.get(12));
		btn13.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn13);
		
		btn14 = new JButton(lista.get(13));
		btn14.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn14);
		
		btn15 = new JButton(lista.get(14));
		btn15.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn15);
		
		btn16 = new JButton(lista.get(15));
		btn16.setFont(new Font("Arial Bold",Font.PLAIN,50));
		panelJuego.add(btn16);
		
		btnReiniciar = new JButton("R E I N I C I A R");
		panelAbajo.add(btnReiniciar);
		
		//BOTONES DEL TABLERO
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn1);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn2);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn3);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn4);
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn5);
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn6);
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn7);
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn8);
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn9);
			}
		});
		
		btn10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn10);
			}
		});
		
		btn11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn11);
			}
		});
		
		btn12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn12);
			}
		});
		
		btn13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn13);
			}
		});
		
		btn14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn14);
			}
		});
		
		btn15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn15);
			}
		});
		
		btn16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				moverFicha(btn16);
			}
		});
		
		//BOTONES REINICIAR
		btnReiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.shuffle(lista);
				
				finDelJuego=false;
				
				btn1.setText(lista.get(0));
				btn2.setText(lista.get(1));
				btn3.setText(lista.get(2));
				btn4.setText(lista.get(3));
				btn5.setText(lista.get(4));
				btn6.setText(lista.get(5));
				btn7.setText(lista.get(6));
				btn8.setText(lista.get(7));
				btn9.setText(lista.get(8));
				btn10.setText(lista.get(9));
				btn11.setText(lista.get(10));
				btn12.setText(lista.get(11));
				btn13.setText(lista.get(12));
				btn14.setText(lista.get(13));
				btn15.setText(lista.get(14));
				btn16.setText(lista.get(15));
			}
		});
		
		this.repaint();
		this.revalidate();
	}
	
	public String[][] construirTablero() {
		String[][] tablero = new String[4][4];
		
		int selecLista=0;
		for (int i=0;i<4;i++) {
			for (int o=0;o<4;o++) {
				tablero[i][o] = lista.get(selecLista);
				selecLista++;
			}
		}
		selecLista=0;
		
		return tablero;
	}
	
	public int[] encontrarPosicion(JButton btn) {
		int[] selecPosicion = new int[2];
		String buscar = btn.getText();
		String[][] tablero = construirTablero();
		
		for (int i=0;i<4;i++) {
			for(int o=0;o<4;o++) {
				if (buscar.equals(tablero[i][o])) {
					selecPosicion[0] = i;
					selecPosicion[1] = o;
				}
			}
		}
		
		
		return selecPosicion;
	}
	
	public void moverFicha(JButton btn) {
		if (!finDelJuego) {
			int[] posi = encontrarPosicion(btn); 
			String[][] tablero = construirTablero();
			
			if ((posi[0]-1)>=0 &&
					tablero[posi[0]-1][posi[1]].equals(" ")) {// SEGUN CUADRO BLANCO -> ARRIBA 
			
				tablero[posi[0]-1][posi[1]] = btn.getText();
				tablero[posi[0]][posi[1]] = " ";
			
				actualizarTablero(tablero);
			}
		
			if ((posi[0]+1)<=3 &&
					tablero[posi[0]+1][posi[1]].equals(" ")) {//SEGUN CUADRO BLANCO -> ABAJO
			
				tablero[posi[0]+1][posi[1]] = btn.getText();
				tablero[posi[0]][posi[1]] = " ";
			
				actualizarTablero(tablero);
			}
		
			if ((posi[1]-1)>=0 &&
					tablero[posi[0]][posi[1]-1].equals(" ")) {//SEGUN CUADRO BLANCO -> IZQUIERDA
			
				tablero[posi[0]][posi[1]-1] = btn.getText();
				tablero[posi[0]][posi[1]] = " ";
			
				actualizarTablero(tablero); 
			}
		
			if ((posi[1]+1)<=3 &&
					tablero[posi[0]][posi[1]+1].equals(" ")) {//SEGUN CUADRO BLANCO -> DERECHA
			
				tablero[posi[0]][posi[1]+1] = btn.getText();
				tablero[posi[0]][posi[1]] = " ";
				
				actualizarTablero(tablero); 
			}
		}
	}
	
	public void actualizarTablero(String[][] tablero) {
		
		int contTemp=0;
		for (int i=0;i<4;i++) {
			for (int o=0;o<4;o++) {
				lista.set(contTemp,tablero[i][o]);
				contTemp++;
			}
		}
		contTemp=0;
		
		btn1.setText(lista.get(0));
		btn2.setText(lista.get(1));
		btn3.setText(lista.get(2));
		btn4.setText(lista.get(3));
		btn5.setText(lista.get(4));
		btn6.setText(lista.get(5));
		btn7.setText(lista.get(6));
		btn8.setText(lista.get(7));
		btn9.setText(lista.get(8));
		btn10.setText(lista.get(9));
		btn11.setText(lista.get(10));
		btn12.setText(lista.get(11));
		btn13.setText(lista.get(12));
		btn14.setText(lista.get(13));
		btn15.setText(lista.get(14));
		btn16.setText(lista.get(15));
		
		if (esGanador()) {
			JOptionPane.showMessageDialog(null,"¡¡Ha ganado!!","Fin del juego",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public boolean esGanador() {
		boolean resultado=false;
		
		int contador=0;
		for(int i=0;i<16;i++) {
			if (lista.get(i).equals(listaResuelta.get(i))) {
				contador++;
			}
		}
		
		if (contador==16) {
			resultado=true;
			finDelJuego = true;
		}
		
		return resultado;
	}

} 
