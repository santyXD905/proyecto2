package ar.edu.unju.edm.model;
//modelo 
public class Calculadora {
	//atributos		
	private int a,b;
			
	//una clase es un identificador general de muchos objetos
	//no hay una calculadora pero esta clase puede pasar por cualquiera
			
	//ctrl-barra
	//constructor: arma un tipo de calculadora
   public Calculadora() {
	// TODO Auto-generated constructor stub
}

  // source-> generate getter and setters
public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}


public int sumar() {
	return a+b;
}

//todas las clases son "hijas" de la clase object
// se pueden eredar metodos de objetc 
// source->tostring()
@Override
public String toString() {
	return "Calculadora [a=" + a + ", b=" + b + "]";
}

 //vienen de la clase object, sirven para verificar alteraciones
//source-> hasCode and equals
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Calculadora other = (Calculadora) obj;
	if (a != other.a)
		return false;
	if (b != other.b)
		return false;
	return true;
}
   
 
   
}
