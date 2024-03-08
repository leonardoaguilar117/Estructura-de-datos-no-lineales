public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public Persona() {
		
	}
	
	public void string() {
		System.out.println("Nombre: "+this.nombre+" Edad: "+this.edad+ " Sexo: "+this.sexo);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char sexo(char sexo) {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.edad = sexo;
	}
	
}
