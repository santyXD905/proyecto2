package ar.edu.unju.edm.model.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaControler {
	public void operarCuenta() {
		Cuenta nuevCuenta = new Cuenta();
		int NumCuenta=1,dni=456123;
		float saldo=50;
		Cuenta OtraCuenta = new Cuenta(NumCuenta,dni,saldo);
		
		System.out.println("nuevCuenta dni: " + nuevCuenta.getDni());
		System.out.println("OtraCuenta dni: " + OtraCuenta.getDni());
		
		System.out.println("saldo: "+ OtraCuenta.getSaldo());
		OtraCuenta.depositar(1000);
		System.out.println("saldo: "+ OtraCuenta.getSaldo());
		OtraCuenta.extraer(550);
		System.out.println("saldo: "+ OtraCuenta.getSaldo());
	}
}
