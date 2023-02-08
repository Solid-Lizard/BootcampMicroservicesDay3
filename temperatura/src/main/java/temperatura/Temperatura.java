package temperatura;

public class Temperatura {
	private String eleccion;
	private double unidadesApasar = 0;
	
	public Temperatura(String eleccion, double unidadesApasar) {
		this.eleccion  = eleccion;
		this.unidadesApasar = unidadesApasar;
		if (eleccion == null) {
			this.eleccion = "farenheit";
		}
		
	}
	
	public String unidades() {
	
		double respuesta = 0;
		
		if (this.eleccion.equals("farenheit")) {

			respuesta = (unidadesApasar * 1.8) + 32;
			
		} else {
			this.eleccion = "celsius";
			respuesta = (unidadesApasar - 32) / 1.8;
			
		}
		
		return "Pasando: " + unidadesApasar + "  a "  + this.eleccion + " "+ "Resultado: " + Double.toString(respuesta) + " grados ";
	}
	
}
