package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {
	private Integer numeroDeVehiculo;
	private String modelo;

	public Vehiculo(Integer numeroDeVehiculo, String modelo) {
		this.numeroDeVehiculo = numeroDeVehiculo;
		this.modelo = modelo;
	}

	public Integer getNumeroDeVehiculo() {
		return numeroDeVehiculo;
	}

	public void setNumeroDeVehiculo(Integer numeroDeVehiculo) {
		this.numeroDeVehiculo = numeroDeVehiculo;
	}
	
	public String getModelo() {
		return modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeVehiculo == null) ? 0 : numeroDeVehiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (numeroDeVehiculo == null) {
			if (other.numeroDeVehiculo != null)
				return false;
		} else if (!numeroDeVehiculo.equals(other.numeroDeVehiculo))
			return false;
		return true;
	}

	
	
	
	
	
}
