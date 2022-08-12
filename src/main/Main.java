package main;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Trabajador trabajador = new Trabajador();
		
		cliente.setCredito("123");
		cliente.setEdad(25);
		cliente.setNombre("Andres");
		cliente.setTelefono("9 8765 4321");
		
		trabajador.setSalario(950);
		trabajador.setEdad(28);
		trabajador.setNombre("Martin");
		trabajador.setTelefono("1 2345 6789");
		
		System.out.println("Cliente:");
		System.out.println("Nombre: "+cliente.getNombre());
		System.out.println("Telefono: "+cliente.getTelefono());
		System.out.println("Edad: "+cliente.getEdad());
		System.out.println("Credito: "+cliente.getCredito());
		System.out.println("//////////////////////////////////////////////");
		System.out.println("Trabajador:");
		System.out.println("Nombre: " + trabajador.getNombre());
		System.out.println("Edad: " + trabajador.getEdad());
		System.out.println("Telefono: " + trabajador.getTelefono());
		System.out.println("Salario: "+trabajador.getSalario());
		
	}

}
