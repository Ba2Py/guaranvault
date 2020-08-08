package ejercicio1;

public class Persona {

	int cedula;
	String nombre;
	String apellido;
	int edad;
	char sexo;
	String estadoCivil;

//Constructors

	// All initial values hard coded
	public Persona() {

		this.cedula = 1654786;
		this.nombre = "Luis";
		this.apellido = "Menchaca";
		this.edad = 39;
		this.sexo = 'M';
		this.estadoCivil = "Casado";
	}

	// Setting some values
	public Persona(int cedula, String nombre, String apellido, int edad) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estadoCivil = "soltero";
		this.sexo = 'M';
	}

	// Setting all values
	public Persona(int cedula, String nombre, String apellido, int edad, char sexo, String estadoCivil) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	// Getters and setters
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	// toString method

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + "]";
	}

}
