package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Terrestre, Acuatico{

	private Double altura;
	private Double velocidad;
	private Double profundidad;

	public HidroAvion(Integer numeroDeVehiculo, String modelo) {
		super(numeroDeVehiculo, modelo);
		this.altura= 0.0;
		this.profundidad= 0.0;
		this.velocidad= 0.0;
	}

	public Double getAltura() {
		return this.altura;
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
