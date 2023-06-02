package controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Autores: Angie Barajas y Erika Monta�a
 * Fecha: Marzo 2023
 * TEMA DE PROYECTO: CONSULTA DE PROCESOS
 * Descripcion: segundo avance del proyecto 
 */

public class Conection {
	
	//Declaracion de Variables
	Connection con;

	//metodo contructor
	public Conection() {

	}

	//metodo para hacer conexion con mysql
	public Connection getConnection() {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_procesos?serverTimezone=UTC", "root", "Eri1104");
			System.out.println("conexion ok \n");
		}catch(Exception e) {
			System.out.println("error a la conexion  " + e);

		}	
		return con;
	}

	
}
