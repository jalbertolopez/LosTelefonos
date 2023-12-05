
public class Telefono {

	private String numeroTelefono;
	private String nombreCompania;
	
	public Telefono() {
		
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		
	}
	/**
	 * Alicia no documento este metodo
	 */
	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}
	
	public void recibirLlamada() {
		System.out.println("Llamda entrante");
	}
	public void hacerLlamada(String numero) {
		System.out.println("Llamdando a " + numero);
	}

	@Override
	public String toString() {
		return "Telefono Padre";
	}
	
	

}
