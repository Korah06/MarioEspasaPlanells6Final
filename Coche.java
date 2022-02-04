import javax.swing.JOptionPane;

public class Coche {
	
	
	private int numCoches = 0;
	private int max_Coches = 5;

	private String matricula;
	private String marca = "SEAT";
	private String modelo = "ALTEA";
	private String color = "blanco";
	
	private String sn;
	
	private boolean technoSolar = false;
	private boolean bucle = true;
	
	private int kilometros = 0;
	private int numPuertas = 3;
	private int numPlazas = 5;
	
	
	private int opc = 0;
	
	
	
	
	
	public Coche() {
		
		
		
	}
	
	public Coche(String m) {
		
		matricula = m;
		
	}
	
	public Coche(int nPuertas, int nPlazas) {
		
		numPuertas = nPuertas;
		numPlazas = nPlazas;
		
	}
	
	public Coche(String mar, String mod, String col ) {
		
		color = col;
		marca = mar;
		modelo = mod;
		
	}
	
	public void setMatricula(String m) {
		matricula = m;
		System.out.print(matricula);
	}
	
	
	
	public void preguntaAvanzar() {
		
		sn = JOptionPane.showInputDialog("Quieres recorrer algun kilometro? s/n");
		
		if(sn.equals("s")) {
			kilometros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos quieres recorrer?"));
			
			avanzar(kilometros);
		}
		
	}
	
	public void preguntaPuertas() {
		numPuertas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas puertas quieres?"));
		comprobarNumPP();
	}
	
	public void preguntaModelo() {
		modelo = JOptionPane.showInputDialog("Escriba el modelo del vehiculo");
	}
	
	public void preguntaMarca() {
		marca = JOptionPane.showInputDialog("Escriba la marca del vehiculo");
	}
	
	public void preguntaPlazas() {
		numPlazas= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas plazas quieres?"));
		comprobarNumPP();
	}
	
	public void matricular() {
		matricula = JOptionPane.showInputDialog("Escriba la matricula del vehiculo");
	}
	
	public void avanzar(int k) {
		kilometros = kilometros + k;
	}
	
	public void comprobarNumPP(){
		
		while(bucle == true) {
		
		if(numPuertas>5 || numPuertas<3) {
			numPuertas=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero de puertas validas"));
		}else {
			bucle=false;
		}
		
	}
		bucle = true;
		
		while(bucle == true) {
		if(numPlazas>7) {
			numPlazas=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero de plazas validas"));
		}else {
			bucle=false;
		}
		}
		
	}
	
	public void preguntaTun() {
		
		sn = JOptionPane.showInputDialog("Quieres tunear el coche? s/n");
		
		if(sn.equals("s")) {
			
			sn = JOptionPane.showInputDialog("Quieres cambiar el color? s/n");
			
			if(sn.equals("s")) {
				
				color = JOptionPane.showInputDialog("Que color quieres?");
				tunear(color);
				
			}else {
				tunear();
			}
		}
		
		
		
		
	}
	
	
	public void tunear() {
		kilometros = 0;
		
		if(technoSolar == false) {
			
			technoSolar = true;
			
			JOptionPane.showMessageDialog(null,"Se ha instalado un panel solar y se ha dejado el cuentakilometros a 0");
			
		}else {
		
			JOptionPane.showMessageDialog(null,"Se ha dejado el cuentakilometros a 0");
			
		}
	}
	
	
	
	public void tunear(String col) {
		kilometros = 0;
		
		if(technoSolar == false) {
			
			technoSolar = true;
			
			JOptionPane.showMessageDialog(null,"Se ha instalado un panel solar, se ha dejado el cuentakilometros a 0 y se puesto el color " + col);
			
		}else {
			
			JOptionPane.showMessageDialog(null,"Se ha dejado el cuentakilometros a 0");
			
		}
	}
	
	
	public int getNumPuertas() {
		
		return numPuertas;
	}
	
	public int getNumPlazas() {
		
		return numPlazas;
	}
	
	public String getMatricula() {
		
		return matricula;
	}
	
	public boolean getTechnoSolar() {
		
		return technoSolar;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public int getKilometros() {
		
		return kilometros;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public String getModelo() {
		
		return modelo;
	}

}
