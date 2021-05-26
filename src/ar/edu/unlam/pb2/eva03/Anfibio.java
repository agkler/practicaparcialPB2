package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {
	private Double profundidad;
	private Double velocidad;

	public Anfibio(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
