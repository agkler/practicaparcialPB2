package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad;

	public Tanque(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.velocidad= 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
