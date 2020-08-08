package ejercicio1;

public class personaRunner {

	public static void main(String[] args) {

		Persona p1 = new Persona();

		Persona p2 = new Persona(1523404, "Silvia", "Battaglia", 39);

		Persona p3 = new Persona(7549768, "Violeta", "Menchaca", 6, 'F', "Soltera");

		System.out.println("Persona 1" + p1.toString());
		System.out.println("Persona 2" + p2.toString());
		System.out.println("Persona 3" + p3.toString());

		p1.setCedula(6794218);
		p1.setNombre("Emma");
		p1.setApellido("Menchaca");
		p1.setEdad(10);
		p1.setSexo('F');
		p1.setEstadoCivil("Soltera");

		System.out.println("Cédula: " + p1.getCedula());
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Apellido: " + p1.getApellido());
		System.out.println("Edad: " + p1.getEdad());
		System.out.println("Sexo: " + p1.getSexo());
		System.out.println("Estado civil: " + p1.getEstadoCivil());

		String st1 = "Hola mundo";

		System.out.println(st1);

	}

}
