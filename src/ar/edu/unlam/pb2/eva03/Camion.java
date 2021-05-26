package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Camion(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.velocidad= 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}