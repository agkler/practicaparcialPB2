package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura;

	public Avion(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

}
