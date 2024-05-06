package Ejericicio_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class CrearArchivoVehiculos 
{
	//La página de venta de coches usados “www.cochesdeocasion.com” tiene un archivo
	//donde guarda toda la información de sus vehículos. Este archivo contiene objetos de la
	//clase Vehiculo, que tienen los siguientes atributos:
	
	//  public class Vehiculo
	// {
	//		private String matricula;
	//		private String modelo;
	//		private float precio;
	//		private LocalDate entradaEnExposicion;
	//
	//		...
	//	}
	
	//La política de esta página es que, si un coche lleva 5 días en exposición y no se ha
	//vendido, debe rebajarse su precio un 15%.
	//Realiza un programa que actualice los precios de todos los vehículos, teniendo en
	//cuenta su fecha de entrada en la exposición.
	
	//Nota: Suponemos que el archivo de vehículos está en perfectas condiciones, y que
	//todos los objetos tienen toda su información correcta. No será necesario realizar
	//ningún tratamiento de errores.

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
	{
		
		File archivo=new File("vehiculos.exp");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(archivo));
		oos.writeObject(new Vehiculo("6574FDU","OPEL INSIGNIA",15500,LocalDate.parse("2024-04-11")));
		oos.writeObject(new Vehiculo("8584DDZ", "CITROEN C3",9800,LocalDate.parse("2024-04-02")));
		oos.writeObject(new Vehiculo("5874FGM", "OPEL ASTRA",11000,LocalDate.parse("2024-04-02")));
		oos.writeObject(new Vehiculo("9984HET","MERCEDES C270",9500,LocalDate.parse("2024-04-03")));
		oos.writeObject(new Vehiculo("1254BNG","BMW X3",15800,LocalDate.parse("2024-04-06")));
		oos.writeObject(new Vehiculo("0934GXY","NISSAN QASHQAI2 2.0",12800,LocalDate.parse("2024-04-07")));
		
		
		oos.close();
		
	}
}
