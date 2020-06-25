package ScibiszM;

public class Statek {
	
	//stan zbiornika zapas
	double FO;  //paliwo ciezkiego
	double MDO; //paliwa lekkie
	double zuzycie_FO_morze = 28; //zuzycie paliwa ciezkiego na morzu
	double zuzycie_FO_port = 1; // zuzycie paliwa w porcie
	
	double zuzycie_MDO_morze =2; //zuzycie paliwa lekkiego na morzu
	double zuzycie_MDO_port = 3.5; // zuzycie paliwa w porcie
	
	//ekonomiczna predkość dla statku wyrazona w wezłach
	final double eko_predkosc = 12.5;
	
	public Statek() {
		// TODO Auto-generated constructor stub
		//System.out.print(eko_predkosc);
	}

}
