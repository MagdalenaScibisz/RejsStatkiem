package ScibiszM;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;

public class Trasa extends JFrame implements WindowListener {
	
	double odleglosc;  //dlugosc calkowitej trasy
	String port_p;	//port z ktorego wyruszamy
	String port_k;	//port docelow- odległość w milach morskich (Mm)y
		
		
		public Trasa (){
			this.addWindowListener(this);
		}
	public void trasa() {
		
		HashMap<String, Integer> odleglosci = new HashMap<>();

			odleglosci.put("Richard Bay",0);
			odleglosci.put("San Nicolas",4204);
			odleglosci.put("Victoria",2177);
			odleglosci.put("Philadelphia",4058);
			odleglosci.put("Montreal",1665);
			odleglosci.put("Wielkie Jeziora",200);
			odleglosci.put("Chicago",1100);
		
		for (Entry<String, Integer> entry : odleglosci.entrySet()) {
		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
        
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
