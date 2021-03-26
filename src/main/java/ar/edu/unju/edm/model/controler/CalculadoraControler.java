package ar.edu.unju.edm.model.controler;
//se importa el paquete del modelo de calculadoras
import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	//se debe crear un metodo
	public void resolverSuma() {
		
		int a=10,b=20;
		
		Calculadora nuevCalc = new Calculadora();
		
        nuevCalc.setA(a);
        nuevCalc.setB(b);
        
        
       System.out.println("el resultado es"+ nuevCalc.sumar());
        
	}
	
	
		
}
