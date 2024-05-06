import java.util.*;

class Instrumento {
    private String nombre;
    private String codigo;
    private double precio;
    private String descripcion;

    public Instrumento(String nombre, String codigo, double precio, String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

class CatalogoHash {
    private Map<String, Instrumento> instrumentos;

    public CatalogoHash() {
        this.instrumentos = new HashMap<>();
    }

    // Método para agregar un nuevo instrumento al catálogo
    public void agregarInstrumento(String nombre, String codigo, double precio, String descripcion) {
        Instrumento instrumento = new Instrumento(nombre, codigo, precio, descripcion);
        instrumentos.put(codigo, instrumento);
    }

    // Método para buscar un instrumento por nombre
    public Instrumento buscarPorNombre(String nombre) {
        for (Instrumento instrumento : instrumentos.values()) {
            if (instrumento.getNombre().equalsIgnoreCase(nombre)) {
                return instrumento;
            }
        }
        return null; // Si no se encuentra el instrumento
    }

    // Método para buscar un instrumento por código
    public Instrumento buscarPorCodigo(String codigo) {
        return instrumentos.get(codigo);
    }

    // Método para editar la información de un instrumento
    public void editarInstrumento(String codigo, String nuevoNombre, double nuevoPrecio, String nuevaDescripcion) {
        Instrumento instrumento = instrumentos.get(codigo);
        if (instrumento != null) {
            instrumento.setNombre(nuevoNombre);
            instrumento.setPrecio(nuevoPrecio);
            instrumento.setDescripcion(nuevaDescripcion);
        } else {
            System.out.println("No se encontro el instrumento con el codigo " + codigo);
        }
    }

    // Método para eliminar un instrumento del catálogo
    public void eliminarInstrumento(String codigo) {
        instrumentos.remove(codigo);
    }

    // Método para mostrar una lista de todos los productos del catálogo ordenados por diferentes criterios
    public List<Instrumento> listarProductos(Comparator<Instrumento> comparator) {
        List<Instrumento> listaOrdenada = new ArrayList<>(instrumentos.values());
        Collections.sort(listaOrdenada, comparator);
        return listaOrdenada;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogoHash catalogo = new CatalogoHash();

        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Agregar instrumento");
            System.out.println("2. Buscar instrumento por nombre");
            System.out.println("3. Buscar instrumento por codigo");
            System.out.println("4. Editar instrumento");
            System.out.println("5. Eliminar instrumento");
            System.out.println("6. Mostrar lista de productos ordenados por nombre");
            System.out.println("7. Mostrar lista de productos ordenados por codigo");
            System.out.println("8. Mostrar lista de productos ordenados por precio");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del instrumento:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el codigo del instrumento:");
                    String codigo = scanner.nextLine();
                    System.out.println("Ingrese el precio del instrumento:");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese la descripcion del instrumento:");
                    String descripcion = scanner.nextLine();
                    catalogo.agregarInstrumento(nombre, codigo, precio, descripcion);
                    System.out.println("Instrumento agregado al catalogo.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del instrumento a buscar:");
                    String nombreBusqueda = scanner.nextLine();
                    Instrumento instrumentoBuscado = catalogo.buscarPorNombre(nombreBusqueda);
                    if (instrumentoBuscado != null) {
                        System.out.println("Instrumento encontrado:");
                        System.out.println("Nombre: " + instrumentoBuscado.getNombre());
                        System.out.println("Codigo: " + instrumentoBuscado.getCodigo());
                        System.out.println("Precio: " + instrumentoBuscado.getPrecio());
                        System.out.println("Descripcion: " + instrumentoBuscado.getDescripcion());
                    } else {
                        System.out.println("No se encontro el instrumento buscado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del instrumento a buscar:");
                    String codigoBusqueda = scanner.nextLine();
                    Instrumento instrumentoBuscadoCodigo = catalogo.buscarPorCodigo(codigoBusqueda);
                    if (instrumentoBuscadoCodigo != null) {
                        System.out.println("Instrumento encontrado:");
                        System.out.println("Nombre: " + instrumentoBuscadoCodigo.getNombre());
                        System.out.println("Codigo: " + instrumentoBuscadoCodigo.getCodigo());
                        System.out.println("Precio: " + instrumentoBuscadoCodigo.getPrecio());
                        System.out.println("Descripción: " + instrumentoBuscadoCodigo.getDescripcion());
                    } else {
                        System.out.println("No se encontro el instrumento buscado.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del instrumento a editar:");
                    String codigoEdicion = scanner.nextLine();
                    System.out.println("Ingrese el nuevo nombre del instrumento:");
                    String nuevoNombre = scanner.nextLine();
                    System.out.println("Ingrese el nuevo precio del instrumento:");
                    double nuevoPrecio = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese la nueva descripcion del instrumento:");
                    String nuevaDescripcion = scanner.nextLine();
                    catalogo.editarInstrumento(codigoEdicion, nuevoNombre, nuevoPrecio, nuevaDescripcion);
                    System.out.println("Información del instrumento actualizada.");
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del instrumento a eliminar:");
                    String codigoEliminacion = scanner.nextLine();
                    catalogo.eliminarInstrumento(codigoEliminacion);
                    System.out.println("Instrumento eliminado del catalogo.");
                    break;
                case 6:
                    List<Instrumento> listaOrdenadaPorNombre = catalogo.listarProductos(Comparator.comparing(Instrumento::getNombre));
                    System.out.println("Lista de productos ordenados por nombre:");
                    for (Instrumento instrumento : listaOrdenadaPorNombre) {
                        System.out.println(instrumento.getNombre() + " - " + instrumento.getPrecio());
                    }
                    break;
                case 7:
                    List<Instrumento> listaOrdenadaPorCodigo = catalogo.listarProductos(Comparator.comparing(Instrumento::getCodigo));
                    System.out.println("Lista de productos ordenados por codigo:");
                    for (Instrumento instrumento : listaOrdenadaPorCodigo) {
                        System.out.println(instrumento.getCodigo() + " - " + instrumento.getPrecio());
                    }
                    break;
                case 8:
                    List<Instrumento> listaOrdenadaPorPrecio = catalogo.listarProductos(Comparator.comparingDouble(Instrumento::getPrecio));
                    System.out.println("Lista de productos ordenados por precio:");
                    for (Instrumento instrumento : listaOrdenadaPorPrecio) {
                        System.out.println(instrumento.getNombre() + " - " + instrumento.getPrecio());
                    }
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
            }
        }
        scanner.close();
    }
}

