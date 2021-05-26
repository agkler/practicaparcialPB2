package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {

	private Double profundidad;

	public Destructor(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
