package ScibiszM;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Map.Entry;

import javax.swing.*;
;

public class Main extends JFrame implements WindowListener {
	String sIn; //deklaracja zmiennej 
	static JFrame okno;
	JPanel p;
	TextField data = new TextField();

	public Main() {
		// TODO Auto-generated constructor stub
		this.addWindowListener(this);
	new JFrame();
	//new JPanel();
	
	//wyglad Frame
	setSize(700, 700);
	setVisible(true);
	setTitle("Statek");
	
	//add(p);
	add(data);
	
	setLayout(null);
	//p.setBounds(10, 10, 400, 400);
	data.setSize(50, 50);
	
	data.setBounds(50, 50, 100, 30);
	
	}

	public static void main(String[] args) {
		/*Statek s = new Statek();
		Main o = new Main();
		Rejs r = new Rejs();
		*/
		Trasa t = new Trasa();
		t.trasa();
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
