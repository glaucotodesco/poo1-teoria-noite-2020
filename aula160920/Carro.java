package aula160920;

/**
 * Carro
 */
public class Carro {

	private int codigo;
	private double velocidadeKmPorHora;
	private double distanciaPercorridaEmMetros;
	private double tanque;
	private double consumo;
	

	public double getTanque() {
		return tanque;
	}

	public boolean abastecer(double combustivel) {
		if (combustivel < 0)
			return false;

		if (combustivel > 50)
			this.tanque = 50;
		else if (combustivel > 0)
			this.tanque = combustivel;

		return true;
	}

	public double mover(final int segundos) {
	
		if(tanque > 0){
			double dist = (velocidadeKmPorHora / 3.6) * (segundos);
			tanque -= (dist*0.001)/consumo;
			this.distanciaPercorridaEmMetros += dist;
			return dist;
		}
		else{
			return 0;
		}
		
	}

	

	public double getDistanciaPercorridaEmMetros() {
		return distanciaPercorridaEmMetros;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getVelocidadeKmPorHora() {
		return velocidadeKmPorHora;
	}

	public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
		this.velocidadeKmPorHora = velocidadeKmPorHora;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Carro [codigo=" + codigo + ", consumo=" + consumo + ", distanciaPercorridaEmMetros="
				+ distanciaPercorridaEmMetros + ", tanque=" + tanque + ", velocidadeKmPorHora=" + velocidadeKmPorHora
				+ "]";
	}



}