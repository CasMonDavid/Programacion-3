package Act_21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ventana extends JFrame implements Runnable {
	
	private int posi_x;
	private int posi_y;
	public JPanel principal, panelJuego, panelAbajo;
	public JButton btnReiniciar;

	public Ventana() {
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Laberinto");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		principal = new JPanel();
		principal.setBackground(Color.white);
		principal.setLayout(new BorderLayout());
		this.add(principal);
		
		panelJuego = new JPanel();
		panelJuego.setBackground(Color.gray);
		principal.add(panelJuego,BorderLayout.CENTER);
		
		panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.yellow);
		principal.add(panelAbajo,BorderLayout.SOUTH);
		
		btnReiniciar = new JButton("Reiniciar");
		panelAbajo.add(btnReiniciar);
		
		Thread hilo = new Thread(this);
		hilo.start();
		
		this.repaint();
		this.revalidate();
	}
	
	public class MyGraphics extends JComponent{
		
		private static final long serialVersionUID = 1L;
		
		MyGraphics(){
			setPreferredSize(new Dimension(300,300));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			g.fillRect(0,0,300,300);
			
			Rect r = new Rect();
			r.x=posi_x;
			r.y=posi_y;
			r.h=10;
			r.w=10;
			g.setColor(r.c);
			g.fillRect(r.x,r.y,r.h,r.w);
			
			Rect pared = new Rect();
			pared.x=200;
			pared.y=20;
			pared.h=50;
			pared.w=30;
			g.setColor(pared.c);
			g.fillRect(pared.x,pared.y,pared.w,pared.h);
			
			System.out.println(r.colision(pared));
			
		}
		
	}
	
	public class Rect{
		
		int x=0;
		int y=0;
		int w=0;
		int h=0;
		Color c = Color.black;
		
		public boolean colision(Rect r) {
			boolean resultado=false;
			
			if (this.x>x) {//INCOMPLETO
				resultado=true;
			}
		
		return resultado;
		}
	}


	@Override
	public void run() {
		
		panelJuego.add(new MyGraphics());
		
		while(true) {
			panelJuego.addKeyListener(new KeyListener() {
			
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
				
				}
			
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
				
				}
			
				@Override
				public void keyPressed(KeyEvent e) {
				
				
					if (e.getKeyCode()==87) {
						posi_y-=1;
					}
				
					if (e.getKeyCode()==83) {
						posi_y+=1;
					}
				
					if (e.getKeyCode()==68) {
						posi_x+=1;
					}
				
					if (e.getKeyCode()==65) {
						posi_x-=1;
					}
					
					panelJuego.repaint();
					panelJuego.revalidate();
				}
			});
			btnReiniciar.setFocusable(false);
			panelJuego.setFocusable(true);
			panelJuego.requestFocus();
			
			//HACE QUE EL BOTON NO LE QUITE EL FOCO A LA VENTANA Y SE LA DEVUELVE
			this.repaint();
			this.revalidate();
		}
	}
}
