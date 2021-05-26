package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	private List<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new ArrayList<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(List<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	public Boolean agregarVehiculo(Vehiculo nuevoVehiculo) {
		Boolean resultado = false;
		switch (this.tipo) {
		case AEREA:
			if (nuevoVehiculo instanceof Volador) {
				vehiculosEnLaBatalla.add(nuevoVehiculo);
				resultado = true;
			}
			break;
		case NAVAL:
			if (nuevoVehiculo instanceof Acuatico) {
				vehiculosEnLaBatalla.add(nuevoVehiculo);
				resultado = true;
			}
			break;
		case TERRESTRE:
			if (nuevoVehiculo instanceof Terrestre) {
				vehiculosEnLaBatalla.add(nuevoVehiculo);
				resultado = true;
			}
			break;
		default:
			resultado = false;

		}
		return resultado;

	}
	
}
