public class Hijo {

    private String nombre;
	private String apellido;
	private int edad;
	private Hijo hijo;

	public Hijo() {
	}

	public Hijo getHijo() {
		return hijo;
	}
	public void setHijo(Hijo hijo) {
		this.hijo = hijo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Hijo(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}