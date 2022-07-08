package ppal;

import modelo.Cuenta;
import modelo.Persona;
import modelo.CuentaJoven;

public class main {

	public static void main(String[] args) {
		
		Persona p1= new Persona("Andres",22,"30999999h");
		Persona p2= new Persona("Ana",21,"30111111x");
		
		CuentaJoven cuenta1 = new CuentaJoven(p1,3000,0.5,true);
		System.out.println("La cuenta es: "+ cuenta1);
		
		CuentaJoven cuenta2 = new CuentaJoven(p2,8000,0.5,false);
		System.out.println("\nLa cuenta es: "+ cuenta2);
		
		//System.out.println("\n"+p1.getEdad());
		//System.out.println("\n"+ p1.getNombre()+" es estudiante? "+cuenta1.isEstudiante());
		//System.out.println(p2.getNombre()+" es estudiante? "+cuenta2.isEstudiante());
		
		System.out.println("\nIntereses de "+ p1.getNombre()+" : "+cuenta1.calculaIntereses());
		System.out.println("Intereses de "+ p2.getNombre()+" : "+cuenta2.calculaIntereses());
	
		System.out.println(cuenta1.transferir(cuenta2, 100));
		
		System.out.println("\nLa cuenta nueva de " + p2.getNombre()+" es: "+ cuenta2);
		
	}

}
