public class CuentaBancaria {
	double noCuenta;
	float saldo; 
	Persona p = new Persona();
	
	public CuentaBancaria(double noCuenta, float saldo) {
		this.noCuenta = noCuenta;
		this.saldo = saldo;	
	}
	
	public void registrarUsuario(String nombre, int edad) {
		p.setNombre(nombre);
		p.setEdad(edad);
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void retirar(double saldo) {
		this.saldo -= saldo;
	}
	
	public void string() {
		System.out.println("Nombre del titular: "+p.getNombre()+ "Edad: "+p.getEdad()+
				"Saldo: "+this.saldo + "Numero de cuenta: "+ this.noCuenta
				);
	}
	
	
}
