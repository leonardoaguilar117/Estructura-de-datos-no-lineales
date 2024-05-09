import java.util.Objects;

/*Esta es una implementación de como podría ser usada una Hash code*/



public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Juan", 30);

        System.out.println("HashCode de p1: " + p1.hashCode());
        System.out.println("HashCode de p2: " + p2.hashCode());

        System.out.println("¿p1 es igual a p2? " + p1.equals(p2));
    }
}
