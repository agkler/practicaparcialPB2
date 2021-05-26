package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private List<Vehiculo> convoy = new ArrayList<Vehiculo>();
	private List<Batalla> batallas = new ArrayList<Batalla>();

	
	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla nuevaBatalla = new Batalla(nombre, tipo, latitud, longitud);
		batallas.add(nuevaBatalla);

	}

	public Boolean agregarVehiculo(Vehiculo nuevo) {
		if (existe(nuevo)) {
			return false;

		} else {
			this.convoy.add(nuevo);
			return true;
		}
	}

	public Boolean existe(Vehiculo aBuscar) {
		for (Vehiculo actual : convoy) {
			if (actual.equals(aBuscar)) {
				return true;
			}
		}
		return false;
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public Batalla getBatalla(String nombre) {
		for (Batalla batallaActual : batallas) {
			if (batallaActual.getNombre().equals(nombre)) {
				return batallaActual;
			}
		}
		return null;
	}
	
	private Vehiculo getVehiculo(Integer codigoVehiculo) {
		for (Vehiculo vehiculoActual : convoy) {
			if (vehiculoActual.getNumeroDeVehiculo().equals(codigoVehiculo)) {
				return vehiculoActual;
			}
		}
		return null;
	}


	public Boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo) {
		Vehiculo aEnviar= getVehiculo(codigoVehiculo);
		Batalla aCombatir= getBatalla(nombreBatalla);
		
		if(aEnviar!=null && aCombatir!=null) {
			aCombatir.agregarVehiculo(aEnviar);
			return true;
		}
		
		return false;
	}

	
}
