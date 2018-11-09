import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Jeu extends JFrame implements ActionListener, IConfig, KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8333676766291948423L;
	private DrawMap map = new DrawMap();
	public static void main(String[] args) {
		
		
		Jeu n = new Jeu();
		
		

	}
	
	public Jeu() {
	     demarrage();
		  
		     
			      
	}
	public void demarrage() {
		   WindowListener l = new WindowAdapter() {
		          public void windowClosing(WindowEvent e){
		            System.exit(0);
		          }
		       };
		      addWindowListener(l);

		      JButton bouton = new JButton("Mon bouton");
		      JButton bouton2 = new JButton("Mon bouton2");
		      JPanel panneau = new JPanel();
		      panneau.add(bouton);
		      panneau.add(bouton2);
		     
		      setSize(LARGEUR_CARTE*NB_PIX_CASE+17,menuHeigh+HAUTEUR_CARTE*NB_PIX_CASE);
		     // setMinimumSize(new Dimension(LARGEUR_CARTE*NB_PIX_CASE+17,menuHeigh+HAUTEUR_CARTE*NB_PIX_CASE));
		      getContentPane().add(panneau);
		      map.getMap().add(new Hero(new PositionE(0,0)));
		     map.addKeyListener(this);
		     map.getMap().affiche();
		     getContentPane().add(map,1);
		     System.out.println("------------\n\n\n");
		     map.getMap().affiche();
		     getContentPane().add(map,1);
		     
		      //setSize(800, 800);
		      setVisible(true);
		     
		      
		      
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("test");
			map.setVisible(false);
			removeAll();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}