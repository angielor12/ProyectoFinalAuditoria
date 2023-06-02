package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Juez;
import model.Login;
import model.Personas;
import model.Procesos;

public class Control {
	//Declaracion de Variables

	//Objeto de la clase Login
	Login obLogin = new Login();
	//Objeto de la clase 
	Personas obPer = new Personas();
	//Objeto de la clase Procesos
	Procesos objP = new Procesos();
	//Objeto de la clase Juez
	Juez obJuez = new Juez();


	//Metodo constructor
	public Control() {

	}



	//Metodo de Login 
	public boolean IngresarUsuario(Login Usuario) throws SQLException {
		return obLogin.Ingresar_Login(Usuario);
	}

	//Método de Personas
	public boolean CrearPersona()throws SQLException {
		return obPer.Consultar_Personas() != null;
	}

	//Método de Juez
	public boolean CrearProcesoJ ()throws SQLException {
		return obJuez.Consultar_Juez() != null;
	}

	//Método de Procesos
	public boolean CrearProceso ()throws SQLException {
		return objP.ConsultarProcesos() != null;
	}

	//Método de Actualizar procesos
	public boolean ActualizarProceso ()throws SQLException {
		return objP.ConsultarProcesos() != null;
	}

	//Método de Consultar procesos
	public boolean ConsultarProceso ()throws SQLException {
		return objP.ConsultarProcesos() != null;
	}
	
	//Método de Consultar procesos el invitado
	public boolean ConsulProcesoI ()throws SQLException {
		return obPer.Consultar_Personas() != null;
	}
	
	//Método de Consultar procesos el invitado
	public boolean ConsultP ()throws SQLException {
		return obPer.Consultar_Personas() != null;
	}

}
