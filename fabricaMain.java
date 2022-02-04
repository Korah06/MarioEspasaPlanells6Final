import javax.swing.JOptionPane;

public class fabricaMain {

	
	public static void caracteristicas(Coche coche) {
		
		JOptionPane.showMessageDialog(null,"El numero de matricula es "+ coche.getMatricula() +"\n La marca es " 
		+ coche.getMarca() + "\n El modelo es "+ coche.getModelo() +"\n el color es " + coche.getColor() + "\n El techo solar " 
		+ coche.getTechnoSolar() +"\n Ha recorrido " + coche.getKilometros() + " \n Tiene " + coche.getNumPuertas() + " puertas" 
		+ "\n Tiene " + coche.getNumPlazas() + " plazas");
		
		
	}
	
	public static int matAleatoria() {
		int  al = (int) Math.floor(Math.random() *100000);
		
		System.out.print(al);
		
		return al;
	}
	
	public static int buscaCocheMatricula(Coche coche[], String mat ) {
		int indice = 0;
		
		if(coche.length !=0) {
			if(indice == -1) {
				indice++;
			}
			
			while(coche[indice].getMatricula() != mat || indice < 5) {
				indice++;
				
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "No hay ningún coche introducido");
		}
		
		return indice;
		
		
		
	}
	

	public static void main(String[] args) {
		
		
		
		int numCoches = 0;
		int max_Coches = 5;
		int cochePos = 0;
		
		String matricula;
		
		int opcion = 0;
		
		String marca = "SEAT";
		String modelo = "ALTEA";
		String color = "blanco";
		
		boolean technoSolar = false;
		
		int kilometros = 0;
		int numPuertas = 3;
		int numPlazas = 5;
		
		
		
		Coche[] car = new Coche[max_Coches];
		
		
		boolean bucle = true;
		
		do {
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Fabricar coche (Conociendo la matrícula) \n 2.Fabricar coche (a partir del nº puertas y el nº de plazas) \n 3.Fabricar coche (a partir de la marca, el modelo y el color)\n 4.Fabricar ccoche (Cuando no tenemos ningún dato) \n 5.Tunear coches (pintándolo de color) \n 6.Tunear coche (sin pintarlo)\n 7.Avanzar kilometros \n 8.Mostrar caracteristicas de un coche \n 9.Salir del programa"));
			
			
			switch(opcion) {
			case 1: 
				
				if(numCoches!= max_Coches) {
					
					matricula=JOptionPane.showInputDialog("¿Que matricula quieres?");
					car[numCoches] = new Coche(matricula);
					car[numCoches].preguntaMarca();
					car[numCoches].preguntaModelo();
					car[numCoches].preguntaPlazas();
					car[numCoches].preguntaPuertas();
					car[numCoches].comprobarNumPP();
					
					numCoches++;
				}else {
					JOptionPane.showMessageDialog(null, "Ya hay suficientes coches creados");
				}
				
				
				
				break;
				
			case 2: 
				
				if(numCoches!= max_Coches) {
				numPuertas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas puertas quieres?"));
				numPlazas= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas plazas quieres?"));
				car[numCoches] = new Coche(numPuertas, numPlazas);
				car[numCoches].comprobarNumPP();
				
				car[numCoches].setMatricula(Integer.toString(matAleatoria()));
				JOptionPane.showMessageDialog(null, "La matricula del coche creado será: " + car[numCoches].getMatricula());
				
				car[numCoches].preguntaMarca();
				car[numCoches].preguntaModelo();
				
				numCoches++;
				
				}else {
					JOptionPane.showMessageDialog(null, "Ya hay suficientes coches creados");
				}
				
				break;
				
			case 3: 
				
				if(numCoches!= max_Coches) {
				marca=JOptionPane.showInputDialog("¿Que marca quieres?");
				modelo=JOptionPane.showInputDialog("¿Que modelo quieres?");
				color=JOptionPane.showInputDialog("¿Que color quieres?");
				car[numCoches] = new Coche(marca, modelo, color);
				
				car[numCoches].setMatricula(Integer.toString(matAleatoria()));
				JOptionPane.showMessageDialog(null, "La matricula del coche creado será: " + car[numCoches].getMatricula());
				
				car[numCoches].preguntaPlazas();
				car[numCoches].preguntaPuertas();
				car[numCoches].comprobarNumPP();
				
				numCoches++;
				
				}else {
					JOptionPane.showMessageDialog(null, "Ya hay suficientes coches creados");
				}
				
				break;
			
			case 4: 
				
				if(numCoches != max_Coches) {
				car[numCoches] = new Coche();
				
				car[numCoches].setMatricula(Integer.toString(matAleatoria()));
				JOptionPane.showMessageDialog(null, "La matricula del coche creado será: " + car[numCoches].getMatricula());
				
				car[numCoches].preguntaMarca();
				car[numCoches].preguntaModelo();
				car[numCoches].preguntaPlazas();
				car[numCoches].preguntaPuertas();
				car[numCoches].comprobarNumPP();
				
				numCoches++;
				
				}else {
					JOptionPane.showMessageDialog(null, "Ya hay suficientes coches creados");
				}
				
				break;
			
			case 5: 
				
				//He dejado asi este codigo porque no se porque me dice que es null
				//matricula = JOptionPane.showInputDialog("Escribe la matricula del coche que quieras modificar");
				//cochePos = buscaCocheMatricula(car, matricula);
				
				cochePos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 5 según el coche que quieras modificar"));
				
				color=JOptionPane.showInputDialog("¿Que color quieres?");
				car[cochePos].tunear(color);
				
				break;
			
			case 6: 
				
				//He dejado asi este codigo porque no se porque me dice que es null
				//matricula = JOptionPane.showInputDialog("Escribe la matricula del coche que quieras modificar");
				//cochePos = buscaCocheMatricula(car, matricula);
				
				cochePos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 5 según el coche que quieras modificar"));
				
				car[cochePos].tunear();
				
				break;
			
			
			
			case 7: 
				
				//He dejado asi este codigo porque no se porque me dice que es null
				//matricula = JOptionPane.showInputDialog("Escribe la matricula del coche que quieras modificar");
				//cochePos = buscaCocheMatricula(car, matricula);
				
				cochePos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 5 según el coche que quieras modificar"));
				
				kilometros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos quieres avanzar?"));
				
				car[cochePos].avanzar(kilometros);;
				
				break;
			
			case 8: 
				
				//He dejado asi este codigo porque no se porque me dice que es null
				//matricula = JOptionPane.showInputDialog("Escribe la matricula del coche que quieras modificar");
				//cochePos = buscaCocheMatricula(car, matricula);
				
				cochePos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero del 1 al 5 según el coche que quieras modificar"));
				
				caracteristicas(car[cochePos]);
				
				break;
			
			case 9: 
				
				bucle = false;	
				
				
				break;
			
			}
			
			
			
		}while(bucle == true);
		
		

	}

}
