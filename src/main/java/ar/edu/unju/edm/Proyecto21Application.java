package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.controler.CalculadoraControler;
import ar.edu.unju.edm.model.controler.CuentaControler;

@SpringBootApplication
public class Proyecto21Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto21Application.class, args);
		CalculadoraControler nuevContr = new CalculadoraControler();
		nuevContr.resolverSuma();
		
		CuentaControler cuenta = new CuentaControler();
		cuenta.operarCuenta();
	}

}
