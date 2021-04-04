package ar.edu.unju.edm.model;

public class Cuenta {
	
	private int numCuenta,dni;
	private float saldo;
	
	//constructor que crea una instancia ?
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	//constructor que puede asignar valores?
	public Cuenta(int numCuenta, int dni, float saldo) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public void extraer(float monto) {
	       saldo=saldo-monto;
	}
	
	public void depositar(float monto) {
		saldo=saldo+monto;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
